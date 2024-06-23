package com.pingwit.part_15.homework.task_1;

import java.util.Random;
import java.util.Scanner;

public class GladiatorBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter your gladiator's name: ");
        String playerName = scanner.next();

        String[] opponents = {"Ibrahim", "Avram", "Agnes"};
        String opponentName = opponents[random.nextInt(opponents.length)];

        System.out.println("The battle between: " + playerName + " " + "and " + opponentName + ", begins! ");

        System.out.println("Are you ready? Press Enter to begin the battle.");
        scanner.nextLine();

        int defaultHP = 4;
        int playerHP = defaultHP;
        int opponentHP = defaultHP;

        while (playerHP > 0 && opponentHP > 0) {
            try {
                System.out.println("Choose an attack: 1 - Head kick, 2 - Body kick, 3 - Leg kick");
                int playerAttack = getValidatedInput(scanner);
                int opponentBlock = random.nextInt(3) + 1;

                if (playerAttack != opponentBlock) {
                    opponentHP--;
                    System.out.println("Your strike has reached its target! Enemy health: " + opponentHP);
                } else {
                    System.out.println("The enemy successfully blocked your strike.");
                }

                if (opponentHP == 0) {
                    break;
                }

                int opponentAttack = random.nextInt(3) + 1;
                System.out.println("The enemy is attacking! Select defense: 1 - Upper block, 2 - Middle block, 3 - Lower block");
                int playerBlock = getValidatedInput(scanner);

                if (opponentAttack != playerBlock) {
                    playerHP--;
                    System.out.println("You missed a hit! Your health: " + playerHP);
                } else {
                    System.out.println("You successfully blocked an enemy strike.");
                }

            } catch (InvalidCommandException e) {
                System.out.println(e.getMessage());
            }
        }

        if (playerHP == 0) {
            System.out.println("You lost. The enemy won!");
        } else {
            System.out.println("You have won! The enemy is defeated.");
        }
    }

    private static int getValidatedInput(Scanner scanner) throws InvalidCommandException {
        int input;
        if (scanner.hasNextInt()) {
            input = scanner.nextInt();
            if (input < 1 || input > 3) {
                throw new InvalidCommandException("Wrong command. Try again.");
            }
        } else {
            scanner.next();
            throw new InvalidCommandException("Consume invalid input");
        }
        return input;
    }
}