package com.itheima.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> stdInfo= new ArrayList<>();

        stdInfo.add(new Student(20180302,"abby",23,"1 Class "));
        stdInfo.add(new Student(20180303,"banana",23,"2 Class "));
        stdInfo.add(new Student(20180304,"cat",26,"3 Class "));
        stdInfo.add(new Student(20180305,"dog",26,"4 Class "));

        for (int i = 0; i < stdInfo.size(); i++) {
            Student stdTemp = stdInfo.get(i);
                System.out.println(stdTemp.getStdId()+"\t"+stdTemp.getStdName()+"\t"+ stdTemp.getStdAge()+"\t"+stdTemp.getStdClass());

            }



        while (true) {
            System.out.println("please input Student id to search");

            int inputId= sc.nextInt();
            Student stdTemp=getStudentByStudyId(stdInfo,inputId);
            if (stdTemp!=null) {
                System.out.println("stdId\tstdName\tstdAge\tstdClass");

                System.out.println(stdTemp.getStdId() + "\t" + stdTemp.getStdName() + "\t" + stdTemp.getStdAge() + "\t" + stdTemp.getStdClass());
            }else {
            System.out.println("no this id");}
        }
    }


    public static Student getStudentByStudyId(ArrayList<Student> stdInfo,int inputId){
        for (int i = 0; i < stdInfo.size(); i++) {
            Student stdTemp = stdInfo.get(i);
            if (stdTemp.getStdId()==inputId){
                return stdTemp;
            }


        }return null;


    }
}
