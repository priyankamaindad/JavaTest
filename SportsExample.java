package com.demo2;


class Sports {
 // Method to play
 public void play() {
     System.out.println("Playing generic sports");
 }
}

//Subclass Football
class Football extends Sports {
 // Override play() method for Football

 public void play() {
     System.out.println("Playing football");
 }
}

//Subclass Basketball
class Basketball extends Sports {
 // Override play() method for Basketball
 
 public void play() {
     System.out.println("Playing basketball");
 }
}

//Subclass Rugby
class Rugby extends Sports {
 // Override play() method for Rugby

 public void play() {
     System.out.println("Playing rugby");
 }
}

//Main class 
public class SportsExample{
 public static void main(String[] args) {
     // Create instances of Football, Basketball, and Rugby
     Football football = new Football();
     Basketball basketball = new Basketball();
     Rugby rugby = new Rugby();

     // Call play() method for all
     football.play();
     basketball.play();
     rugby.play();
 }
}

