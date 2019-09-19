/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointapp;

//client class code
public class PointApp {
    public static void main(String[] args){
        //create three point objects
        Point p0= new Point();
        Point p1= new Point(7,2);
        Point p2 = new Point(4,3);
        
        // print each point and its distance from the origin
        System.out.println("p0 is" + p0.toString());
        System.out.println("distance from the origin: " + p0.distanceFromOrigin());
        
        
        System.out.println("p1 is" + p1.toString());
        System.out.println("distance from the origin: " + p1.distanceFromOrigin());
        
        System.out.println("p2 is" + p2.toString());
        System.out.println("distance from the origin: " + p2.distanceFromOrigin());
        
        //print out a strange calculation
        System.out.println("The sum of the points' x components is " + (p0.getX() + p1.getX() + p2.getX()));
        System.out.println("The sum of the points' x components is " + (p0.getY() + p1.getY() + p2.getY()));
        
        p0.setX(p0.getX()* 10);
        p1.setX(p1.getX()* 10);
        p2.setX(p2.getX()* 10);
    
        p0.setY(p0.getY()* -10);
        p1.setY(p1.getY()* -10);
        p2.setY(p2.getY()* -10);
        
        System.out.println("p0 is" + p0.toString());
        System.out.println("p1 is" + p1.toString()); 
        System.out.println("p2 is" + p2.toString());
        
        
    }

    


    
}
