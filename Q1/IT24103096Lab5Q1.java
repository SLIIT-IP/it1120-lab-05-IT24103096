import java.util.Scanner;
    public class IT24103096Lab5Q1{
        public static void main(String[] args){
             int number1,number2,number3;
             Scanner scanner = new Scanner(System.in);
             
             System.out.print("Enter the first integer :-");
             number1 = scanner.nextInt();
         
             System.out.print("Enter the second integer :-");
             number2 = scanner.nextInt();

             System.out.print("Enter the third integer :-");
             number3 = scanner.nextInt();

             int smallest = number1;
             int largest = number1;

         if(number2 < smallest) {
           smallest = number2;
         }
         if(number2 > largest) {
           largest = number2;
         }
         if(number3 < smallest) {
           smallest = number3;
         }
         if (number3 > largest) {
         }
               
             System.out.println("The smallest number is "+ smallest);
             System.out.println("The largest number is " + largest);
         }
    }