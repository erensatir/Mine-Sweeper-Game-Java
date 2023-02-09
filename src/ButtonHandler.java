import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {
    private int row, col;
    private MineGrid grid;

    Icon mine = new ImageIcon("C:\\Users\\erens\\IdeaProjects\\project02\\cs102LastProject\\src\\mine.png");

    public ButtonHandler(int x, int y, MineGrid g){
        row = x;
        col = y;
        grid = g;
    }
    public void actionPerformed(ActionEvent event){

        if (grid.isMINE(row,col) && event.getSource() instanceof JButton){
            JButton button = (JButton) event.getSource();
            button.setIcon(mine);
            JOptionPane.showMessageDialog(null, "OOOPS!!");

        }



        else{

            if (event.getSource() instanceof JButton ){
                JButton button = (JButton) event.getSource();
                   button.setText(String.valueOf(grid.getCellContent(row, col)));
               }
//            else if (grid.is0(row,col) && event.getSource() instanceof JButton ) {
//                JButton button1 = (JButton) event.getSource();
//
//                while (button1.getText().equals("0"); {
//                    JButton button = (JButton) event.getSource();
//                    grid.openNeigh0(row, col);
//                    button.setEnabled(false);
//                }
//            }
            }
          }


        }


