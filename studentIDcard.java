package com.internshala;
import java.util.Scanner;

public class studentIDcard {
    public static void main(String[] args) {
        String name;
        int age;
        String bloodGroup;


        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Enter your age");
        age = sc.nextInt();
        System.out.println("Enter your Blood Group");
        bloodGroup = sc.nextLine();

        System.out.println("-------------------------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Blood Group : " + bloodGroup);
        System.out.println("-------------------------");

        if (age>=20){
            System.out.println("Group : Red");
        }
        else if (age>=15 && age<20){
            System.out.println("Group : Blue");
        }
        else if (age>=10 && age<15){
            System.out.println("Group : Yellow");
        }



    }
}
