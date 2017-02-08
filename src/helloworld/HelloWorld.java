/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import processing.core.*;
/**
 *
 * @author Estudiante
 */
public class HelloWorld extends PApplet {

    public static void main (String [] args){
        PApplet.main("helloworld.HelloWorld");
    }
   public  void setup() {
  noStroke();
  rectMode(CENTER);
   }
       public void settings(){
  size(640, 360);
}

public void draw() {
 background(51); 
  fill(255, 204);
  rect(mouseX, height/2, mouseY/2+10, mouseY/2+10);
  fill(255, 204);
  int inverseX = width-mouseX;
  int inverseY = height-mouseY;
  rect(inverseX, height/2, (inverseY/2)+10, (inverseY/2)+10);
}
}

