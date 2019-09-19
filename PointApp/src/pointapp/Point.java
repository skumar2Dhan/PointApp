/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointapp;

//Point class code
//A Point object represents a pair of (x, y) coordinates.
public class Point {
    private int x;
    private int y;
     
    // constructs a new point at the origin (0,0)
    public Point(){
        x=0;
        y=0;
    
    }
    
    // constructs a new point with the given (x,y) location
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    
    }
    public String toString(){
        return"(" + x + " ," + y + ")";
        
    }
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    
    }
    public void setX(int x){
        this.x=x;
    
    }
    
    
    public void setY(int y){
        this.y=y;
    
    }
    //returns the distance between this point and (0,0)
    public double distanceFromOrigin(){
        return Math.sqrt(x* x+y * y);
    }
}
