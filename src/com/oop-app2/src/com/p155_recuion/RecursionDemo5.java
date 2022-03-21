package com.p155_recuion;

import java.io.File;

public class RecursionDemo5 {
    public static void main(String[] args) {


        //C:\Users\Work\Pictures
        File f1= new File("C:/Users/");

        searchFile(f1,"1.jpg");



    }
    /*

     */
    public  static void searchFile(File f1 ,String fileName){
        if(f1 !=null &&  f1.isDirectory()){

            File [] files =f1.listFiles();
//            System.out.println(files);
            if(files!=null&& f1.length()>0) {
                for (File file : files) {

                    if (file.isFile()) {
                        if (file.getName().contains(fileName)) {
                            System.out.println(file.getAbsolutePath());
                        }
                    } else {
                        searchFile(file, fileName);
                    }


                }
            }
        } else {
            System.out.println("file dont exits");
        }

    }
}
