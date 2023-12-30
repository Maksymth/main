import java.awt.*;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Drawing {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.YELLOW);
        Graphics g = new Graphics() {
            for (int i = 0; i < 30; i++) {
            g.drawString("There is no place like home", i * 5, 10 + i * 10);
        }
            panel.getGraphics();
            panel.setVisible(true);
            panel.setEnabled(true);
        };
        drawingOne(g);
    }

    private static void drawingOne(Graphics g) {
        for (int i = 0; i < 30; i++) {
            g.drawString("There is no place like home", i * 5, 10 + i * 10);
        }

    }
}
