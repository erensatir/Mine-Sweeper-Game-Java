import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class topPanel extends JPanel {

    private JLabel lbl;
    private JButton emoji;
    private JLabel remaining;
    private MineGrid grid2;
    private Timer timerx;
    private int second,minute;
    private String ddSecond,ddMinute;
    public int flaggedMinesorCells = 10;// just to try



    Icon sadface = new ImageIcon("C:\\Users\\erens\\IdeaProjects\\project02\\cs102LastProject\\src\\sad.png");//"C:\\Users\\erens\\IdeaProjects\\SwingGUI\\src\\sad.png");
    Icon smiley = new ImageIcon("C:\\Users\\erens\\IdeaProjects\\project02\\cs102LastProject\\src\\happy.png");//"C:\\Users\\erens\\IdeaProjects\\SwingGUI\\src\\happy.png");

    DecimalFormat dformat = new DecimalFormat("00");

    Font font1 =new Font("Arial",Font.PLAIN,20);


    public topPanel(int numRows,int numCols,int numMines){
        grid2 = new MineGrid(numRows,numCols,numMines);

        setBackground(Color.GRAY);
        setBounds(0,0,1000,60);
        setLayout(new FlowLayout(FlowLayout.CENTER,250,10));

// Remaining mines
        remaining = new JLabel(numMines-flaggedMinesorCells+"");
        remaining.setFont(font1);
        add(remaining);


//EMOJİ

        emoji = new JButton();
        emoji.setIcon(smiley);
        emoji.setForeground(Color.yellow);
        emoji.setFont(font1);
        add(emoji);


//Timer
        lbl=new JLabel("");

        lbl.setText("05:00");
        lbl.setFont(font1);
        lbl.setForeground(Color.RED);
        add(lbl);

        lbl.setText("05:00");
        second = 0;
        minute=5;
        countdownTimer();
        timerx.start();

    }
    private void countdownTimer() {
        timerx = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second--;

                ddSecond = dformat.format(second);
                ddMinute = dformat.format(minute);
                lbl.setText(ddMinute + ":" + ddSecond);

                if (second == -1) {
                    second = 59;
                    minute--;
                    ddSecond = dformat.format(second);
                    ddMinute = dformat.format(minute);
                    lbl.setText(ddMinute + ":" + ddSecond);
                }
                if (minute == 0 && second == 0) {
                    timerx.stop();
                    String msg = "GAME OVER";
                    JOptionPane.showMessageDialog(null, msg);
                    System.exit(0);
                }
            }
        });
    }
}
