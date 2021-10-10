package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class main {
  public static void main(String[] args) {

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(2);
    clock();
  }

  // Functions that return nothing have a return type of "void"
  public static String pluralize(String name, int count) {
    if (count == 0 || count > 1) {
      return name + "s";
    } else {
      return name;
    }
  }

  // This function has a return type of "int"
  public static void flipNHeads(int n) {
    int numOfFlips = 0;
    int inRow = 0;

    while (true) {
      double random = Math.random();

      if (random < 0.5) {
        System.out.println("tails");
        numOfFlips = numOfFlips + 1;
        inRow = 0;

      } else {
        inRow = inRow + 1;
        System.out.println("Heads");
        if (inRow == n) {

          numOfFlips = numOfFlips + 1;
          System.out.println("It took " + numOfFlips + " flips to flip " + n + " heads in a row.");
          break;
        } else {
          numOfFlips = numOfFlips + 1;
        }
      }

    }

  }

  public static void clock(){
    int currentSec=0;
    while(true){
      LocalDateTime now = LocalDateTime.now();
        
       
        
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        if(currentSec == now.getSecond()){

        }
        else {
            System.out.println(time);
            currentSec= now.getSecond();
        }
    }
}

}
