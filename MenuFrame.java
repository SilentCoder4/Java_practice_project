//Wap to create a menu using the frame.
import javax.swing.*;
import java.awt.event.*;
public class MenuFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu, editMenu, helpMenu;
    JMenuItem openItem, saveItem, exitItem, copyItem, pasteItem, aboutItem;

    public MenuFrame() {
        setTitle("Menu Example");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        fileMenu.setMnemonic('F');
        editMenu.setMnemonic('E');
        helpMenu.setMnemonic('H');

        openItem = new JMenuItem("Open", new ImageIcon("open.png"));
        saveItem = new JMenuItem("Save", new ImageIcon("save.png"));
        exitItem = new JMenuItem("Exit", new ImageIcon("exit.png"));
        copyItem = new JMenuItem("Copy", new ImageIcon("copy.png"));
        pasteItem = new JMenuItem("Paste", new ImageIcon("paste.png"));
        aboutItem = new JMenuItem("About", new ImageIcon("info.png"));

        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        pasteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        aboutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));

        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);
        aboutItem.addActionListener(this);

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openItem) {
            JOptionPane.showMessageDialog(this, "Open selected");
        } else if (e.getSource() == saveItem) {
            JOptionPane.showMessageDialog(this, "Save selected");
        } else if (e.getSource() == exitItem) {
            System.exit(0);
        } else if (e.getSource() == copyItem) {
            JOptionPane.showMessageDialog(this, "Copy selected");
        } else if (e.getSource() == pasteItem) {
            JOptionPane.showMessageDialog(this, "Paste selected");
        } else if (e.getSource() == aboutItem) {
            JOptionPane.showMessageDialog(this, "About: Menu Example v2.0");
        }
    }

    public static void main(String[] args) {
        MenuFrame frame = new MenuFrame();
        frame.setVisible(true);
    }
}
