package Gif;

import javax.swing.*;
import java.awt.*;

public class Gif {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Ваша анимация");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1000,500));
        frame.setMinimumSize(new Dimension(1000,500));
        JPanel image_panel = new JPanel();
        JLabel img = new JLabel();

        image_panel.add(img);
        frame.getContentPane().add(image_panel);
        frame.pack();
        frame.setVisible(true);

        while (true){
            for ( int i = 0; i < 16; i++){
                img.setIcon(new ImageIcon("src/Gif/"+i+".png"));
                Thread.sleep(100);
            }
        }
    }
}
