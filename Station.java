import java.util.*;
public class Station {
    private ArrayList<Person> waitingLeft;
    private ArrayList<Person> waitingRight;
    private ArrayList<Person> completed;
    private int number;

    public Station (int myNumber){
        number = myNumber;
        waitingLeft = new ArrayList<Person>();
        waitingRight = new ArrayList<Person>();
        completed = new ArrayList<Person>();

    }

    public void addPerson(Person p){
        if(p.getDestination()==number){
            completed.add(p);
        }
        else if(p.getDirection()){
            waitingRight.add(p);
        }else{
            waitingLeft.add(p);
        }
    }



    public Person nextLeft(){
        if(waitingLeft.size()>0){
            return waitingRight.remove(0);
        } else{
            return null;
        }

    }

    public Person nextRight(){
        if(waitingRight.size()>0){
            return waitingRight.remove(0);
        } else{
            return null;
        }

    }

    public int completedCount(){
        return completed.size();
    }

    public int RightCount(){
        return waitingRight.size();
    }

    public int leftCount(){
        return waitingLeft.size();
    }

    public String toString(){
        String s = "Station: " + number + "\n";
        s+= "leftbound: " + leftCount() + "\n";
        s+= "Rightbound: " + RightCount() + "\n";
        s+= "Completed: " + completedCount() + "\n";
        return s;
    }
}
