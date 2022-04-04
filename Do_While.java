// import Scanner
import java.util.Scanner;
// main class
class Do_While 
  {
    // main method
    public static void main(String[] args) {

      // declare variables
      int num;

      

      
      // Create an object
      Scanner obj = new Scanner(System.in);

      

      // start do-while
      do {
        System.out.println("Enter 1 for even numbers");
        System.out.println("Enter 2 for odd numbers");
        System.out.println("Enter 0 for exit");

        // initializing the number
        System.out.println("Enter the number: ");
        num = obj.nextInt();
        switch(num) {
          case 1: 
            for(int i = 1; i <= 10; i++) {
              if(i % 2 == 0) {
                System.out.print(i+ " ");
              }
            }
            break;

          case 2: 
            for(int i = 1; i <= 10; i++) {
              if(i % 2 != 0) {
                System.out.print(i+ " ");
              }
            }
            break;

          case 0:
            System.out.println("Bye! Visit again.");
            break;

          default:
            System.out.println("Invalid Option");
            break;
        } 
        System.out.println();
      }
        while(num != 0);
    }
  }