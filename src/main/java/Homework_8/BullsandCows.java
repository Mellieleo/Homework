package Homework_8;

import javax.swing.*;
import java.util.Random;

public class BullsandCows {
    static int bullsCount;
    static int cowsCount;
    private static final int[] NUMBER = new int[4];
    private static final int[] GUESS = new int[4];

    static void fillArray() {
        Random rand = new Random();
        for (int i = 0; i < NUMBER.length; i++) {
            boolean found;
            int r;
            do {
                found = false;
                r = rand.nextInt(10);
                for (int k : NUMBER) {
                    if (k == r) {
                        found = true;
                        break;
                    }
                }
            } while (found);

            NUMBER[i] = r;
        }
    }

    static boolean validGuess(int[] move) {
        boolean duplicate = false;
        for (int i = 0; i < GUESS.length; i++) {
            for (int j = i + 1; j < GUESS.length; j++) {
                if (GUESS[i] == GUESS[j]) {
                    duplicate = true;
                }
            }
        }
        if (GUESS.length != 4) {
            duplicate = true;
        }
        return duplicate;
    }

    static void makeMove (String str) {
        String in = str;

        String[] move = in.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split("");

        try {
            for (int i = 0; i < move.length; i++) {
                GUESS[i] = Integer.parseInt(move[i]);
            }
        } catch (NumberFormatException exc) {
            JOptionPane.showMessageDialog(null,"This is not a number!","Error", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (ArrayIndexOutOfBoundsException exc) {
            JOptionPane.showMessageDialog(null,"Your number must be 4 digits long!","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }



    public static void gameplay(String entered) {


        while (true) {
           makeMove(entered);
            bullsCount = 0;
            cowsCount = 0;
            if (!validGuess(GUESS)) {
                for (int i = 0; i < GUESS.length && i < NUMBER.length; i++) {
                    if (NUMBER[i] == GUESS[i]) {
                        bullsCount++;
                    }
                }
                for (int i = 0; i < GUESS.length; i++) {
                    for (int x : NUMBER) {
                        if (x == GUESS[i] && NUMBER[i] != GUESS[i]) {
                            cowsCount++;
                        }
                    }
                }
                if (bullsCount == 4) {
                    JOptionPane.showMessageDialog(null, "You've won!", "Win", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                return;
            } else {
                JOptionPane.showMessageDialog(null,"Please enter 4 numbers from 0 to 9 without duplicate digits","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }

//    public static void main(String[] args) {
//        gameplay();
//    }
}
