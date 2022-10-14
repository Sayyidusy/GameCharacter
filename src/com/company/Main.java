package com.company;

public class Main {

    public static void main(String[] args) {

        GameCharacter raiden = new GameCharacter("Raiden",10,20);
        GameCharacter subZero = new GameCharacter("Sub-Zero",5,25);


        System.out.println("\n+++ Result from scenario games +++");
        //1
        System.out.println("1. Raiden Kick Sub-Zero");
        raiden.kick(subZero);
        //2
        System.out.println("2. Sub Zero did counter kick from Raiden");
        subZero.kick(raiden);
        //3
        System.out.println("3. Sub-Zero hit Raiden 3 times");
        for (int i = 0; i < 3; i++) {
            subZero.hit(subZero);
        }
        //4
        System.out.println("4. Raiden end fight with 4 times kick");
        for (int i = 0; i < 4; i++) {
            raiden.kick(subZero);
        }
        //4
        //show life point character after fight
        System.out.println("\n+++ Life Point +++");
        System.out.println("Raiden life point : " + raiden.getLifePoint());
        System.out.println("Sub-Zero life point : " + subZero.getLifePoint());

        //result character winner
        System.out.println("\n===== CHAMPION ===== ");
        if (raiden.getLifePoint() > subZero.getLifePoint()) {
            System.out.println("Raiden");
        } else {
            System.out.println("Sub-Zero");
        }
    }
}
