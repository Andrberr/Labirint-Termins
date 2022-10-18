package Labirint;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Draw extends JFrame {

    private static final long serialVersionUID = 1L;

    public Draw(int[][] pat, int room) {

        setSize(new Dimension(800, 800));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                //1 этаж 1 кл = 20
                g2.setPaint(Color.black);
                BasicStroke pen1 = new BasicStroke(2);
                g2.setStroke(pen1);
                Shape rect = new Rectangle(20, 20, 480, 160);
                g2.setPaint(Color.orange);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(20, 20, 40, 40);
                g2.setPaint(Color.green);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(20, 140, 60, 40);
                g2.setPaint(Color.green);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(60, 20, 80, 40);
                g2.setPaint(Color.lightGray);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(140, 20, 360, 160);
                g2.setPaint(Color.orange);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(140, 60, 320, 80);
                g2.setPaint(Color.yellow);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);

                //2 этаж
                rect = new Rectangle(20, 240, 480, 160);
                g2.setPaint(Color.cyan);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(20, 240, 40, 40);
                g2.setPaint(Color.green);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(20, 360, 60, 40);
                g2.setPaint(Color.green);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(60, 240, 160, 60);
                g2.setPaint(Color.pink);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(220, 240, 220, 80);
                g2.setPaint(Color.magenta);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(440, 240, 60, 40);
                g2.setPaint(Color.lightGray);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(80, 340, 80, 60);
                g2.setPaint(Color.DARK_GRAY);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(160, 360, 340, 40);
                g2.setPaint(Color.gray);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);

                //3 этаж
                rect = new Rectangle(20, 460, 480, 160);
                g2.setPaint(Color.pink);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(20, 460, 40, 40);
                g2.setPaint(Color.green);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(20, 580, 60, 40);
                g2.setPaint(Color.green);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(60, 460, 220, 40);
                g2.setPaint(Color.cyan);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(280, 460, 220, 40);
                g2.setPaint(Color.cyan);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(140, 500, 260, 80);
                g2.setPaint(Color.pink);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(160, 500, 220, 60);
                g2.setPaint(Color.yellow);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(400, 500, 100, 120);
                g2.setPaint(Color.blue);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                rect = new Rectangle(100, 500, 40, 60);
                g2.setPaint(Color.lightGray);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                g2.drawString("X", 30, 63);
                g2.drawString("X", 136, 35);
                g2.drawString("X", 456, 90);
                g2.drawString("X", 47, 145);
                g2.drawString("X", 136, 155);

                g2.drawString("X", 30, 283);
                g2.drawString("X", 47, 365);
                g2.drawString("X", 216, 273);
                g2.drawString("X", 325, 325);
                g2.drawString("X", 436, 273);
                g2.drawString("X", 466, 283);
                g2.drawString("X", 496, 333);
                g2.drawString("X", 446, 363);
                g2.drawString("X", 156, 393);


                g2.drawString("X", 30, 503);
                g2.drawString("X", 47, 585);
                g2.drawString("X", 146, 503);
                g2.drawString("X", 386, 503);
                g2.drawString("X", 266, 566);
                g2.drawString("X", 266, 583);
                g2.drawString("X", 394, 610);
                g2.drawString("X", 96, 533);
                g2.drawString("X", 405, 502);
                g2.drawString("X", 395, 574);

                //names of rooms
                rect = new Rectangle(560, 50, 20, 20);
                g2.setPaint(Color.green);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                g2.drawString(" - Elevator", 590, 62);
                rect = new Rectangle(560, 80, 20, 20);
                g2.setPaint(Color.lightGray);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                g2.drawString(" - WC", 590, 92);
                rect = new Rectangle(560, 110, 20, 20);
                g2.setPaint(Color.yellow);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                g2.drawString(" - Living room", 590, 122);
                rect = new Rectangle(560, 140, 20, 20);
                g2.setPaint(Color.orange);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                g2.drawString(" - Hole", 590, 152);
                //////////

                rect = new Rectangle(560, 230, 20, 20);
                g2.setPaint(Color.green);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                g2.drawString(" - Elevator", 590, 242);
                rect = new Rectangle(560, 260, 20, 20);
                g2.setPaint(Color.pink);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                g2.drawString(" - Kitchen", 590, 272);
                rect = new Rectangle(560, 290, 20, 20);
                g2.setPaint(Color.magenta);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                g2.drawString(" - Dining room", 590, 302);
                rect = new Rectangle(560, 320, 20, 20);
                g2.setPaint(Color.GRAY);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                g2.drawString(" - Engine room", 590, 332);
                rect = new Rectangle(560, 350, 20, 20);
                g2.setPaint(Color.DARK_GRAY);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                g2.drawString(" - Medical center", 590, 362);
                rect = new Rectangle(560, 380, 20, 20);
                g2.setPaint(Color.cyan);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                g2.drawString(" - Hole", 590, 392);

                ///////
                rect = new Rectangle(560, 450, 20, 20);
                g2.setPaint(Color.green);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                g2.drawString(" - Elevator", 590, 462);
                rect = new Rectangle(560, 480, 20, 20);
                g2.setPaint(Color.lightGray);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                g2.drawString(" - WC", 590, 492);
                rect = new Rectangle(560, 510, 20, 20);
                g2.setPaint(Color.blue);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                g2.drawString(" - Laboratory", 590, 522);
                rect = new Rectangle(560, 540, 20, 20);
                g2.setPaint(Color.yellow);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                g2.drawString(" - Stockroom", 590, 552);
                rect = new Rectangle(560, 570, 20, 20);
                g2.setPaint(Color.cyan);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                g2.drawString(" - Bedroom", 590, 582);
                rect = new Rectangle(560, 600, 20, 20);
                g2.setPaint(Color.pink);
                g2.fill(rect);
                g2.setPaint(Color.black);
                g2.draw(rect);
                g2.drawString(" - Hole", 590, 612);
                g2.setPaint(Color.red);

                     int xk, yk;
                     for (int i = 0; i <= (pat).length - 1; i++) {
                         xk = pat[i][1] * 20;
                         yk = pat[i][0] * 20;
                         if (room==2) yk = yk+220;
                         else if (room==3) yk = yk+440;
                         rect = new Rectangle(xk + 7, yk + 7, 5, 5);
                         g2.fill(rect);
                         g2.draw(rect);
                         //1 1 20 20
                     }
                if (room==2 || room==3){
                  for (int i=8; i>=5; i--){
                      rect = new Rectangle(47, 20*i+7, 5, 5);
                      g2.fill(rect);
                      g2.draw(rect);
                  }
                    rect = new Rectangle(27, 107, 5, 5);
                    g2.fill(rect);
                    g2.draw(rect);
                    rect = new Rectangle(7, 107, 5, 5);
                    g2.fill(rect);
                    g2.draw(rect);

                }


            }
        };
        setTitle("My Shapes");
        this.getContentPane().add(p);
    }

}

