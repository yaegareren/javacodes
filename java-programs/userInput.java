import java.util.Scanner; // so we can use scanner

public class userInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // creating a scanner object

    System.out.println("What is your name");
    String name = scanner.nextLine(); 

    System.out.println("What is your age");
    int age = scanner.nextInt(); 

    scanner.nextLine(); // to avoid escaping the next statement due to escape character sequence 
    
    System.out.println("What is your favourite food?");
    String food = scanner.nextLine(); 
    

    System.out.println("Hello, My name is "+name+ " and I am "+age+ " years old" );
    System.out.println("I like "+food);
  }
}

