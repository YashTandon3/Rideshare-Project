public class Tester {
    public static void main(String[] args) {
        Road r = new Road();
        System.out.println("Adding 20 Cars and 50 people...");
        r.populateCars(20);
        r.populateStations(50);
        System.out.println(r.toString());
        System.out.println("Moving each car 32 times...");
        for(int i = 0; i<32; i++){
            r.move();
        }

     
        System.out.println("Displaying Car Data and Station Data");
        System.out.println(r.toString());
        System.out.println("Number of Completed Passengers: ");
        System.out.println(r.numComplete());

        System.out.println("Percent completed with 20 cars: ");
        System.out.println((double)r.numComplete()/50*100);


        System.out.println(" ");





        Road s = new Road();
        s.populateCars(40);
        s.populateStations(50);
        System.out.println("Changing Number of cars to 40...");
        System.out.println("Moving each car 32 times...");
        System.out.println(s.toString());
        for(int i = 0; i<32; i++){
            s.move();
        }

     
        System.out.println("Displaying Car data and Station data: ");
        System.out.println(s.toString());
        System.out.println("Number of people who have completed their trips in 40 cars: ");
        System.out.println(s.numComplete());

        System.out.println("Percent completed with 40 cars: ");
        System.out.println((double)s.numComplete()/50*100);



    }

    }

