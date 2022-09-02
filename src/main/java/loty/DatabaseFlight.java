package loty;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DatabaseFlight {

    Set<Flight> database = new HashSet<>();

    public DatabaseFlight() {
        database.add(new Flight("Warszawa","Barcelona"));
        database.add(new Flight("Barcelona","Paryz"));
        database.add(new Flight("Poznan","Lizbona"));
        database.add(new Flight("New York","Paryz"));
        database.add(new Flight("Warszawa","Oslo"));
    }


    public List<Flight> findFlightFrom(String city){
        return database.stream()
                .filter(s -> s.getDeparture().equals(city))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightTo(String city){
       return database.stream()
                .filter(s ->s.getArrival().equals(city))
                .collect(Collectors.toList());
    }


    public List<Flight> findFlightFromTo(String cityFrom, String cityTo){
        List<Flight> listFrom = findFlightFrom(cityFrom);
        List<Flight> listTo = findFlightTo(cityTo);
        List<Flight> result = new ArrayList<>();

        for (int i = 0; i<listFrom.size();i++){
            if(listFrom.get(i).getDeparture().equals(cityFrom) && listFrom.get(i).getArrival().equals(cityTo)){
                result.add(listFrom.get(i));
                return result;
            }
        }

        for(int i = 0; i<listFrom.size(); i++){
            for (int y = 0; y<listTo.size(); y++){
                if(listFrom.get(i).getArrival().equals(listTo.get(y).getDeparture())){
                    result.add(listFrom.get(i));
                    result.add(listTo.get(y));
                }
            }
        }
        return result;
    }
}
