/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author Christian
 */
public class Geometry {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point();
        
        point1.setX(-5);
        point1.setY(-10);
        System.out.println(point1.getQuadrant());
        point1.displayPoint();
        point2.displayPoint();
        
        System.out.println(point1);
        
        System.out.println(point1.getDistance());
        
        System.out.println(point1.getDistance(point2));
        
        System.out.println(point1.getDistance(0,0));
        
        System.out.println(point1.getAngle());
    }
    
}
