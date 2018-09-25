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
public interface DrawableInterface {//calls the methods from both the ball and block classes 
    
    int getX();
    
    int getY();
    
    Point getLocation();
    
    void moveTo(int absX,int absY);
    
    void moveTo(Point whereToGo);
    
    void moveBy(int dX, int dY);
    
    void move ();
    
    double getXVelocity();
        
    double getYVelocity();
    
     void setVelocity(double dvX, double dvY); 
     
     Color getColor();
     
     void setColor(Color theColor );
     
     void draw(Graphics pen);
     
    
}
