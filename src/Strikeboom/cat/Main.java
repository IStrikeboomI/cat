package Strikeboom.cat;

import javax.swing.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        while (true) {
            try {
                SwingUtilities.invokeAndWait(Gui::new);
            } catch (InterruptedException | InvocationTargetException ignored) {}
        }
    }
}
