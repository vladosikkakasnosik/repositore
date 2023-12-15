package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIText implements ActionListener {

    private JPanel test;
    private static JFrame JFRAME;
    private Player playerX;
    private Player player0;
    private int currentMove;
    private JLabel movieInfo;
    private JButton[] buttons = new JButton[9];

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Hello World!");
    }

    private void startGame() {
        playerX = new Player(Sides.X);
        player0 = new Player(Sides.O);
        currentMove = 0;
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("" + (i + 1));
            buttons[i].addActionListener(this);
        }
        movieInfo = new JLabel();
        movieInfo.setFont(new Font("Comic-sans", Font.BOLD, 15));
        movieInfo.setText("Зараз ход: X");
        movieInfo.setBounds(110, 15, 100, 30);
        JPanel gamePanel = new JPanel(new GridLayout(3, 3, 10, 10));
        for (JButton button : buttons) {
            gamePanel.add(button);
        }
        gamePanel.setBackground(Color.red);
    }

    public GUIText() { menuSetup();}

    private void menuSetup()
    {
        test = new JPanel(null);
        test.setPreferredSize(new Dimension(300, 300));
        JFRAME.add(test);
        JLabel maiMenuImage;
        JButton button1Button;
        maiMenuImage = new
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
