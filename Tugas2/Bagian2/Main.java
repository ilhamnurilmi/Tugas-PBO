package com.company;

public class Main {

    public static void main(String[] args) {
        GameCharacter raiden = new GameCharacter("Raiden", 10, 20);
        GameCharacter subZero = new GameCharacter("Sub Zero", 5, 25);
        System.out.println("Start");

        System.out.println("Raiden kicked Sub Zero");
        raiden.kick(subZero);
        System.out.println("Sub Zero counter-attack");
        subZero.kick(raiden);

        System.out.println("Sub zero 3 hit to raiden (3 combo)");
        for (int i=0; i<3; i++){
            subZero.hit(raiden);
        }

        System.out.println("Raiden 4 Kick to Sub Zero");
        System.out.println("Raiden end fiht with combo kick");
        for(int i=0; i<4; i++){
            raiden.kick(subZero);
        }

        System.out.println();
        System.out.println("Result");
        System.out.println("Raiden life point: " + raiden.getLifePoint());
        System.out.println("SubZero life point: " + subZero.getLifePoint());
        System.out.println();

        System.out.println("------FATALITY------");
        if(raiden.getLifePoint() > subZero.getLifePoint()){
            System.out.println("Raiden Win");
        }else{
            System.out.println("Sub Zero Win");
        }
    }
}
