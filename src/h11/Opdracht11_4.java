package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_4 extends Applet {
    Label labelHeader = new Label("Tafel van 3:");
    String stringPrint = "1 x 3";
    int intOne = 3;
    int intTemp = 3;
    int y = 50;

    public void init() {
        setSize(100, 250);
        setLayout(null);
        labelHeader.setBounds(8, 10, 75, 25);
        add(labelHeader);
    }


    public void paint(Graphics g) {
        for (int i = 2; i < 12; i++) {
            g.drawString(stringPrint + " = " + intTemp, 10, y);
            y += 20;
            intTemp = intOne * i;

            if (intTemp == 6) {
                stringPrint = "2 x 3";
            }
            if (intTemp == 9) {
                stringPrint = "3 x 3";
            }
            if (intTemp == 12) {
                stringPrint = "4 x 3";
            }
            if (intTemp == 15) {
                stringPrint = "5 x 3";
            }
            if (intTemp == 18) {
                stringPrint = "6 x 3";
            }
            if (intTemp == 21) {
                stringPrint = "7 x 3";
            }
            if (intTemp == 24) {
                stringPrint = "8 x 3";
            }
            if (intTemp == 27) {
                stringPrint = "9 x 3";
            }
            if (intTemp == 30) {
                stringPrint = "10 x 3";
            }
        }
    }
}