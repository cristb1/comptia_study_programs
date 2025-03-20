import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ports{
    LinkedList<Integer> listOfPorts = new LinkedList<Integer>();
    LinkedList<String> listOfPortNames = new LinkedList<String>();
    int FTP1 = 20; //File Transfer Protocol
    int FTP2 = 21;
    int SSH = 22; //Secure Shell
    int SFTP = 22; //Secure File Transfer Protocol. Has same port as SSH because it uses SSH
    int TELNET = 23; //Teletype Network
    int SMTP = 25; //Simple Mail Transfer Protocol
    int DNS = 53; //Domain Name System
    int DHCP1 = 67; //Dynamic Host Config Protocol
    int DHCP2 = 68; 
    int HTTP = 80; //Hyper Text Transfer Protocl
    int HTTPS = 443; //HTTP Secure
    int POP3 = 110; //Post Office Protocol v3
    int NetBIOS1 = 137;
    int NetBIOS2 = 138;
    int NetBIOS3 = 139;
    int IMAP = 143; //Internet Messaging Access Protocol
    int SNMP1 = 161; //Simple Network Management Protocol
    int SNMP2 = 162;
    int LDAP = 389; //Lightweight directory access protocol
    int RDP = 3389; //Remote Desktop Protocol
    int AFP = 548; //Apple Filing Protocol
    int SMB = 445; //Server Message Block
    int SYSLOG = 514; //System Log
    int TFTP = 69; //Trivial File Transfer Protocol

    int POP3encrypt = 995;
    int IMAPencrypt = 993;
    int SMTPencrypt = 465;

    public void putPortsInList(){
        listOfPorts.add(FTP1);
        listOfPorts.add(FTP2);
        listOfPorts.add(SSH);
        listOfPorts.add(SFTP);
        listOfPorts.add(TELNET);
        listOfPorts.add(SMTP);
        listOfPorts.add(DNS);
        listOfPorts.add(DHCP1);
        listOfPorts.add(DHCP2);
        listOfPorts.add(HTTP);
        listOfPorts.add(HTTPS);
        listOfPorts.add(POP3);
        listOfPorts.add(NetBIOS1);
        listOfPorts.add(NetBIOS2);
        listOfPorts.add(NetBIOS3);
        listOfPorts.add(IMAP);
        listOfPorts.add(SNMP1);
        listOfPorts.add(SNMP2);
        listOfPorts.add(LDAP);
        listOfPorts.add(RDP);
        listOfPorts.add(AFP);
        listOfPorts.add(POP3encrypt);
        listOfPorts.add(IMAPencrypt);
        listOfPorts.add(SMTPencrypt);
        listOfPorts.add(SMB);
        listOfPorts.add(SYSLOG);
        listOfPorts.add(TFTP);

        listOfPortNames.add("FTP1");
        listOfPortNames.add("FTP2");
        listOfPortNames.add("SSH");
        listOfPortNames.add("SFTP");
        listOfPortNames.add("TELNET");
        listOfPortNames.add("SMTP");
        listOfPortNames.add("DNS");
        listOfPortNames.add("DHCP1");
        listOfPortNames.add("DHCP2");
        listOfPortNames.add("HTTP");
        listOfPortNames.add("HTTPS");
        listOfPortNames.add("POP3");
        listOfPortNames.add("NetBIOS Name");
        listOfPortNames.add("NetBIOS Datagram");
        listOfPortNames.add("NetBIOS Session");
        listOfPortNames.add("IMAP");
        listOfPortNames.add("SNMP1");
        listOfPortNames.add("SNMP2");
        listOfPortNames.add("LDAP");
        listOfPortNames.add("RDP");
        listOfPortNames.add("AFP");
        listOfPortNames.add("POP3 (encrypted)");
        listOfPortNames.add("IMAP (encrypted)");
        listOfPortNames.add("SMTP (encrypted)");
        listOfPortNames.add("SMB");
        listOfPortNames.add("SysLog");
        listOfPortNames.add("TFTP");
    }

    public void test(){
        int atQuestion = 0;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        while(!listOfPorts.isEmpty()){
            atQuestion = rand.nextInt((listOfPorts.size() - 1) - 0 + 1) + 0;
            System.out.println("What is the port number for " + listOfPortNames.get(atQuestion));
            String myAnswerString = input.nextLine();
            int myAnswerInt = Integer.parseInt(myAnswerString);
            if(myAnswerInt == listOfPorts.get(atQuestion)){
                System.out.println("Yay!");
            }else{
                System.out.println("Nope :(");
                System.out.println("What is the port number for " + listOfPortNames.get(atQuestion));
                myAnswerString = input.nextLine();
                myAnswerInt = Integer.parseInt(myAnswerString);
                if(myAnswerInt != listOfPorts.get(atQuestion)){
                    System.out.println("Port is " + listOfPorts.get(atQuestion));
                }
            }
            listOfPorts.remove(listOfPorts.get(atQuestion));
            listOfPortNames.remove(listOfPortNames.get(atQuestion));
        }
        input.close();
        System.out.println("That was all the ports bye bye :3");
    }

    public static void main(String[] args){
        Ports port = new Ports();
        port.putPortsInList();
        port.test();
    }
    
}