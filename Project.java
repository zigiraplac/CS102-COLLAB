import java.util.Scanner;
import java.util.Random;

public class Project {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        boolean isDigit = false;
        int size = 0;

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
        
        input.close();
    }
}