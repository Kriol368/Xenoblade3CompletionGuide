package xenoblade3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

/**
 * This CommandLineRunner fires off at runtime and boots up our GUI.
 */
@Component
public class Xenoblade3SwingApplicationCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        //This boots up the GUI.
        EventQueue.invokeLater(() -> JOptionPane.showMessageDialog(null, "FUNCIONA"));
    }
}
