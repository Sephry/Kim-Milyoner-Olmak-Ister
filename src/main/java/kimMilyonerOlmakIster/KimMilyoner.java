package main.java.kimMilyonerOlmakIster;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KimMilyoner extends JFrame implements ActionListener{
    
    JButton b1,b2;
    JTextField t1;
    
    KimMilyoner(){
        setBounds(150, 150, 1200, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1  = new ImageIcon("C:/Users/ismok/Documents/NetBeansProjects/Quiz/src/main/java/icons/login.jpg");
        JLabel ll = new JLabel(i1);
        ll.setBounds(0, 0, 600, 500);
        add(ll);
        
        JLabel l2 = new JLabel("Kim Milyoner Olmak İster");
        l2.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l2.setForeground(Color.GRAY);
        l2.setBounds(650, 60, 500, 45);
        add(l2);
        
        JLabel l3 = new JLabel("Isminizi Giriniz");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        l3.setForeground(Color.GRAY);
        l3.setBounds(810, 150, 300, 20);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(735, 200, 300, 25);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t1);
        
        b1 = new JButton("Kurallar");
        b1.setBounds(735, 270, 120, 25);
        b1.setBackground(Color.GRAY);    
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Çikis");
        b2.setBounds(915, 270, 120, 25);
        b2.setBackground(Color.GRAY);  
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b1) {
            String name = t1.getText();
            this.setVisible(false);
            new Kurallar(name);
        } else {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        new KimMilyoner();
    }
}
