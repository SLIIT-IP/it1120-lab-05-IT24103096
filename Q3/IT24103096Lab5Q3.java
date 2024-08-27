import java.util.Scanner;
     public class IT24103096Lab5Q3{
        public static void main(String[] args){
            final double ROOM_CHARGE_PER_DAY = 48000.00;
            final double DISCOUNT_3_TO_4_DAYS = 0.1;
            final double DISCOUNT_5_OR_MORE_DAYS = 0.2;
            final double totalAmountBeforeDiscount, discountAmount, totalAmountToBePaid;
            int startDate, endDate, no_of_days_reserved;
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter the Start Date(1-31) :- ");
            startDate = sc.nextInt();
            System.out.print("Enter the End Date(1-31) :- ");
            endDate = sc.nextInt();
            
        if(startDate < 1 || startDate >= 31 || endDate <1 || endDate >= 31 ){
            System.out.print("Days must be between 1 and 31.");
        }
        else if(startDate >= endDate ){
            System.out.print("Error. Start date must be less than end date.");
        }
        else {

            no_of_days_reserved = endDate - startDate;

           double  discountRate = 0;  
        if(no_of_days_reserved >= 3 && no_of_days_reserved <= 4){
            discountRate = DISCOUNT_3_TO_4_DAYS;
        }
        if(no_of_days_reserved >= 5){
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

           totalAmountBeforeDiscount =  no_of_days_reserved *  ROOM_CHARGE_PER_DAY;
           discountAmount = discountRate * totalAmountBeforeDiscount;
           totalAmountToBePaid = totalAmountBeforeDiscount - discountAmount;
           
           System.out.println("Room Charge Per Day :- Rs."+ROOM_CHARGE_PER_DAY );
           System.out.println("Number of Days Reserved :- "+no_of_days_reserved );
           System.out.println("Total amount to be paid :- "+totalAmountToBePaid );
        }
     }
  }
           
 
            

             