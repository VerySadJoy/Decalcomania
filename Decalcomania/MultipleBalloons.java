import acm.program.*;
import acm.graphics.*;
import java.awt.*;
 
public class MultipleBalloons extends GraphicsProgram {
   public void run() {
      GCompound eastbound = createBalloon();
      add(eastbound, 10, 10);
      GCompound westbound = createBalloon();
      add(westbound, getWidth() - westbound.getWidth() - 10, 60);
   
      while(westbound.getY() + westbound.getHeight() < getHeight()) {
         pause(40);
         eastbound.move( 1, 1);
         westbound.move(-1, 1);
      }
      while(eastbound.getY() + eastbound.getHeight() < getHeight()) {
         pause(40);
         eastbound.move( 1, 1);
      }
   }
 
   public GCompound createBalloon() {
      GOval ball = new GOval(0, 0, 50, 50);
      ball.setFilled(true);
      ball.setFillColor(new Color(208, 48, 48));
   
      GRect basket = new GRect(15, 60, 20, 10);
      basket.setFilled(true);
      basket.setFillColor(new Color(224, 192, 0));
   
      GCompound balloon = new GCompound();
      balloon.add(ball);
      balloon.add(new GLine(3, 39, 15, 60));
      balloon.add(new GLine(48, 39, 35, 60));
      balloon.add(basket);
      return balloon;
   }
}