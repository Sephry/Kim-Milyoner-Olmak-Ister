package main.java.kimMilyonerOlmakIster;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Kurallar extends JFrame implements ActionListener{
    
    JButton b1,b2;
    String username; 
    
    Kurallar(String username){
        this.username = username;
        setBounds(250, 100, 800, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
         
        JLabel l1 = new JLabel("Merhaba " + username + " Hosgeldiniz ");
        l1.setForeground(Color.GRAY);
        l1.setFont(new Font("Mongolian Baiti", Font.BOLD, 28));
        l1.setBounds(50, 20, 700, 30);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(20, 90, 600, 350);
        l2.setText(
            "<html>"+ 
                "1. Her Soru 10 puandır." + "<br><br>" +
                "2. 9 soru vardır." + "<br><br>" +
                "3. Yaryarıya joker hakkını kullanabilirsin." + "<br><br>" +
                "4. Hersoru için 15 saniye süren var." + "<br><br>" +
                "5. Geçtigin soruya geri dönemessin." + "<br><br>" +
                "6. Süren bittiginde otomatik soruyu geçecektir." + "<br><br>" +
                "7. Son soruda bitir tuşuna basıp bitirebilirsin." + "<br><br>" +               
            "<html>");
        add(l2);
        
        b1 = new JButton("Geri");
        b1.setBounds(250, 500, 100, 30);
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Başlat");
        b2.setBounds(400, 500, 100, 30);
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b1) {
            this.setVisible(false);
            new KimMilyoner().setVisible(true);
        }else if(ae.getSource() == b2){
            new Sorular(username).setVisible(true);
        }
    }
   
    public static void main(String[] args) {
        new Kurallar("");
    }
}
