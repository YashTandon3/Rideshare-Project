import java.util.*;
public class Road {

    private Station[] stations;
    private ArrayList<Car> fleet = new ArrayList <Car>();

    private static final int NUMSTATIONS = 32;

    public Road(){
        stations = new Station [NUMSTATIONS];
        for(int i = 0; i<stations.length;i++){
            stations[i] = new Station(i);
        }
        fleet = new ArrayList<Car>();
    }


    public void populateStations(int numPeople){
        for(int i = 0; i<numPeople; i++){
            int start = (int)(Math.random() * NUMSTATIONS);
            int stop = (int)(Math.random() * NUMSTATIONS);
            stations[start].addPerson(new Person(stop, start));
        }
    }

    public void populateCars(int numCars){
        for(int i = 0; i<numCars; i++){
            int start = (int)(Math.random() * NUMSTATIONS);
            int stop = (int)(Math.random() * NUMSTATIONS);
            fleet.add(new Car(stop, start));
        }
    }

    public String toString(){
        String s = "Station:\n";
        for(Station st : stations){
            s+= st.toString();
            s+="\n";
        }
        s+= "Cars: \n";
        for(Car c: fleet){
            s+= c.toString();
            s+="\n";
        }
        return s;

    }

private void unloadSpecificCar(Car c){


    
        while(true){
        Person p = c.unload(); //this gives an eligible person to remove or null if nobody is available.
        if(p != null){
            int location = c.getLocation();
            stations[location].addPerson(p);
        } else{
            break;
            }
        } 
    }



public void loadSpecificCar(Car c){
    Station matchingStation = stations[c.getLocation()];
    while(true){
        if(c.hasRoom() == false){
            break;
        }

        //figure out if the car is going right
        if(c.getDirection() == true){
            Person x = matchingStation.nextRight();
            if(x == null){
                break;
            } else{
                c.addPassenger(x);
            }
        }

        else{
            Person x = matchingStation.nextLeft();
            if(x == null){
                break;
            } else{
                c.addPassenger(x);
            }
        }
        
    }


}
    //This is the big method that moves all cars, unloads and loads passengers for one tick

    public void move(){
        //unload all eligible people from cars
        for(Car c: fleet){
            unloadSpecificCar(c);
        }

        

        
        //load all people from stations to cars
        //going to be similar, but now looping through stations and putting in cars
        for(Car c: fleet){
            loadSpecificCar(c);
        }
        

       
        //move all the cars
        for(Car c : fleet){
            c.move();
        }
    }

    public int numComplete(){
        int sum = 0;
        for(Station st : stations){
            sum += st.completedCount();
        }
        return sum;
    }

    



}


