package main.java.kimMilyonerOlmakIster;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Sorular extends JFrame implements ActionListener{
    
    JButton next, submit, joker;
    public static int count = 0;
    public static int timer = 15;
    public static int verilen_soru = 0;
    public static int score = 0;
    JLabel qno, question;
    String s[][] = new String[10][5];
    String pa[][] = new String[10][1];
    String dc[][] = new String[10][2];
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;
    
    String username;
    Sorular(String username){
        this.username = username;
        setBounds(50, 10, 1440, 800);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1  = new ImageIcon("C:/Users/ismok/Documents/NetBeansProjects/Quiz/src/main/java/icons/quiz.jpg");
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1440, 392);
        add(l1);
        
        qno = new JLabel("");
        qno.setFont(new Font("Tahoma", Font.PLAIN, 16));
        qno.setBounds(50, 450, 40, 30);
        add(qno);
        
        question = new JLabel("");
        question.setFont(new Font("Tahoma", Font.PLAIN, 16));
        question.setBounds(80, 450, 1200, 30);
        add(question);
        
        s[0][0] = "Hollywood filmlerinde polislerin en fazla tükettikleri yiyecek ve içecek hangileri olur ?";
        s[0][1] = "Çig köfte ve ayran";
        s[0][2] = "Donut ve kahve";
        s[0][3] = "Leblebi ve boza";
        s[0][4] = "Lahmacun ve salgam";

        s[1][0] = "Halk arasında kullanılan ifadeye göre, çok fikir değiştiren insanların hangisi gibi renkten renge girdiği söylenir?";
        s[1][1] = "Şempanze gibi";
        s[1][2] = "Bizon gibi";
        s[1][3] = "Bukalemun gibi";
        s[1][4] = "Komodo ejderi gibi";

        s[2][0] = "Son pişmanlık şeklinde başlayan atasözünün devamı nasıldır?";
        s[2][1] = "Uzun sürmez";
        s[2][2] = "Hemen geçmez";
        s[2][3] = "Zarar vemez";
        s[2][4] = "Fayda etmez";

        s[3][0] = "Hangisi at üzerinde yapılan sporlardan biridir?";
        s[3][1] = "Golf";
        s[3][2] = "Körling";
        s[3][3] = "Polo";
        s[3][4] = "Ragbi";

        s[4][0] = "Güneş etrafındaki bir turu 88  dünya günü süren, Güneşe bakan yüzü aşırı sıcak, diger yüzü aşırı soguk olan, Güneşe en yakın gezegen hangisidir?";               
        s[4][1] = "Merkür";
        s[4][2] = "Venüs";
        s[4][3] = "Jüpiter";
        s[4][4] = "Satürn";

        s[5][0] = "Kült film söz kalıbında geçen kült kelimesinin Latince kökeninin anlamı nedir?";
        s[5][1] = "Yıkayıp parlatma";
        s[5][2] = "Ekip biçme";
        s[5][3] = "Ezip geçme";
        s[5][4] = "Silip süpürme";

        s[6][0] = "Karadeniz Ereglinin eski belediye baskanı Halil Posbıyık, kimin kendisine 2009 yılı programım dolu Halilcim ama 2010da eregliyi düsünüyorum dedigini duyurmustur?";
        s[6][1] = "Michael Jackson";
        s[6][2] = "Pele";
        s[6][3] = "Barack Obama";
        s[6][4] = "Mike Tyson";

        s[7][0] = "Hangisinin bir türünün dişleri dünyadaki bilinen en güçlü biyolojik madde olup karbonu elmasa çevirebilcek güçteki basınca bile dayanabilir?";
        s[7][1] = "Kerevit";
        s[7][2] = "Salyangoz";
        s[7][3] = "Komodo ejderi";
        s[7][4] = "Hipopotam";

        s[8][0] = "Heradotosa göre, Mısırlılar, ilk insanları arastırdıkları deneydeki cocuklar kimlerin dilinde bekos yani ekmek dedikleri için ilk insanları onlar olarak kabul etmislerdir?";
        s[8][1] = "Frigyalılar";
        s[8][2] = "Hititler";
        s[8][3] = "Sümerler";
        s[8][4] = "Lidyalılar";

        s[9][0] = "On kıtadan oluşan Istıklal Marşının tamamında, bu kelimelerden hangisi digerlerinden daha az geçer?";
        s[9][1] = "Vatan";
        s[9][2] = "Kan";
        s[9][3] = "Yurt";
        s[9][4] = "Toprak";
        
        dc[0][1] = "Donut ve kahve";
        dc[1][1] = "Bukalemun gibi";
        dc[2][1] = "Fayda etmez";
        dc[3][1] = "Polo";
        dc[4][1] = "Merkür";
        dc[5][1] = "Ekip biçme";
        dc[6][1] = "Michael Jackson";
        dc[7][1] = "Salyangoz";
        dc[8][1] = "Frigyalılar";
        dc[9][1] = "Toprak";
   

        opt1 = new JRadioButton("");
        opt1.setBounds(170, 520, 400, 30);
        opt1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        opt1.setBackground(Color.WHITE);
        add(opt1);
        
        opt2 = new JRadioButton("");
        opt2.setBounds(170, 560, 400, 30);
        opt2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        opt2.setBackground(Color.WHITE);
        add(opt2);
        
        opt3 = new JRadioButton("");
        opt3.setBounds(170, 600, 400, 30);
        opt3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        opt3.setBackground(Color.WHITE);
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setBounds(170, 640, 400, 30);
        opt4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        opt4.setBackground(Color.WHITE);
        add(opt4);
        
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);

        next = new JButton("Ileri");
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBounds(1200, 450, 200, 40);   
        next.setBackground(Color.GRAY);  
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        joker = new JButton("50-50 Jokeri");
        joker.setFont(new Font("Tahoma", Font.PLAIN, 22));
        joker.setBounds(1200, 530, 200, 40);   
        joker.setBackground(Color.GRAY);  
        joker.setForeground(Color.WHITE);
        joker.addActionListener(this);
        add(joker);
        
        submit = new JButton("Bitir");
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setEnabled(false);
        submit.setBounds(1200, 610, 200, 40);   
        submit.setBackground(Color.GRAY);  
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        start(0);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            verilen_soru = 1;
            if (options.getSelection() == null) {
                pa[count][0] = ""; 
            }else{
                pa[count][0] = options.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;  
            start(count);
        }else if(ae.getSource() == submit){
            verilen_soru = 1;
            if (options.getSelection() == null) {
                pa[count][0] = ""; 
            }else{
                pa[count][0] = options.getSelection().getActionCommand();
            }
                
            for (int i = 0; i< pa.length; i++) {
                if (pa[i][0].equals(dc[i][1])) {
                    score+=10;
                }else {
                    score+=0;
                }
            }
            this.setVisible(false);
            new Puan(username, score).setVisible(true);
            
        }else if(ae.getSource() == joker){
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9 ) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            joker.setEnabled(false);// ikinci defa jokere almamazı saglıyor
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        String time = timer + " - Saniyeniz Kaldı ";//15 saniye
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 16));
            
        if (timer > 0) {
            g.drawString(time, 1110, 450);
        }else{
            g.drawString("Süreniz Doldu !", 1110, 450);
        }
        
        timer--;//14 saniye
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if (verilen_soru == 1) {
            verilen_soru = 0;
            timer = 15;
        }else if (timer < 0) {
            timer = 15;
            
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) {
                if (options.getSelection() == null) {
                    pa[count][0] = ""; 
                }else{
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                
                for (int i = 0; i< pa.length; i++) {
                    if (pa[i][0].equals(dc[i][1])) {
                        score+=10;
                    }else {
                        score+=0;
                    }
                }
                this.setVisible(false);
                new Puan(username, score).setVisible(true);  
            }else{
                if (options.getSelection() == null) {
                    pa[count][0] = ""; 
                }else{
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }
    
    public void start(int count){
        qno.setText("" + (count+1) + ". ");
        question.setText(s[count][0]);
        opt1.setLabel(s[count][1]);
        opt1.setActionCommand(s[count][1]);
        opt2.setLabel(s[count][2]);
        opt2.setActionCommand(s[count][2]);
        opt3.setLabel(s[count][3]);
        opt3.setActionCommand(s[count][3]);
        opt4.setLabel(s[count][4]);
        opt4.setActionCommand(s[count][4]);
        options.clearSelection();
    }
    
    public static void main(String[] args) {
        new Sorular("").setVisible(true);
    }
}
