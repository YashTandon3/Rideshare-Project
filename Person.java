import java.util.*;
public class Person{
  //fields
  private boolean direction;
  private int destination;
  private int startLocation;
   //true for going right false for left

  //constructors
  public Person(int myD, int myStart){
      destination = myD;
      startLocation = myStart;
      direction = destination>startLocation;
  }

  //methods

  public int getDestination(){
      return destination;
  }

  public boolean getDirection(){
      return direction;
  }

  public int getStart(){
      return startLocation;
  }

  public String toString(){
      return super.toString() + " start:  "+ startLocation + " Destinstion: " + destination + " Going Right?: " + direction;
  }


    //No Way!
    //Hello!
}