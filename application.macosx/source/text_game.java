import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class text_game extends PApplet {

//Text Game
//Chavisa

PImage photo;
int step = 0;

PFont font;

public void setup(){
  
  photo = loadImage("start_game.jpg");
  font = createFont("Tammada.otf", 40);
}

public void draw(){
  background (254, 249, 238);
  image(photo, 0, 0);
  
  if(step == 0){
  fill(255);
  photo = loadImage("start_game.jpg");
  }
  
  if(key == ENTER && step == 0){
    step = 0;
    photo = loadImage("choose_cookie.jpg");
  }
  
  if(key == 'a' && step == 0){
    step = 1;
    photo = loadImage("water.jpg");  
  } 
  
  if(key == 'b' && step == 0){
    step = 1;
    photo = loadImage("orange.jpg");  
  } 
  
  if(key == 'c' && step == 0){
    step = 1;
    photo = loadImage("cola.jpg");  
  } 
  
  if(key == 'l' && step == 1){
    step = 3;
    photo = loadImage("survive.jpg");
  } 
  
  if(key == 'r' && step == 1){
    step = 2;
    photo = loadImage("ice.jpg");
  } 
  
  if(key == 'y' && step == 2){
    step = 3;
    photo = loadImage("survive.jpg");
  } 
  
  if(key == 'n' && step == 2){
    step = 3;
    photo = loadImage("die.jpg");
  } 
  
  if(key == ENTER && step == 3){
    step = 0;
    photo = loadImage("choose_cookie.jpg");
  }
}
  public void settings() {  size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "text_game" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
