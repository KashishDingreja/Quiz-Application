package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    JButton start,back;
    String name;

    Rules(String name){
        this.name=name;

        JLabel heading = new JLabel(" WELCOME "+name+" TO QUIZ TEST ! ");
        heading.setBounds(150,100,700,30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD,28));
        heading.setForeground(new Color(148,87,235));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(90,130,700,350);
        rules.setFont(new Font("Times New Roman", Font.PLAIN,18));
        rules.setForeground(new Color(148,87,235));
        rules.setText(
                "<html>"+"1.Participation in the quiz is free and available to all users."+"<br><br>"+
                        "2.There are total 10 questions."+"<br><br>"+
                        "3.Each question is MCQ type."+"<br><br>"+
                        "4. You will be given 20 seconds to answer each question."+"<br><br>"+
                        "5.There is a help option provided which will erase 2 wrong options . But you can use it only ONCE."+"<br><br>"+
                        "6.Use of any other device such as phones or calculator is prohibited."+"<html>"
        );
        add(rules);

        back = new JButton("BACK");
        back.setBounds(300,500,100,30);
        back.setBackground(new Color(148,87,235));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("START");
        start.setBounds(450,500,100,30);
        start.setBackground(new Color(148,87,235));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bg.jpeg"));
        Image i = i1.getImage().getScaledInstance(875,675,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(-30,-25,875,675);
        add(image);

        setSize(800,650);
        setLocation(235,45);
        setUndecorated(true);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==start){
            setVisible(false);
            new Quiz(name);
        }else {
            setVisible(false);
            new Login();
        }

    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
