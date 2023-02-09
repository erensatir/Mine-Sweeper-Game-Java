import javax.swing.*;
import java.awt.*;

public class MineSweeperGUI extends JPanel {
    private MineGrid grid;

  //  Icon mine1 = new ImageIcon("C:\\Users\\erens\\IdeaProjects\\project02\\cs102LastProject\\src\\mine.png");

    public MineSweeperGUI(int numRows, int numCols, int numMines){

        grid = new MineGrid(numRows,numCols,numMines);

        setBounds(0,60,1000,540);

        setLayout(new GridLayout(numRows,numCols));
        for (int i =0;i<numRows;i++){
            for (int j =0;j<numCols;j++){
                JButton button = new JButton();
                button.setBackground(Color.LIGHT_GRAY);

                    if (grid.getCellContent(i, j) == 1) {
                        button.setForeground(Color.BLUE);
                    }
                    if (grid.getCellContent(i, j) == 2) {
                        button.setForeground(Color.GREEN);
                    }
                    if (grid.getCellContent(i, j) == 3) {
                        button.setForeground(Color.RED);
                    }
                    if (grid.getCellContent(i, j) == 4) {
                        button.setForeground(Color.blue);
                    }


                add(button);
                button.addActionListener(new ButtonHandler(i,j,grid));
                button.addMouseListener(new MyMouseHandler(i,j,grid));

            }
        }

    }

}
