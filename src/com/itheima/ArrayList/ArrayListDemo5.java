package com.itheima.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<movie> list= new ArrayList<>();

        movie m1= new movie("shar",9.7,"robo");
        movie m2= new movie("king",9.6,"cheung");
        movie m3= new movie("Frist Gue",9.5,"tom");


        list.add(m1);
        list.add(m2);
        list.add(m3);

        for (int i = 0; i < list.size(); i++) {
            movie movie= list.get(i);
            System.out.println(movie.getMovieName()+movie.getMovieScore()+movie.getMovieAction());

        }



    }
}
