package io.github.froggers_revenge.testing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class GamePanel extends JPanel{

    //This was from a youtube video by RyiSnow. Im not sure what we want the size of the tiles to be or how to make it
    //fit with 1016x1024 so I am commenting this portion out. 
    /* 
    //Screen Settings
    final int originalTileSize = 16;    // 16x16 tile
    final int scale = 3;    

    final int tileSize = originalTileSize * scale;  
    final int maxScreenCol = 14;
    final int maxScreenRow = 14;
    final int screenWidth = tileSize * maxScreenCol;    //672 pixels
    final int screenHeight = tileSize * maxScreenRow;   //672 pixels
    */
    final int screenWidth = 1016;
    final int screenHeight = 1024;
    

    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);   //can improve rendering performance
        

    }



}
