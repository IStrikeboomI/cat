package Strikeboom.cat;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class Gui {
    public Gui() {
        JFrame frame = new JFrame("cat");
        BufferedImage catImage = null;
        try {
            catImage = ImageIO.read(Gui.class.getResourceAsStream("images/cat"+
                    new Random().nextInt(23) + ".jpg"));
        } catch (IOException ignored) {}
        JPanel panel = new CatPanel(catImage);
        panel.setLayout(new GroupLayout(panel));
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setIconImage(catImage);
        frame.setSize(catImage.getWidth() / 3, catImage.getHeight() / 3);
        frame.setResizable(false);
        frame.setLocation(new Random().nextInt(Toolkit.getDefaultToolkit().getScreenSize().width / 2),new Random().nextInt(Toolkit.getDefaultToolkit().getScreenSize().height / 2));
        frame.setVisible(true);
    }
}
