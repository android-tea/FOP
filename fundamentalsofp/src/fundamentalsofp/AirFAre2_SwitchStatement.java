package fundamentalsofp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AirFAre2_SwitchStatement {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");
        
        double fare = 0.0;
        char custCode;
        String customer = "";
        double discRate = 0.0;
        double netFare = 0.0, discount = 0.0;
        
        System.out.println("Enter fare amount: ");
        fare = sc.nextDouble();
        System.out.println("Enter customer code [O=Ordinary, S=Student, R=Senior]: ");
        
        // Read the customer code
        custCode = sc.next().charAt(0);
        custCode = Character.toUpperCase(custCode); // Convert to uppercase after reading
        
        switch (custCode) {
            case 'O':
                customer = "ordinary";
                discRate = 0.0;
                break;
                
            case 'S':
                customer = "student";
                discRate = 0.1;
                break;
                
            case 'R':
                customer = "senior citizen";
                discRate = 0.5;
                break;
                
            default:
                customer = "Invalid code";
                System.out.println("Customer is: " + customer);
                return; // Exit the program if the code is invalid
        }
        
        discount = fare * discRate;
        netFare = fare - discount;
        System.out.println("\nCustomer is: $" + customer);
        System.out.println("Discount is: $" + df.format(discount) + " dollars");
        System.out.println("\nNet fare is: $" + df.format(netFare) + " dollars");
    }
}
