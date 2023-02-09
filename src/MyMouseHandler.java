import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseHandler extends MouseAdapter {
    private int row, col;
    private MineGrid grid;

    //Teacher may not access to your icons check after everything is done
    //Icon mine = new ImageIcon("C:\\Users\\erens\\IdeaProjects\\project02\\cs102LastProject\\src\\mine.png");
    Icon flagpic = new ImageIcon("C:\\Users\\erens\\IdeaProjects\\project02\\cs102LastProject\\src\\flag.png");

    public MyMouseHandler(int row, int col, MineGrid grid) {
        this.row = row;
        this.col = col;
        this.grid = grid;
    }

    public void mouseClicked(MouseEvent event) {
        if (SwingUtilities.isRightMouseButton(event) && event.getSource() instanceof JButton) {

            if(((JButton)event.getSource()).getIcon() != null){
                ((JButton)event.getSource()).setIcon(null);
            }

            else if(((JButton)event.getSource()).getIcon()==null){
                ((JButton) event.getSource()).setIcon(flagpic);
                int flagCount = 0;
                for (int i = 0; i <grid.numberRows ; i++) {
                    for (int j = 0; j < grid.numberCols; j++) {
                        if (grid.isMINE(i, j)) {
                            flagCount++;
                        }
                    }
                }
               // if (flagCount == grid.allMines) {
                 //   JOptionPane.showMessageDialog(null, "You're a genius.");
                   // System.exit(0);
                //}
            }

        }
        //Trying to remove ButtonHandler because
        // mouseHandler is more productive for me


//            if (grid.isMINE(row, col) && (event.getSource() instanceof JButton) && SwingUtilities.isLeftMouseButton(event)) {
//                JButton button = (JButton) event.getSource();
//                button.setIcon(mine);
//                JOptionPane.showMessageDialog(null, "OOOPS!!");
//                System.exit(0);
//            }




//            if (SwingUtilities.isRightMouseButton(event) && event.getSource() instanceof JButton) {
//
//                    JButton button = (JButton) event.getSource();
//                    if (!grid.isFlagged()) {
//                        button.setIcon(flagpic);
//                        grid.setFlagged(true);
//                    }
//                    else {
//                        button.setIcon(null);
//                        grid.setFlagged(false);
//                    }
//            }


//            else {
//
//                if (event.getSource() instanceof JButton) {
//                    JButton button = (JButton) event.getSource();
//                    button.setText(String.valueOf(grid.getCellContent(row, col)));
//                }
//            }
        }
    }







