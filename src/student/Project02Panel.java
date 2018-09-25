/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Ronil Soto
 */
public class Project02Panel  extends JPanel{
    
    
    DrawableInterface studentLeft;
    DrawableStudent studentRight;
    //Student pluto = new DrawableStudent();
    
    
    Project02Panel()
    {
       studentRight= new DrawableStudent(600,200,Color.green);
       studentLeft = new  DrawableStudent() ;
      

  
       
    }
      public void paintComponent(Graphics pen) 
    {  
        pen.setColor(Color.white);
        pen.fillRect(0, 0, 4000, 4000);
         new DrawableStudent().draw(pen);
        studentRight.draw(pen);
        studentLeft.draw(pen);

   
 
    }           
  public void playCatch() throws InterruptedException
    {
             double time = System.currentTimeMillis(); //crate a timer
             double stop = time+20000;//add 20 seg to the timer
             while(System.currentTimeMillis()<=stop){// is going to run during 20 seconds or 20000 millis
                 
                  // move each shape
           // check that the shape is inside the window
           // if not, move into the window and change the velocity
           

           
           
           // force redraw of window to draw balls in new locations
           // ** repaint calls paintComponent
           repaint(); 
           
           // sleep for n milliseconds so the animation doesn''t pass too fast
           Thread.sleep(10);
      
        // *** Fix this loop so that it only runs for 20 seconds ***
             }
             System.exit(0);
    }
    
}
