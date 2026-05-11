package org.example;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        var op = -1;

        do {
            System.out.println("\n============= PET-MACHINE ===============");
            System.out.println("=========== Escolha uma das opções===========\n");
            System.out.println("1- Dar banho no pet");
            System.out.println("2- Abastecer a máquina com água");
            System.out.println("3- Abastecer a máquina com shampoo");
            System.out.println("4- Verificar água da máquina");
            System.out.println("5- Verificar shampoo da máquina");
            System.out.println("6- Verificar se tem pet na máquina");
            System.out.println("7- Colocar pet na máquina");
            System.out.println("8- Retirar pet da máquina");
            System.out.println("9- Limpar a máquina");
            System.out.println("0- Sair");

            op = scanner.nextInt();

            switch (op) {
                case 1 -> petMachine.takeAshower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (op != 0);
    }

    private static void setWater() {
        petMachine.addWater();
    }

    private static void setShampoo() {
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A máquina está com " + amount + " Litro(s) de água");
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está com " + amount + " Litro(s) de shampoo");
    }

    private static void checkIfHasPetMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    private static void setPetInPetMachine() {
        var name = "";
        while (name.isEmpty()) {
            System.out.println("Informe o nome do pet:");
            name = scanner.next();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
    }
}