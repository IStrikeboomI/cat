package Strikeboom.cat;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

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
