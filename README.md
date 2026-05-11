# Dio_bootcamp_ExercJava
PetMachine


[Main.java](https://github.com/user-attachments/files/27605796/Main.java)
[Pet.java](https://github.com/user-attachments/files/27605797/Pet.java)
[PetMachine.java](https://github.com/user-attachments/files/27605798/PetMachine.java)


pacote org.example;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        var op = -1;

        fazer {
            System.out.println("\n============= MÁQUINA PET ===============");
            System.out.println("=========== Escolha uma das opções===========\n");
            System.out.println("1- Dar banho no pet");
            System.out.println("2- Abastecer a máquina com água");
            System.out.println("3- Abastecer a máquina com shampoo");
            System.out.println("4- Verificar água da máquina");
            System.out.println("5- Verificar shampoo da máquina");
            System.out.println("6- Verifique se tem pet na máquina");
            System.out.println("7- Colocar pet na máquina");
            System.out.println("8- Retirar pet da máquina");
            System.out.println("9- Limpar a máquina");
            System.out.println("0- Sair");

            op = scanner.nextInt();

            switch (op) {
                caso 1 -> petMachine.takeAshower();
                caso 2 -> definirÁgua();
                caso 3 -> definirShampoo();
                caso 4 -> verificarÁgua();
                caso 5 -> verificarShampoo();
                caso 6 -> verificarSeTemMáquinaDeAnimalDeEstimação();
                caso 7 -> setPetInPetMachine();
                caso 8 -> petMachine.removePet();
                caso 9 -> petMachine.wash();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } enquanto (op != 0);
    }

    privado estático void definirÁgua() {
        petMachine.addWater();
    }

    privado estático void definirShampoo() {
        petMachine.addShampoo();
    }

    privado estático void verificarÁgua() {
        var quantidade = petMachine.getWater();
        System.out.println("A máquina está com " + quantidade + " Litro(s) de água");
    }

    privado estático void verificarXampu() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está com " + quantidade + " Litro(s) de shampoo");
    }

    privado estático void verificarSeTemMáquinaDeAnimalDeEstimação() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    privado estático void definirPetNaMáquinaDePet() {
        var nome = "";
        enquanto (nome.isEmpty()) {
            System.out.println("Informe o nome do animal de estimação:");
            nome = scanner.next();
        }

        var pet = novo Pet(nome);
        petMachine.setPet(pet);
    }
}

package org.example;

public class Pet {
    private final String name;

    private boolean clean;

    public Pet(String name) {
        this.name = name;
        this.clean = false;
    }

    public String getName() {
        return name;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}

package org.example;

public class PetMachine {
    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeAshower() {
        if (this.pet == null) {
            System.out.println("Coloque o Pet na máquina para iniciar o Banho");
            return;
        }
        if (!clean) {
            System.out.println("A máquina está suja! Limpe-a antes de dar banho.");
            return;
        }
        if (water < 10 || shampoo < 2) {
            System.out.println("Recursos insuficientes (Água ou Shampoo)!");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O Pet " + pet.getName() + " está limpo!");
    }

    public void addWater() {
        if (water >= 30) {
            System.out.println("A capacidade de Água está no máximo");
            return;
        }
        water += 2;
        System.out.println("Água adicionada!!! Nível atual: " + water);
    }

    public void addShampoo() {
        if (shampoo >= 30) {
            System.out.println("A capacidade de Shampoo está no máximo");
            return;
        }
        shampoo += 2;
        System.out.println("Shampoo adicionado !!! Nível atual: " + shampoo);
    }

    public int getWater() { return water; }
    public int getShampoo() { return shampoo; }
    public boolean hasPet() { return pet != null; }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja. Limpe-a antes de colocar o Pet.");
            return;
        }
        if (hasPet()) {
            System.out.println("O Pet " + this.pet.getName() + " já está na máquina.");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }

    public void removePet() {
        if (pet == null) {
            System.out.println("Não há pet para remover.");
            return;
        }
        this.clean = !this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " foi retirado da máquina.");
        this.pet = null;
    }

    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa!");
    }
}
