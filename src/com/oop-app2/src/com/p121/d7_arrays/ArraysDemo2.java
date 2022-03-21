package com.p121.d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {

        int [] ages ={34,12,42,23};

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));



        Integer [] ages1 ={34,12,42,23};
        Arrays.sort(ages1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){}

                return 0;
            }
        });
        System.out.println("--------------");

        Student [] students =new Student[3];
        students [0] =new Student("apple " ,23 ,175.5);
        students [1] =new Student("banana " ,18 ,185.5);
        students [2] =new Student("cat " ,20 ,195.5);


        System.out.println(students[1].getAge());
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {


                return o2.getAge()-o1.getAge();
            }
        });
        System.out.println(Arrays.toString(students));


    }

}