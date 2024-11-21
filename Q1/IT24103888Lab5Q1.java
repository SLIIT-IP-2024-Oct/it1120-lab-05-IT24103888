import java.util.Scanner;

public class IT24103888Lab5Q1 {
   public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);

   System.out.print("Enter the first integer:");
   int num01 = scanner.nextInt();

   System.out.print("Enter the second integer:");
   int num02 = scanner.nextInt();

   System.out.print("Enter the third integer:");
   int num03 = scanner.nextInt();
 
   int largest;
   if (num01 > num02) {
      if (num01 > num03) {
        largest = num01;
      } else {
        largest = num03;
      }
   } else {
      if (num02 > num03) {
        largest = num02;
     } else {
        largest = num03;
     }
   }

   int smallest;
   if (num01 < num02) {
      if (num01 < num03) {
        smallest = num01;
      } else {
        smallest = num03;
      }
   } else {
      if (num02 < num03) {
        smallest = num02;
     } else {
        smallest = num03;
     }
   }

   System.out.println("The largest number is:" +largest);
   System.out.println("The smallest number is:" +smallest);
   }
}
   
  
      
     
   