package com.less4task1Package;

public class Main {

    public static void main(String[] args) {

        Human studentIgor = new Human();
        Human studentOlga = new Human(25, 57, 178, "Olga", "Ivanova");

        studentIgor.setAge(21);
        studentIgor.setWeight(75.5f);
        studentIgor.setHeight(171.8f);
        studentIgor.setFirstName("Igor");
        studentIgor.setLastName("Petrov");

        System.out.println("We have two students :");
        System.out.println(studentIgor.getFirstName() + " " + studentIgor.getLastName() + ": " + studentIgor.getAge() + " years, " +
                            studentIgor.getHeight() + " height, " + studentIgor.getWeight() + " kg");

        System.out.println(studentOlga.getFirstName() + " " + studentOlga.getLastName() + ": " + studentOlga.getAge() + " years, " +
                studentOlga.getHeight() + " height, " + studentOlga.getWeight() + " kg");




    }
}
