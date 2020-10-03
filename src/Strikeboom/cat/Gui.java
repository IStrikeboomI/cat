package Strikeboom.cat;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

public class Gui {
    public Gui() {
        JFrame frame = new JFrame("cat");
        BufferedImage catImage = null;
        try {
            catImage = ImageIO.read(Gui.class.getResourceAsStream("images/cat"+
                    new Random().nextInt(10) + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JPanel panel = new CatPanel(catImage);
        panel.setLayout(new GroupLayout(panel));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setIconImage(catImage);
        frame.setSize(catImage.getWidth() / 3, catImage.getHeight() / 3);
        frame.setResizable(false);
        frame.setLocation(new Random().nextInt(Toolkit.getDefaultToolkit().getScreenSize().width / 2),new Random().nextInt(Toolkit.getDefaultToolkit().getScreenSize().height / 2));
        frame.setVisible(true);
    }
}
