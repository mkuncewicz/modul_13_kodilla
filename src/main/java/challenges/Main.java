package challenges;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String collect = movieStore.getMovies().values().stream()
                .flatMap(s -> s.stream())
                .collect(Collectors.joining("!"));
        System.out.println(collect);

    }
}
