import java.util.Scanner;

public class IT24103888Lab5Q3 {
   public static void main(String[] args) {

   final double room_charge_per_day = 48000.00 ;
   final double discount_10_percent = 10 ; 
   final double discount_20_percent = 20 ;

   Scanner scanner = new Scanner(System.in);

   System.out.print("Enter the start date (1-31):");
   int startDate = scanner.nextInt();

   System.out.print("Enter the end date (1-31):");
   int endDate = scanner.nextInt();

   if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
       System.out.println("Error: Start date and end date must be between 1 and 31");
       return;
   }

   if (startDate >= endDate){
      System.out.println("Error: Start date must be less than the end date");
      return;
   }

   int days_reserved = endDate - startDate;

   double discountRate = 0.0;
   if (days_reserved >= 5) {
       discountRate = discount_20_percent;
   } else if (days_reserved >=3) {
       discountRate = discount_10_percent;
   }

   double total_amount = days_reserved * room_charge_per_day;
   double discount_amount = total_amount * (discountRate / 100);
   double total_amount_to_pay = total_amount - discount_amount;


   System.out.println("Number of days reserved:" +days_reserved);
   System.out.println("Total amount before discount:" +total_amount);
   System.out.println("Discount amount:" +discount_amount); 
   System.out.println("Total amount to be paid after discount:" +total_amount_to_pay); 
   
   }
}
    
   
