import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import java.util.*;

public class bbza{
static Board gameBoard = new Board(8,8);
   public static void main (String [] args){
      JFrame frame = new JFrame();    
      frame.setSize(400,400);     
      frame.setTitle("idk");    
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
      JCanvas canvas = new JCanvas(); 
      frame.add(canvas);
      frame.setVisible(true);
      canvas.setStroke(new BasicStroke(5));
      // image
      BufferedImage img1=canvas.loadImage("Psy.jpg"); 
      canvas.drawImage(img1,10,10);
      gameBoard.drawImag(img1, 5, 5);
   }
}