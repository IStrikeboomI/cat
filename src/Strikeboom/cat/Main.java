package Strikeboom.cat;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {
        while (true) {
            try {
                SwingUtilities.invokeAndWait(Gui::new);
            } catch (InterruptedException | InvocationTargetException ignored) {}
        }
    }
}
