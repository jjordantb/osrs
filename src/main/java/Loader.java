import jdk.internal.org.objectweb.asm.tree.ClassNode;
import loading.*;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class Loader {

    public static void main(String[] args) throws ClassNotFoundException, IOException, IllegalAccessException, InstantiationException {


        final JPanel gamePanel = new JPanel();
        gamePanel.setSize(new Dimension(765, 503));
        gamePanel.setBackground(Color.BLACK);

        final JFrame frame = new JFrame("OldSchool RuneScape");
        frame.getContentPane().setPreferredSize(new Dimension(765, 503));
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(gamePanel, BorderLayout.CENTER);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        final client Client = new client();

//        final File jar = new File("C:\\Users\\Parametric\\IdeaProjects\\osrs\\deob\\src\\main\\resources\\thisone.jar");
//        final HashMap<String, ClassNode> classNodeHashMap = new HashMap<>();
//        Util.load(new FileInputStream(jar), classNodeHashMap);
//        final ClassNodeLoader nodeLoader = new ClassNodeLoader(classNodeHashMap);
//        final Applet Client = (Applet) nodeLoader.loadClass("client").newInstance();

        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Client.resize(gamePanel.getWidth(), gamePanel.getHeight() - 5);
            }
        });
        Client.setSize(765, 503);
        gamePanel.add(Client);
        ConfigLoader loader = new ConfigLoader();
        loader.load(16);
        RSAppletStub stub = new RSAppletStub(loader.getConfigs());
        ((RSAppletContext) stub.getAppletContext()).setApplet(Client);
        Client.setStub(stub);
        Client.init();
        stub.setActive(true);
    }

}
