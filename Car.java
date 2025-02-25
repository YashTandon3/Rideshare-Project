import java.util.*;
public class Car {
    //fields
    private int destination;
    private int currentLocation;
    private boolean direction;
    private ArrayList<Person> passengers;

    //constructors
    public Car(int myDestination, int start){
        destination = myDestination;
        currentLocation = start;
        direction = destination > currentLocation;
        passengers = new ArrayList<Person>();
    }
    
    public String toString(){
        return super.toString() + " Destination " + destination + " Current location: " + currentLocation + " Going right? " + direction + " Passegers: " + passengers;
    }

    public void addPassenger(Person p){
        if(passengers.size() >= 3){
            System.out.println("Error no Room");
        }else if(p.getDirection() != direction){
            System.out.println("Error: trying to add person in wrong direction!");

        }
            else{
            passengers.add(p);
        }
    }
    public boolean hasRoom(){
        return passengers.size()<3;
    }

}
