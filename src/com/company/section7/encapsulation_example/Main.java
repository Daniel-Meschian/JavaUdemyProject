package com.company.section7.encapsulation_example;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//
//        player.name = "Dani";
//        player.health = 20;
//        player.weapon = "bow";
//
//        int damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnchancedPlayer enchancedPlayer = new EnchancedPlayer("Dani", 50, "bow");
        System.out.println("Initial health is = "+ enchancedPlayer.getHealth());
    }
}
