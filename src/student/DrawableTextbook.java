/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;


/**
 *
 * @author Ronil Soto
 */
public class DrawableTextbook extends Textbook implements DrawableInterface  {


    
    private int xPosition;
    private int yPosition;
    private double xVelocity;
    private double yVelocity;
    private Point location;
    private Color textbookColor;
    private String bookInitials;
 
public DrawableTextbook()
{
    xPosition=600+140;
    yPosition=400;
    textbookColor=Color.yellow;
  
}

public DrawableTextbook(int xPos, int yPos,int xVel,int yVel,Color bookColor){
    xPosition = xPos;
    yPosition = yPos;
    xVelocity = xVel;
    yVelocity=yVel;
    textbookColor=bookColor;
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
 * @return textbookColor
 */
public Color getColor(){
    return textbookColor;
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
    textbookColor=theColor;
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
     location=whereToGo;
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

public String getBookInitials(){
        String bookSubject=getSubject();
        String initials = bookSubject.substring(0,1);
        for (int i = 0; i<bookSubject.length()-1; i++)
        {
            if (bookSubject.charAt(i)==' ')
                   initials += bookSubject.substring(i+1, i+2);
        }
        return initials;
}
public Point locations(int x, int y){
    return location;
}
private void checkBounds(Graphics pen)
    {
                        
        Rectangle edgeRect = pen.getClipBounds();
        int rightEdge = (int)edgeRect.getMaxX();
        int bottomEdge = (int)edgeRect.getMaxY();
        
        
        if (getX() > rightEdge) {
            moveTo(rightEdge, getY());
            setVelocity(- getXVelocity(), getYVelocity());
        } 
        
        
        else if (getX() < 0) {
            setVelocity(- getXVelocity(), getYVelocity());
        }
        
        
        if (getY() > bottomEdge) {
            moveTo(getX(), bottomEdge);
            setVelocity(getXVelocity(), - getYVelocity());
        } 
        
        
        else if (getY() < 0) {
            setVelocity(getXVelocity(), - getYVelocity());
        }
    }
    
    
public void draw(Graphics pen)
 {
     
 checkBounds(pen);
 pen.setColor(textbookColor);
 pen.fillRect(xPosition, yPosition, 50, 70);
 pen.setColor(Color.DARK_GRAY);
 pen.setFont(new Font("Monospaced", Font.BOLD, 20));
 pen.drawString(getBookInitials(), xPosition, yPosition+50);

 } 
   
 }

    

