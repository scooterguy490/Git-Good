package io.github.froggers_revenge.testing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class GamePanel extends JPanel{

    //original frogger resolution but scaled up by 3.5x
    final int screenWidth = 784;
    final int screenHeight = 896;
    
    

    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);   //can improve rendering performance
        
        

    }



}
