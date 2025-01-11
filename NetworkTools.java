import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class NetworkTools {
    String[] networkTools = {"Snip/Cutter", "Cable Stripper", "Cable Crimper", "Wire Mapping Tool", "Cable Certifier", "Punch-down Block", "Tone Generator/Toner Probe", "Loopback Adapter/Device", "Tap", "Wireless Analyzer"};
    String[] toolFunctions = {"used to cut a piece of cable off a spool","strip off the end of the cable and prepare it for attachment to a connector","attach the connector to the end of the cable","works like a cable tester, but specifically for twisted pair ethernet cables","determine a cable's category or data throughput","terminates the wires and strips off excess installation and extra wires that are no longer needed", "generate a tone on one end of the connection and use the probe to audibly detect the wire connected on the other side","facilitates the testing of simple networking issues", "connects directly to the cable infrastructure and splits or copies those packets for analysis, security, or general network management", "ensures proper coverage and prevents overlap between wireless access"};
    String[] choices = new String[4];


    public void questions(){
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> questionsDone = new LinkedList<Integer>();
        Random random = new Random();
        for (int i = 0; i < networkTools.length;){
            int chosenQuestion = random.nextInt((networkTools.length - 1) - 0 + 1) + 0;
            if(questionsDone.contains(chosenQuestion)){
                //nothing
            }else{
                System.out.println("What does a " + networkTools[chosenQuestion] + " do?");
                randomChoice(chosenQuestion, random);
                System.out.println("1: " +  choices[0] + "\n2: " + choices[1] + "\n3: " + choices[2] + "\n4: " + choices[3]);
                int userChoice = input.nextInt();
                if(choices[(userChoice-1)] == toolFunctions[chosenQuestion]){
                    System.out.println("Correct! :D");
                }else{
                    System.out.println("Nope\n" + "Correct Function of " + networkTools[chosenQuestion] + " is " + toolFunctions[chosenQuestion]);
                }
                questionsDone.add(chosenQuestion);
                i++;
            }
        }
        input.close();
    }

    public String[] randomChoice(int neededIndex, Random random){
        LinkedList<Integer> choiceDone = new LinkedList<Integer>();
        int randomChoiceIndex = random.nextInt((choices.length - 1) - 0 + 1) + 0; //3 is length of choices
        choices[randomChoiceIndex] = toolFunctions[neededIndex];
        choiceDone.add(randomChoiceIndex);
        for(int i = 0; i < (choices.length-1);){
            randomChoiceIndex = random.nextInt((choices.length - 1) - 0 + 1) + 0;
            int randomFunctionIndex = random.nextInt((toolFunctions.length - 1) - 0 + 1) + 0;
            if(choiceDone.contains((int)randomChoiceIndex)){
                //do nothing
            }else{
                choices[randomChoiceIndex] = toolFunctions[randomFunctionIndex];
                choiceDone.add(randomChoiceIndex);
                i++;
            }
        }
        return choices;
    }
    public static void main(String[] args){
        NetworkTools net = new NetworkTools();
        net.questions();
        System.out.println("That's all! Bye bye");
    }

}
