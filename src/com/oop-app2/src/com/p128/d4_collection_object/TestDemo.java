package com.p128.d4_collection_object;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo {
    public static void main(String[] args) {

        Collection<Movie> movies= new ArrayList<>();
        movies.add(new Movie("a",9.5,"lee"));
        movies.add(new Movie("b",8.5,"bee"));
        movies.add(new Movie("c",8.6,"cat"));


        System.out.println(movies);
        for (Movie movie : movies) {
            System.out.println("moive name "+movie.getName());
            System.out.println("moive score "+movie.getScore());
            System.out.println("action name "+movie.getActor());
        }


    }
}
