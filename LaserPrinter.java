import java.util.Scanner;

public class LaserPrinter {
    public String process[] = {"Charging","Exposing","Developing","Transferring","Fusing","Cleaning"};
    public void Quiz(){
        String answer;
        for(int i = 0; i < process.length; i++){
            printList();
            // Asks processes in order
            System.out.println("\nWhich process is Step " + (i+1) + "?\n");
            // User types answer from list
            answer = userInput();
            // Checks if chosen answer is correct
            if(answer.equalsIgnoreCase(process[i])){
                System.out.println("\nCorrect!\n");
            }else{
                System.out.println("\nNope, the process is " + process[i] + "\n");
            }
        }
    }

    public String userInput(){
        Scanner sc  = new Scanner(System.in);
        String userInput = sc.nextLine();
        return userInput;
    }

    public void printList(){
        // May randomize list later
        System.out.println("Steps:\n");
        System.out.println("Fusing\nCharging\nExposing\nCleaning\nDeveloping\nTransferring");
    }

    public static void main(String[] args) {
        LaserPrinter quiz = new LaserPrinter();
        quiz.Quiz();
    }
}
