package Strikeboom.cat;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class CatPanel extends JPanel {
    BufferedImage image;
    public CatPanel(BufferedImage file) {
        image = file;
        setSize(file.getWidth(),file.getHeight());
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, image.getWidth() / 3, image.getHeight() / 3, this);
    }
}
