import java.util.Random;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        boolean isDigit = false;
        int size = 0;

        int option = 0;
        boolean isOver = false;
        while(!isDigit){
            
            System.out.print("Enter the array size:");
            
            if(input.hasNextInt()){
                size = input.nextInt();

                if (size > 0){
                    isDigit = true;
                }else{
                    System.out.println("Please enter a positive integer.");
                    input.nextLine();
                }
            }else{
                System.out.println("Please enter a positive integer.");
                input.nextLine();
            }
        }
        
        int[] arr = new int[size];
        Random random = new Random();
        int num = 0;

        for (int i = 0; i < size; i++){
            num = random.nextInt(101);
            arr [i] = num;
        }

        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

       do {
            System.out.println("""
                           1. Find the Min and Max 
                           2. Find the average of the array 
                           3. Find the sum of ODD and EVEN Indexes
                           4. Exit""");

                System.out.println("Select Option Method: ");
                if (input.hasNextInt()) {
                    option = input.nextInt();

                   
                } else {
                    System.out.println("Please enter a digit");
                    input.nextLine();
                }
            

            // Method  1
            switch (option) {
            // Method  2
                case 1:

               int max= Method.arrayMaxFinder(arr);
               int min= Method.arrayMinFinder(arr);

               System.out.println("The Maximum number in the array :" + max);
               System.out.println("The Minimum number in the array :" + min);
                    break;
            // Method  3
                case 2:
                    Method.averageDifference(arr);
                    break;
                case 3:
                    int[] totals= Method.findTotalEvenOdd(arr);
                    System.out.println("The Total "+ (totals[0]+ totals[1]));
                    System.out.println("The Total of Even "+ (totals[0]));
                    System.out.println("The Total of Odd "+ (totals[1]));
                    break;
                case 4:
                    isOver = true;
                    break;
                default:
                    System.out.println("Please Enter One of the provided Option only!!");
                    break;
            }

        } while (!isOver);
            input.close();
    }
}