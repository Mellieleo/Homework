package Homework_8;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Window extends JFrame {

    public Window(String title) throws HeadlessException {
        super(title);
        setSize(1024, 720);
        setLocation(500, 300);
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem f1 = new JMenuItem("New Game...");
        f1.addActionListener(e -> {
            BullsandCows.fillArray();
            new Window(title);
            dispose();
        });
        JMenuItem f2 = new JMenuItem("Close");
        f2.addActionListener(e -> dispose());
        file.add(f1);
        file.add(f2);
        menuBar.add(file);
        Font headerFont = new Font("Arial", Font.BOLD, 34);
        Font headerFont2 = new Font("Arial", Font.ITALIC, 16);
        Font tableFont = new Font("Arial", Font.PLAIN, 32);
        Font chatFont = new Font("Arial", Font.ITALIC, 24);

        JPanel top = new JPanel();
        JTextArea header = new JTextArea();
        JTextArea header2 = new JTextArea();
        header.setBackground(Color.decode("#eeeeee"));
        header2.setBackground(Color.decode("#eeeeee"));
        header.setEditable(false);
        header2.setEditable(false);
        header.setText("Let's play bulls and cows!");
        header2.setText("Computer has proposed the 4-digit number.\nEnter the number with no duplicate digits below and hit Enter!");
        header.setFont(headerFont);
        header2.setFont(headerFont2);
        top.add(header);
        top.add(header2);
        header.setVisible(true);
        header2.setVisible(true);
        JPanel col1 = new JPanel();
        col1.setSize(100, 500);
        JPanel col2 = new JPanel();
        col2.setSize(100, 500);

        String[] columnNames = {"Your guess", "Bulls and Cows"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        JTable entered = new JTable(model);
        entered.setRowHeight(35);
        entered.setFont(tableFont);
        JScrollPane gameField = new JScrollPane(entered);
        entered.setFillsViewportHeight(true);

        JPanel text = new JPanel(new BorderLayout());
        JTextField nums = new JTextField();
        nums.setFont(chatFont);

        nums.addActionListener(event -> {
            Object[] row = new Object[2];
            row[0] = nums.getText();
            BullsandCows.gameplay(nums.getText());
            row[1] = ("Bulls: " + BullsandCows.bullsCount + ", Cows: " + BullsandCows.cowsCount);
            model.addRow(row);
            nums.setText("");
        });


        text.add(nums, BorderLayout.SOUTH);
        add(text);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(menuBar, BorderLayout.WEST);
        panel.add(top, BorderLayout.NORTH);
        panel.add(gameField, BorderLayout.CENTER);
        panel.add(col2, BorderLayout.EAST);
        panel.add(text, BorderLayout.SOUTH);
        add(panel);
        panel.setVisible(true);
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        BullsandCows.fillArray();
        new Window("Test Window");
    }
}
