/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Ronil Soto
 */
public class DrawableStudent extends Textbook implements DrawableInterface{
    
    private double xVelocity;
    private double yVelocity;
    private int xPosition;
    private int yPosition;
    private Point location;
    private Color shirtColor;
    private DrawableTextbook myBook ;
 
    
public DrawableStudent()
{
    xPosition=30;
    yPosition=200;
    shirtColor=Color.red;
    myBook = new DrawableTextbook(175,400,10,0,Color.BLUE);
  
}
public DrawableStudent(int x,int y,Color color){
    xPosition = x;
    yPosition = y;
    shirtColor=color;
    myBook = new DrawableTextbook();
}
    

/**
 * 
 * @return xPosition
 */
public int getX(){
    
    return xPosition;
    
}
/**
 * 
 * @return yPosition
 */
public int getY(){
    
    return yPosition;
    
}
public Point getLocation(){
 return location;   
}
/**
 * 
 * @return xVelocity
 */
public double getXVelocity(){
  return xVelocity;
}
/**
 * 
 * @return yVeloity
 */
public double getYVelocity(){
    return yVelocity;
}

/**
 * 
 * @return shirtColor
 */
public Color getColor(){
    return shirtColor;
}
/**
 *  Set values for xVelocit and yVelocity
 * @param velX
 * @param velY 
 */
public void setVelocity(double dvX, double dvY){
    xVelocity = dvX;
    yVelocity = dvY;
    
}
/**
 * set th color of the block
 * @param theColor 
 */
public void setColor(Color theColor){
    shirtColor=theColor;
}
/**
 * 
 * @param absoluteX
 * @param absoluteY 
 */
public void moveTo(int absoluteX, int absoluteY){
    xPosition =absoluteX;
    yPosition=absoluteY;
}
public void moveTo(Point whereToGo){
    
}

/**
 * this method assign new values to the block of position adding their same position plus dx and dy
 * @param dx
 * @param dy 
 */
public void moveBy(int dx, int dy){
    xPosition+=dx;
    yPosition+=dy;
}
/**
 * this method move the position of the block
 */
public void move(){
   xPosition+=(int) xVelocity;
   yPosition+=(int) yVelocity;
}

     


    @Override    
    public void draw(Graphics pen)
    {             
        int BODY_WIDTH=150;
        int BODY_HEIGHT=150;
        
        pen.setColor(shirtColor);
        // Body
        pen.fillRect(xPosition, yPosition, BODY_WIDTH, BODY_HEIGHT);
        
        // Left Arm
        pen.fillRect(xPosition-40, yPosition, 40, BODY_HEIGHT + 50);
        // Right Arm
        pen.fillRect(xPosition+BODY_WIDTH, yPosition, 40, BODY_HEIGHT + 50);

        // Outline arms for visibility
        pen.setColor(Color.BLACK);
        pen.drawRect(xPosition-40, yPosition, 40, BODY_HEIGHT+ 50);
        pen.drawRect(xPosition+BODY_WIDTH, yPosition, 40, BODY_HEIGHT +50 );
        
        // Pants Top
        pen.setColor(Color.DARK_GRAY);
        pen.fillRect(xPosition, yPosition+BODY_HEIGHT, 150, 100);
        // Left Leg      
        pen.fillRect(xPosition, yPosition+BODY_HEIGHT+100, 50, 200);
        // Right Leg
        pen.fillRect(xPosition+100, yPosition+BODY_HEIGHT+100, 50, 200);
        
        // Draw Head
        pen.setColor(Color.ORANGE);
        pen.fillOval(xPosition+20, yPosition-125, 110, 150);
        
       myBook.move();
        myBook.draw(pen);
    }
public void tessBook(){
    myBook.setVelocity(10,0);
}
}