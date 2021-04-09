package Homework_4;

import java.util.Random;
import java.util.Scanner;

public class XOXO {
    private static final char DEFAULT = '_';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final int SIZE = 3;
    private static final char[][] FIELD = new char[SIZE][SIZE];

    static void initField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                FIELD[i][j] = DEFAULT;
            }
        }
    }

    static void printField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("|");
                System.out.print(FIELD[i][j]);
            }
            System.out.println("|");
        }
    }

    static boolean validCell(int x, int y) {
        boolean onField = x > 0 && x <= SIZE && y > 0 && y <= SIZE;
        return onField && FIELD[x - 1][y - 1] == DEFAULT;
    }

    static void makeMove(int x, int y, char value) {
        FIELD[x - 1][y - 1] = value;
    }

    static void compMove(int cx, int cy) {
        if (validCell(cx, cy)) {
            FIELD[cx - 1][cy - 1] = DOT_O;
        }
    }

    static int genRand() {
        Random rand = new Random();
        return rand.nextInt(SIZE) + 1;
    }

    static boolean ifWin(char winner) {
        for (int i = 0; i < SIZE; i++) {
            if (FIELD[i][0] == FIELD[i][1] && FIELD[i][1] == FIELD[i][2] && FIELD[i][0] != DEFAULT) {
                return true;
            }
        }
        for (int j = 0; j < SIZE; j++) {
            if (FIELD[0][j] == FIELD[1][j] && FIELD[1][j] == FIELD[2][j] && FIELD[0][j] != DEFAULT) {
                return true;
            }
        }
        if (FIELD[0][0] == FIELD[1][1] && FIELD[1][1] == FIELD[2][2] && FIELD[0][0] != DEFAULT) {
            return true;
        }
        return FIELD[2][0] == FIELD[1][1] && FIELD[1][1] == FIELD[0][2] && FIELD[2][0] != DEFAULT;
    }

    static boolean isTie() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (FIELD[i][j] == DEFAULT) {
                    return false;
                }
            }
        }
        return true;
    }

    static void tryAgain(Scanner in) {
        System.out.println("Press 1 and Enter to try again.");
        System.out.println("Press any other key and Enter to exit.");
        String choice = in.next();
        if (choice.equals("1")) {
            gameplay();
            return;
        }
        System.out.println("Thanks for playing!");
    }

    public static void gameplay() {
        initField();
        printField();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Make your move:");
            String[] move = in.nextLine().split(" ");
            if (move.length != 2) {
                System.out.println("Please enter 2 numbers from 1 to 3");
                continue;
            }
            try {
                int x = Integer.parseInt(move[0]);
                int y = Integer.parseInt(move[1]);
                if (validCell(x, y)) {
                    makeMove(x, y, DOT_X);
                    if (ifWin(DOT_X)) {
                        printField();
                        System.out.println("You've won! Congratulations!");
                        tryAgain(in);
                        break;
                    }
                    printField();
                    if (isTie()) {
                        System.out.println("It's a tie!");
                        tryAgain(in);
                        break;
                    }
                    System.out.println("Computer's move:");
                    int cx = genRand();
                    int cy = genRand();
                    while (!validCell(cx, cy)) {
                        cx = genRand();
                        cy = genRand();
                    }
                    compMove(cx, cy);
                    if (ifWin(DOT_O)) {
                        printField();
                        System.out.println("You've lost! Sorry.");
                        tryAgain(in);
                        break;
                    }
                    printField();
                } else {
                    System.out.println("This move is invalid. Try again.");
                }
            } catch (NumberFormatException exc) {
                System.out.println("This is not a number!");
            }
        }
    }

    public static void main(String[] args) {
        gameplay();
    }
}
