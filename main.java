import javax.swing.*;
import java.awt.*;

public class main extends JPanel {

    // Holds bricks and balls seperately from JFrame main window
    static class GamePanel extends JPanel 
    {
         @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.fillOval(100, 100, 30, 30);
        }
    }

    public static void main(String[] args)
    {
        // Create main window
        JFrame mainWindow = new JFrame();
        mainWindow.setSize(750,1000); //width, height
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);

        // Create Borders

        // Create Brick Enviornment
        
        // Create First ball (Initial ball doesn't move until user moves)

        BallPanel ball = new BallPanel();
        mainWindow.add(ball);

        // run game loop
        while(true)
        {
        
        }
    }
}
