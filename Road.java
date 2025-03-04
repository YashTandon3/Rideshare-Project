import java.util.*;
public class Road {

    private Station[] stations;
    private ArrayList<Car> fleet = new ArrayList <Car>();

    private static final int NUMSTATIONS = 10;

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
        String s = "Stationns:\n";
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









}
