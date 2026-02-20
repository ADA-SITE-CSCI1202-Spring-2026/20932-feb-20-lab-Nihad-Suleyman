package week03.invoice;

import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of invoices: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // consume newline

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Part number: ");
            String partn = scanner.nextLine();

            System.out.print("Part description: ");
            String partd = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Price per item: ");
            double price = scanner.nextDouble();
            scanner.nextLine();  // consume newline

            invoices[i] = new Invoice(partn, partd, quantity, price);
        }

        System.out.println("\nInvoice Details");

        for (int i = 0; i < invoices.length; i++) {

            System.out.println("Part Number: " + invoices[i].getpartn());
            System.out.println("Description: " + invoices[i].getPartDescription());
            System.out.println("Quantity: " + invoices[i].getQuantity());
            System.out.println("Price per item: " + invoices[i].getprice());
            System.out.println("Invoice Amount: " + invoices[i].getInvoiceAmount());
        }

        scanner.close();
    }
}
