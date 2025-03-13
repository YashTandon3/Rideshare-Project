public class Tester {
    public static void main(String[] args) {
        Road r = new Road();
        r.populateCars(20);
        r.populateStations(50);
        System.out.println(r.toString());
        for(int i = 0; i<32; i++){
            r.move();
        }

     
 
        System.out.println(r.toString());
        System.out.println(r.numComplete());

        System.out.println("Percent completed with 20 cars: ");
        System.out.println((double)r.numComplete()/50*100);








        Road s = new Road();
        s.populateCars(40);
        s.populateStations(50);
        System.out.println(s.toString());
        for(int i = 0; i<32; i++){
            s.move();
        }

     
 
        System.out.println(s.toString());
        System.out.println("Number of people who have completed their trips in 40 cars: ");
        System.out.println(s.numComplete());

        System.out.println("Percent completed with 40 cars: ");
        System.out.println((double)s.numComplete()/50*100);



    }

    }

