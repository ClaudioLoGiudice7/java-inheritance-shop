package org.lessons.java;

import java.util.Scanner;
public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto nel carrello!");

        System.out.print("Quanti prodotti vuoi inserire? ");
        int productsNumber = scanner.nextInt();
        scanner.nextLine();

        Prodotto[] cart = new Prodotto[productsNumber];

        for (int i = 0; i < productsNumber; i++) {
            System.out.println("Prodotto " + (i + 1));
            System.out.print("\nInserisci il nome del prodotto: ");
            String name = scanner.nextLine();

            System.out.print("\nInserisci la descrizione: ");
            String description = scanner.nextLine();

            System.out.print("\nInserisci il prezzo: ");
            double price = scanner.nextDouble();

            System.out.print("\nInserisci l'IVA: ");
            double iva = scanner.nextDouble();

            System.out.print("\nSeleziona il tipo di prodotto (1 = Smartphone, 2 = Televisori, 3 = Cuffie): ");
            int productType = scanner.nextInt();
            scanner.nextLine();

            switch (productType) {
                case 1:
                    System.out.print("\nInserisci il codice IMEI: ");
                    String imei = scanner.nextLine();

                    System.out.print("\nInserisci la quantità di memoria: ");
                    int memory = scanner.nextInt();
                    scanner.nextLine();

                    cart[i] = new Smartphone(name, description, price, iva, imei, memory);
                    break;
                case 2:
                    System.out.print("\nInserisci le dimensioni: ");
                    double dimensions = scanner.nextDouble();

                    System.out.print("\nIl televisore è smart? (true o false) ");
                    boolean smart = scanner.nextBoolean();
                    scanner.nextLine();

                    cart[i] = new Televisori(name, description, price, iva, dimensions, smart);
                    break;
                case 3:
                    System.out.print("\nInserisci il colore: ");
                    String colour = scanner.nextLine();

                    System.out.print("\nLe cuffie sono wireless? (true o false) ");
                    boolean wireless = scanner.nextBoolean();

                    cart[i] = new Cuffie(name, description, price, iva, colour, wireless);
                    break;
                default:
                    System.out.println("\nTipo di prodotto non valido!");
                    i--;
                    break;
            }
        }

        System.out.println("\nRiepilogo del carrello:");

        for (Prodotto prodotto : cart) {
            System.out.println(prodotto);
        }
    }
}
