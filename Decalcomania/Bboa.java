import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.geom.*;
import java.awt.font.*;
import java.awt.image.renderable.*;
import java.io.*;
import java.net.URL;
import java.util.*;
import java.text.*;
import java.awt.image.*;
import java.awt.print.*;
import java.util.regex.*;
import javax.swing.event.*;
import javax.swing.border.*;
import java.util.List;
import java.util.Arrays;
import javax.imageio.ImageIO;


/**  Bboa GUI for implementation with various games
 *   Author: Kirill Levin, Troy Vasiga, Chris Ingram
 */

public class Bboa extends JPanel
{
   private static final int X_DIM = 60;
   private static final int Y_DIM = 60;
   private static final int X_OFFSET = 30;
   private static final int Y_OFFSET = 30;
   private static final double MIN_SCALE = 0.25;
   private static final int GAP = 10;
   private static final int FONT_SIZE = 16;
   
   // Grid colours
   private static final Color GRID_COLOR_A = new Color(84,137,139);
   private static final Color GRID_COLOR_B = new Color(103,156,158);
   
   // Preset colours for pieces
   private static final Color[] COLOURS = 
      {Color.YELLOW, Color.BLUE, Color.CYAN, Color.GREEN, 
       Color.PINK, Color.WHITE, Color.RED, Color.ORANGE };
   
   // String used to indicate each colour
   private static final String[] COLOUR_NAMES = 
    {"yellow", "blue", "cyan", "green", "pink", "white", "red", "orange"};
   
   // Colour to use if a match is not found
   private static final Color DEFAULT_COLOUR = Color.BLACK;
   
   private Color[][] grid;
   private Coordinate lastClick;  // How the mouse handling thread communicates 
                                  // to the board where the last click occurred
   private String message = "";
   private int numLines = 0;
   private int[][] line = new int[4][100];  // maximum number of lines is 100
   private int columns, rows;
   
   private boolean first = true;
   private int originalWidth;
   private int originalHeight;
   private double scale;
   
   /** A constructor to build a 2D board.
    */
   public Bboa (int rows, int cols)
   {
      super( true );
      JFrame f = new JFrame( "Bboa game" );
      
      this.columns = cols;
      this.rows = rows;
      originalWidth = 2*X_OFFSET+X_DIM*cols;
      originalHeight = 2*Y_OFFSET+Y_DIM*rows+GAP+FONT_SIZE;
      
      this.setPreferredSize( new Dimension( originalWidth, originalHeight ) );
                                            
      f.setResizable(true);
   
      this.grid = new Color[cols][rows];
      
      this.addMouseListener(
            new MouseInputAdapter() 
            {
            /** A method that is called when the mouse is clicked
             */
               public void mouseClicked(MouseEvent e) 
               { 
                  int x = (int)e.getPoint().getX();
                  int y = (int)e.getPoint().getY();
               
               // We need to by synchronized to the parent class so we can wake
               // up any threads that might be waiting for us
                  synchronized(Bboa.this) 
                  {
                     int curX = (int)Math.round(X_OFFSET*scale);
                     int curY = (int)Math.round(Y_OFFSET*scale);
                     int nextX = (int)Math.round((X_OFFSET+X_DIM*grid.length)*scale);
                     int nextY = (int)Math.round((Y_OFFSET+Y_DIM*grid[0].length)*scale);
                  
                  // Subtract one from high end so clicks on the black edge
                  // don't yield a row or column outside of board because of
                  // the way the coordinate is calculated.
                     if (x >= curX && y >= curY && x < nextX && y < nextY)
                     {
                        lastClick = new Coordinate(y,x);
                     // Notify any threads that would be waiting for a mouse click
                        Bboa.this.notifyAll() ;
                     } /* if */
                  } /* synchronized */
               } /* mouseClicked */
            } /* anonymous MouseInputAdapater */
         );
      
      
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setContentPane( this );
      f.pack();
      f.setVisible(true);
   }
   
   /** A constructor to build a 1D board.
    */
   public Bboa (int cols)
   {
      this(1, cols);
   }
  
   private void paintText(Graphics g)
   {
      g.setColor( this.getBackground() );
      g.setFont(new Font(g.getFont().getFontName(), Font.ITALIC+Font.BOLD, (int)(Math.round(FONT_SIZE*scale))));
      
      int x = (int)Math.round(X_OFFSET*scale);
      int y = (int)Math.round((Y_OFFSET+Y_DIM*grid[0].length)*scale + GAP  ) ;
      
      g.fillRect(x,y, this.getSize().width, (int)Math.round(GAP+FONT_SIZE*scale) );
      g.setColor( Color.black );
      g.drawString(message, x, y + (int)Math.round(FONT_SIZE*scale));
   }
   
   private void paintGrid(Graphics g)
   {
      for (int i = 0; i < this.grid.length; i++)
      {
         for (int j = 0; j < this.grid[i].length; j++)
         {    
            if (i == 1)
               g.setColor(GRID_COLOR_A);
            else
               g.setColor(GRID_COLOR_B);
         }
      }
   }
   public void paintComponent( Graphics g ) 
   {
      this.setScale();
      this.paintGrid(g);
      this.drawLine(g);
      this.paintText(g);
   }
   
   public void setScale()
   {
      double width = (0.0+this.getSize().width) / this.originalWidth;
      double height = (0.0+this.getSize().height) / this.originalHeight;
      this.scale = Math.max( Math.min(width,height), MIN_SCALE ); 
   }
   
   /** Sets the message to be displayed under the board
    */
   public void displayMessage(String theMessage)
   {
      message = theMessage;
      this.repaint();
   }
   
   
   /** This method will save the value of the colour of the peg in a specific 
     * spot.  theColour is restricted to 
     *   "yellow", "blue", "cyan", "green", "pink", "white", "red", "orange"  
     * Otherwise the colour black will be used. 
     */
   public static void line(Bboa g){
      g.hdrawLine(4,0,4,4);
   }
   public static void main (String [] args){
      //paintGrid(g);
      Bboa g = new Bboa (5, 5);
      line(g);
      //g.hdrawLine(4,0,4,4);
   }
}
