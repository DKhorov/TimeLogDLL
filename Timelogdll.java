


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Timelogdll extends JPanel {
    private JLabel label;
    private int activeIndex = 0;
    private final int totalCircles = 25;
    private int totalSeconds;
    private Timer timer;

    public Timelogdll(int var1, int var2, int var3, int var4, int var5, int var6, String var7) {
        if (var7.equals("red")) {
            this.setBackground(new Color(237, 26, 26));
        } else if (var7.equals("yellow")) {
            this.setBackground(new Color(237, 195, 26));
        } else if (var7.equals("green")) {
            this.setBackground(new Color(47, 237, 26));
        } else if (var7.equals("white")) {
            this.setBackground(new Color(255, 255, 255));
        } else {
            this.setBackground(new Color(237, 89, 26));
        }

        this.setLayout((LayoutManager)null);
        this.setPreferredSize(new Dimension(var4, var5));
        this.label = new JLabel("00:00:00", 0);
        this.label.setForeground(Color.BLACK);
        this.label.setFont(new Font("Arial", 1, var6));
        this.add(this.label);
        this.totalSeconds = var1 * 3600 + var2 * 60 + var3;
        this.timer = new Timer(1000, (var1x) -> this.updateClock());
        this.updateClock();
        this.timer.start();
    }

    private void updateClock() {
        if (this.totalSeconds < 0) {
            this.timer.stop();
        } else {
            int var1 = this.totalSeconds / 3600;
            int var2 = this.totalSeconds % 3600 / 60;
            int var3 = this.totalSeconds % 60;
            this.label.setText(String.format("%02d:%02d:%02d", var1, var2, var3));
            this.activeIndex = this.totalSeconds % 25;
            --this.totalSeconds;
            this.repaint();
        }
    }

    public void doLayout() {
        int var1 = this.getHeight() / 2;
        short var2 = 200;
        byte var3 = 60;
        this.label.setBounds((this.getWidth() - var2) / 2, var1 - var3 / 2, var2, var3);
    }

    protected void paintComponent(Graphics var1) {
        super.paintComponent(var1);
        Graphics2D var2 = (Graphics2D)var1;
        var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int var3 = this.getWidth() / 2;
        int var4 = this.getHeight() / 2;
        int var5 = (int)((double)Math.min(this.getWidth(), this.getHeight()) * 0.4);
        int var6 = (int)((double)Math.min(this.getWidth(), this.getHeight()) * 0.06);

        for(int var7 = 0; var7 < 25; ++var7) {
            double var8 = Math.toRadians((double)var7 * 14.4 - (double)90.0F);
            int var10 = (int)((double)var3 + (double)var5 * Math.cos(var8)) - var6 / 2;
            int var11 = (int)((double)var4 + (double)var5 * Math.sin(var8)) - var6 / 2;
            var2.setColor(var7 == this.activeIndex ? Color.WHITE : Color.BLACK);
            var2.fillOval(var10, var11, var6, var6);
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame var0 = new JFrame("TimeLogPanel - Demo");
            var0.setDefaultCloseOperation(3);
            var0.add(new Timelogdll(0, 2, 5, 338, 315, 35, "green"));
            var0.pack();
            var0.setLocationRelativeTo((Component)null);
            var0.setVisible(true);
        });
    }
}
