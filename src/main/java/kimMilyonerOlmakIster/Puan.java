package main.java.kimMilyonerOlmakIster;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Puan extends JFrame implements ActionListener{

    Puan(String username, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1  = new ImageIcon("C:/Users/ismok/Documents/NetBeansProjects/Quiz/src/main/java/icons/score.jpg");
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(10, 200, 300 ,250);
        add(l1);
        
        JLabel l2 = new JLabel("Teşsekkürler "+ username);
        l2.setBounds(45, 30, 700, 30);
        l2.setFont(new Font("RALEWAY", Font.PLAIN, 26));
        add(l2);
        
        JLabel l3 = new JLabel("Puanınız "+ score);
        l3.setBounds(350, 200, 300, 30);
        l3.setFont(new Font("Jokerman", Font.PLAIN, 26));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);
        
        JButton b1 = new JButton("Tekrar Oyna");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(400, 270, 120, 30);
        add(b1);
    }
    
    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
        new KimMilyoner().setVisible(true);
    }
    
    public static void main(String[] args) {
        new Puan("", 0).setVisible(true);
    }  
    
}
