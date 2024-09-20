package utilities;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Utilities {
    private static int xMouse;
    private static int yMouse;
    
    public static final Color AZUL_FONDO = new Color(155, 179, 232);
    public static final Color AZUL_ACENTOS = new Color(1, 143, 166);
    public static final Color VERDE = new Color(193, 255, 114);
    public static final Color MORADO = new Color(94, 23, 235);
    
    public static void headerMousePressed(MouseEvent evt) {
        xMouse = evt.getX();
        yMouse = evt.getY();
    }
    
    public static void headerMouseDragged(MouseEvent evt, JFrame frame) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        frame.setLocation(x - xMouse, y - yMouse);
    }
    
    public static void exitApp() {
        System.exit(0);
    }
    
    public static void minimizeWindow(JFrame frame) {
        frame.setExtendedState(JFrame.ICONIFIED);
    }
    
    public static void changeColorOnMouseEnter(JPanel panel, JLabel label, Color panelColor, Color labelColor) {
        panel.setBackground(panelColor);
        label.setForeground(labelColor);
    }

    public static void changeColorOnMouseExit(JPanel panel, JLabel label, Color panelColor, Color labelColor) {
        panel.setBackground(panelColor);
        label.setForeground(labelColor);
    }
    
    public static void setBoldFont(JComponent component) {
        Font boldFont = component.getFont().deriveFont(Font.BOLD);
        component.setFont(boldFont);
    }

    public static void setPlainFont(JComponent component) {
        Font plainFont = component.getFont().deriveFont(Font.PLAIN);
        component.setFont(plainFont);
    }
}
