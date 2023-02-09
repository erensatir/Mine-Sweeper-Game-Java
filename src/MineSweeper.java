import javax.swing.*;

public class MineSweeper {
    //EN SON NUM_MINES = 100
    private static final int NUM_MINES = 10;
    //EN SON SIZE = 20
    private static final int SIZE = 20;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Mine Sweeper | # of mines: "+NUM_MINES);

        JMenuBar menubar= new JMenuBar();
        frame.setJMenuBar(menubar);

        JMenu file= new JMenu("Game");
        menubar.add(file);
        JMenuItem exit = new JMenuItem ("Exit");
        file.add(exit);
        JMenu help= new JMenu("Help");
        menubar.add(help);
        JMenuItem about = new JMenuItem ("About");
        help.add(about);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1020,665);

        frame.add(new topPanel(SIZE,SIZE,NUM_MINES));
        frame.add(new MineSweeperGUI(SIZE,SIZE,NUM_MINES));

        frame.setVisible(true);
        
    }
}
