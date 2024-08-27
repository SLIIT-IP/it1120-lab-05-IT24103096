import java.util.Scanner;
    public class IT24103096Lab5Q2{
        public static void main(String[] args){
            int no_of_customers;
            String Prize;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of new members introduced :-");
            no_of_customers = sc.nextInt();
        if(no_of_customers < 0){
            System.out.print("Input number must be a 0 or greater.");
        }
        else{
           switch(no_of_customers){
                 case 0: System.out.print("No Prize");
                 break;
                 case 1: System.out.print("Prize is a Pen. ");
                 break;
                 case 2: System.out.print("Prize is a Umbrella. ");
                 break;
                 case 3: System.out.print("Prize is a Bag. ");
                 break;
                 case 4: System.out.print("Prize is a Traveling chair. ");
                 break;
                 default: System.out.print("Prize is a Headphone. ");
                 break;
           }
        }
        }
    }



  

                
        
           
       