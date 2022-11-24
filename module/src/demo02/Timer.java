package demo02;

import javax.swing.*;
import java.util.Calendar;

public class Timer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Watch");
        JLabel label = new JLabel("", JLabel.CENTER);
        frame.add(label);
        frame.setSize(400, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while (true) {
            Calendar calendar = Calendar.getInstance();
            label.setText(calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE)+ ":" + calendar.get(Calendar.SECOND));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
