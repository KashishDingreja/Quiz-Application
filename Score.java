package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame {

    Score(String name,int score){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/score.png"));
        Image i2 = i1.getImage().getScaledInstance(200,150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(75,250,200,150);
        add(image);

        JLabel heading = new JLabel("Thankyou "+ name +" for completing QUIZ TEST ! ");
        heading.setBounds(85,85,700,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,25));
        add(heading);

        JLabel Score = new JLabel("Your score is "+ score);
        Score.setBounds(350,200,700,30);
        Score.setFont(new Font("Tahoma",Font.BOLD,25));
        add(Score);

        JButton exit = new JButton("EXIT");
        exit.setBounds(380,300,120,30);
        exit.setBackground(new Color(148,87,235));
        exit.setForeground(Color.WHITE);
        add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/bg.jpeg"));
        Image i22 = i11.getImage().getScaledInstance(750,550, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel img = new JLabel(i33);
        img.setBounds(-15,-10,750,550);
        add(img);

        setSize(750,550);
        setLocation(300,75);
        setUndecorated(true);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Score("User",0);
    }
}
