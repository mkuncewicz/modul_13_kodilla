package loty;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        DatabaseFlight databaseFlight = new DatabaseFlight();

        System.out.println("1.");
        List<Flight> list1 = databaseFlight.findFlightFrom("Warszawa");
        System.out.println(list1);
        System.out.println("2.");
        List<Flight> list2 = databaseFlight.findFlightTo("Barcelona");
        System.out.println(list2);
        List<Flight> list3 = databaseFlight.findFlightFromTo("Warszawa", "Paryz");
        System.out.println("3.");
        System.out.println(list3);
        List<Flight> list4 = databaseFlight.findFlightFromTo("Poznan","Lizbona");
        System.out.println("4.");
        System.out.println(list4);

    }
}
