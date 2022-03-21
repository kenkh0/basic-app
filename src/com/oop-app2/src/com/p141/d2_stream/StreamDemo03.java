package com.p141.d2_stream;

import com.p128.d10_genericity.Stedent;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;



public class StreamDemo03 {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();

        list.add("AA");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("AE");
        list.add("AF");
        list.add("AF");

        list.stream().filter(s -> s.startsWith("A")).forEach(s -> System.out.println(s));

        list.stream().filter(s -> s.length()==2).forEach(s -> System.out.println(s));
        long size=list.stream().filter(s -> s.length()==2).count();
        System.out.println(size);
//        System.out.println(list);

        list.stream().filter(s-> s.startsWith("A")).limit(2).forEach(System.out::println);

        System.out.println("=+++++============");

        list.stream().filter(s-> s.startsWith("A")).skip(2).forEach(System.out::println);

        System.out.println("=+++++============");

        list.stream().map(s -> "ken"+s).forEach(System.out::println);

        list.stream().map(Student::new).forEach(System.out::println);

        Stream<String> s1= list.stream().filter(s -> s.startsWith("A"));
        Stream<String> s2= Stream.of("A","B");
        Stream<String> s3= Stream.concat(s1,s2);

        s3.forEach(System.out::println);

    }
}
