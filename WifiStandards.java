import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WifiStandards {

    LinkedList<Double> bands = new LinkedList<Double>();
    int bandNum;
    LinkedList<Double> bandwidths = new LinkedList<Double>();
    int bandwidthNum;
    String standard;
    String unit;
    int correctAnswerBand;
    int correctAnswerBandwidth;

    public WifiStandards(int bandNum, int bandwidthNum, String standard){
        this.bandNum = bandNum;
        this.bandwidthNum = bandwidthNum;
        this.standard = standard;
    }

    public void addBands(double band){
        bands.add(band);
    }

    public void addBandwidths(double bandwidth){
        bandwidths.add(bandwidth);
    }

    public String getBitsPerSecond(String inputUnit){
        unit = inputUnit;
        return unit;
    }

    public int correctAnswerBands(int correct){
        correctAnswerBand = correct;
        return correctAnswerBand;
    }

    public int correctAnswerBandwidth(int correct){
        correctAnswerBandwidth = correct;
        return correctAnswerBandwidth;
    }


    public static void main(String[] args){
        WifiStandards a = new WifiStandards(1, 1, "a");
        WifiStandards b = new WifiStandards(1, 1, "b");
        WifiStandards g = new WifiStandards(1, 1, "g");
        WifiStandards n = new WifiStandards(2, 2, "n");
        WifiStandards ac = new WifiStandards(1, 1, "ac");
        WifiStandards ax = new WifiStandards(3, 1, "ax");

        LinkedList<WifiStandards> listStandards = new LinkedList<WifiStandards>();
        listStandards.add(a);
        listStandards.add(b);
        listStandards.add(g);
        listStandards.add(n);
        listStandards.add(ac);
        listStandards.add(ax);
        //a
        listStandards.get(0).addBands(5);
        listStandards.get(0).addBandwidths(54);
        listStandards.get(0).getBitsPerSecond("Mbps");
        listStandards.get(0).correctAnswerBands(2);
        listStandards.get(0).correctAnswerBandwidth(1);
        //b
        listStandards.get(1).addBands(2.4);
        listStandards.get(1).addBandwidths(11);
        listStandards.get(1).getBitsPerSecond("Mbps");
        listStandards.get(1).correctAnswerBands(1);
        listStandards.get(1).correctAnswerBandwidth(2);
        //g
        listStandards.get(2).addBands(2.4);
        listStandards.get(2).addBandwidths(54);
        listStandards.get(2).getBitsPerSecond("Mbps");
        listStandards.get(2).correctAnswerBands(1);
        listStandards.get(2).correctAnswerBandwidth(1);
        //n
        listStandards.get(3).addBands(2.4);
        listStandards.get(3).addBands(5);
        listStandards.get(3).addBandwidths(150);
        listStandards.get(3).addBandwidths(600);
        listStandards.get(3).getBitsPerSecond("Mbps");
        listStandards.get(3).correctAnswerBands(3);
        listStandards.get(3).correctAnswerBandwidth(3);
        //ac
        listStandards.get(4).addBands(5);
        listStandards.get(4).addBandwidths(6.9);
        listStandards.get(4).getBitsPerSecond("Gbps");
        listStandards.get(4).correctAnswerBands(2);
        listStandards.get(4).correctAnswerBandwidth(4);
        //ax
        listStandards.get(5).addBands(2.4);
        listStandards.get(5).addBands(5);
        listStandards.get(5).addBands(6);
        listStandards.get(5).addBandwidths(9.6);
        listStandards.get(5).getBitsPerSecond("Gbps");
        listStandards.get(5).correctAnswerBands(4);
        listStandards.get(5).correctAnswerBandwidth(5);
        

        int atQuestion = 0;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        while(!listStandards.isEmpty()){
            atQuestion = rand.nextInt((listStandards.size() - 1) - 0 + 1) + 0;
            System.out.println("What is the band for " + listStandards.get(atQuestion).standard);
            System.out.println("1. 2.4 GHz\n2. 5 GHz\n3. Both\n4. Both and 6GHz");
            String myAnswerString = input.nextLine();
            int myAnswerInt = Integer.parseInt(myAnswerString);
            if(myAnswerInt == listStandards.get(atQuestion).correctAnswerBand){
                System.out.println("Yay!");
            }else{
                System.out.println("Nope :(");
                System.out.println("The band of 802.11" + listStandards.get(atQuestion).standard + " is " + listStandards.get(atQuestion).bands);
            }
            System.out.println("What is the bandwidth of " + listStandards.get(atQuestion).standard);
            System.out.println("1. 54 Mbps\n2. 11 Mbps\n3. 150Mbps input, 600 Mbps output\n4. 6.9 Gbps\n5. 9.6 Gbps");
            myAnswerString = input.nextLine();
            myAnswerInt = Integer.parseInt(myAnswerString);
            if(myAnswerInt == listStandards.get(atQuestion).correctAnswerBandwidth){
                System.out.println("Yay!");
            }else{
                System.out.println("Nope :(");
                System.out.println("The bandwidth of 802.11" + listStandards.get(atQuestion).standard + " is " + listStandards.get(atQuestion).bandwidths + listStandards.get(atQuestion).unit);
            }

            listStandards.remove(listStandards.get(atQuestion));
        }
        input.close();

    System.out.println("\n802.11" + a.standard + ":\nBand: " + (a.bands.toString()) + "\nBandwidth: " + (a.bandwidths.toString()) + (a.unit));
    System.out.println("\n802.11" + b.standard + ":\nBand: " + (b.bands.toString()) + "\nBandwidth: " + (b.bandwidths.toString()) + (b.unit));
    System.out.println("\n802.11" + g.standard + ":\nBand: " + (g.bands.toString()) + "\nBandwidth: " + (g.bandwidths.toString()) + (g.unit));
    System.out.println("\n802.11" + n.standard + ":\nBand: " + (n.bands.toString()) + "\nBandwidth: " + (n.bandwidths.toString()) + (n.unit));
    System.out.println("\n802.11" + ac.standard + ":\nBand: " + (ac.bands.toString()) + "\nBandwidth: " + (ac.bandwidths.toString()) + (ac.unit));
    System.out.println("\n802.11" + ax.standard + ":\nBand: " + (ax.bands.toString()) + "\nBandwidth: " + (ax.bandwidths.toString()) + (ax.unit));

    }
}
