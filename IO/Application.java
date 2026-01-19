package TP5.IO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetierProduitImpl metier = new MetierProduitImpl();
        int choice;
        do {
            System.out.println("\n===== PRODUCT MENU =====");
            System.out.println("1. Display all products");
            System.out.println("2. Search product by ID");
            System.out.println("3. Add new product");
            System.out.println("4. Delete product by ID");
            System.out.println("5. Save products");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    metier.getAll().forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    long id = sc.nextLong();
                    Product p = metier.findById(id);
                    System.out.println(p != null ? p : "Product not found");
                    break;
                case 3:
                    System.out.print("ID: ");
                    long newId = sc.nextLong();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Brand: ");
                    String brand = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    sc.nextLine();
                    System.out.print("Description: ");
                    String desc = sc.nextLine();

                    System.out.print("Stock: ");
                    int stock = sc.nextInt();

                    metier.add(new Product(newId, name, brand, price, desc, stock));
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    long delId = sc.nextLong();
                    metier.delete(delId);
                    break;
                case 5:
                    metier.saveAll();
                    System.out.println("Products saved successfully.");
                    break;
                case 6:
                    metier.saveAll();
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
        sc.close();
    }
}
