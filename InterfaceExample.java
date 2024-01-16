//2.	Write a Java program to create an interface Drawable with a method draw() that takes no arguments 
//and returns void. Create three classes Circle, Rectangle, and Triangle that implement the Drawable interface and override the draw() 
//method to draw their respective shapes.


package com.demo2;

//Drawable interface
interface Drawable {
 void draw();
}

//Circle class implementing Drawable interface
class Circle implements Drawable {

 public void draw() {
     System.out.println("Drawing a circle");
  
 }
}

//Rectangle class implementing Drawable interface
class Rectangle implements Drawable {

 public void draw() {
     System.out.println("Drawing a rectangle");
    
 }
}

//Triangle class implementing Drawable interface
class Triangle implements Drawable {

 public void draw() {
     System.out.println("Drawing a triangle");
   
 }
}

//Main class 
public class InterfaceExample {
 public static void main(String[] args) {
     // Create instances of Circle, Rectangle, and Triangle
     Circle c = new Circle();
     Rectangle rec = new Rectangle();
     Triangle tri = new Triangle();

     // Call draw() method for all
     c.draw();
     rec.draw();
     tri.draw();
 }
}
