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
