import javax.swing.*;
import java.util.Scanner;
import java.util.Random;
import java.util.LinkedHashSet;
import java.util.LinkedList;

 
public class Motherboard
{
    String[] labelNames = {"PS/2 mouse port","PS/2 keyboard port", "S/PDIF Out Port", "HDMI connector", "DVI connector", "VGA port", "FireWire port", "eSATA port", "USB port", "RJ45 port", "Audio ports", "PCI-E x16 slot", "PCI-E x4 slot", "PCI slots", "Suoer I/O", "Print Header", "COM port", "USB header", "SATA2 connectors", "IDE connector", "DDR3 DIMM Memory slot", "CPU"};

    Motherboard() 
  {
    JFrame noLabel = new JFrame("Non Labeled Diagram");
    ImageIcon onlyNumberedDiagram = new ImageIcon("motherboard_without_key.gif");
    JFrame yesLabel = new JFrame("Labeled Diagram");
    ImageIcon labeledDiagram = new ImageIcon("aplus-3.gif");
    noLabel.add(new JLabel(onlyNumberedDiagram));
    noLabel.pack();
    noLabel.setVisible(true);

    Quiz();

    noLabel.setVisible(false);
    yesLabel.add(new JLabel(labeledDiagram));
    yesLabel.pack();
    yesLabel.setVisible(true);
  }

  public void Quiz(){
    LinkedList<Integer> order = setOrderOfQuestions();
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < labelNames.length; i++){
        int currentQuestion = order.poll();
        int attempts = 3;
        boolean isCorrect = false;
        
        System.out.println("Which number corresponds with " + labelNames[currentQuestion]);
        
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
            System.out.println(labelNames[currentQuestion] + " corresponds with " + (currentQuestion+1));
        }
    }
  }

  LinkedList<Integer> setOrderOfQuestions(){
    Random rand = new Random();
    LinkedHashSet<Integer> orderSet = new LinkedHashSet<>();
    while(orderSet.size() != labelNames.length){
        int randomNum = rand.nextInt(labelNames.length);
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
        if(answerInt > 22 || answerInt < 1){
            System.out.println("Not a number in the diagram");
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
    new Motherboard();

    Scanner exitInput = new Scanner(System.in);
    System.out.println("Type anything to exit");
    exitInput.nextLine();
    exitInput.close();
    System.exit(0);
  }
}