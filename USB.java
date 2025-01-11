import javax.swing.*;
import java.util.Scanner;
import java.util.Random;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class USB {
    String[] usbNames = {"USB A", "USB B", "USB 3.0", "USB Mini", "USB Micro", "USB C", "USB Micro B"};

    USB(){
        JFrame usbPic = new JFrame("USBs");
        ImageIcon usbImage = new ImageIcon("usb_types.png");

        usbPic.add(new JLabel(usbImage));
        usbPic.pack();
        usbPic.setVisible(true);

        Quiz();

    }

    public void Quiz(){
        LinkedList<Integer> order = setOrderOfQuestions();
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < usbNames.length; i++){
        int currentQuestion = order.poll();
        int attempts = 3;
        boolean isCorrect = false;
        
        System.out.println("Which USB is " + usbNames[currentQuestion]);
        
        while(attempts != 0 && !isCorrect){
            /*String answer = sc.nextLine();
            int answerInt = Integer.parseInt(answer);*/
            int answerInt = userInput(sc);
            if((answerInt-1) == currentQuestion){
                System.out.println("Correct!");
                isCorrect = true;
            }else{
                System.out.println("Nope :(");
                attempts--;
            }
        }

        if(!isCorrect){
            System.out.println(usbNames[currentQuestion] + " corresponds with " + (currentQuestion+1));
        }
    }
    }

    LinkedList<Integer> setOrderOfQuestions(){
        Random rand = new Random();
        LinkedHashSet<Integer> orderSet = new LinkedHashSet<>();
        while(orderSet.size() != usbNames.length){
            int randomNum = rand.nextInt(usbNames.length);
            orderSet.add(randomNum);
        }
        LinkedList<Integer> orderList = new LinkedList<>();
        orderList.addAll(orderSet);
        return orderList;
      }

      int userInput(Scanner sc){
        String answer; 
        int answerInt = 0;
        try{
            answer = sc.nextLine();
            answerInt = Integer.parseInt(answer);
            if(answerInt > 7 || answerInt < 1){
                System.out.println("Not a number listed here");
                answerInt = userInput(sc);
            }
        }catch(NumberFormatException e){
            System.out.println("Invalid Input");
            answerInt = userInput(sc);
        }
        return answerInt;
      }

      public static void main(String args[]) 
      { 
        new USB();
    
        Scanner exitInput = new Scanner(System.in);
        System.out.println("Type anything to exit");
        exitInput.nextLine();
        exitInput.close();
        System.exit(0);
      }  
}
