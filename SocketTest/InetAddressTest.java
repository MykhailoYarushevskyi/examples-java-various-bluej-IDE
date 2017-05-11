
import java.util.Scanner;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;



/**
 * Write a description of class SocetNetTest here.
 * 
 * @author Mikhailo
 * @version (a version number or a date)
 */
public class InetAddressTest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class SocetNetTest
     */
    public InetAddressTest()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  dstName          IP address destination (Client)
     * @param  dstPort          Port destination (Client)
     * @param  outBuff          Buffer for writing of the command (like "Oper\n\r", "Close\n\r")for Client
     * @param  countOutBytes    Number of element in buffer 'outBuff' for writing
     * @param  inBuff           Buffer for read of the response from Client
     * @param  countInBytes     Number of element in buffer 'inBuff' for reading of the response from Client
     * @return     
     */
    public void readWriteSocketStream(String dstName, int dstPort, byte[] outBuff, int countOutBytes, int countInBytes) throws IOException
    
    {
        byte[] inBuff = new byte[128];
        int actuallyReadInBytes = 0;
        inBuff[0] = 'N';
        inBuff[1] = 'u';
        inBuff[2] = 'l';
        inBuff[3] = 'l';
        inBuff[4] = 'N';
        inBuff[5] = 'u';
        inBuff[6] = 'l';
        inBuff[7] = 'l';
        inBuff[8] = 'N';
        inBuff[9] = 'u';
        inBuff[10] = 'l';
        inBuff[11] = 'l';
        
        InputStream inSockStrm ;
        OutputStream outSockStrm;
        
        ServerSocket srvsck = new ServerSocket(1962);
        Socket sck = new Socket();
        /*
        Socket sck = new Socket(dstName, dstPort);
        //Sets this socket's read timeout in milliseconds. Use 0 for no timeout. To take effect, 
        //this option must be set before the blocking method was called.
        
        sck.setSoTimeout(200000);
        inSockStrm = sck.getInputStream();
        outSockStrm = sck.getOutputStream();
        
        //write of the command for Client
        outSockStrm.write(outBuff,0,countOutBytes);
        
        System.out.println("Write to Client: \ncoutnOutBytes = " + countOutBytes);
        System.out.print("outBuff[] = ");
        for (int i =0; i < countOutBytes; i++){
            System.out.print((char)outBuff[i]);
        }
        System.out.println();
        //reading of the response from Client
        System.out.println("Read of the response from Client: \ncoutnInBytes = " + countInBytes);
        actuallyReadInBytes = inSockStrm.read(inBuff, 0, countInBytes);
        System.out.println("Read from Client: \nactuallyReadInBytes = " + actuallyReadInBytes);
        System.out.print("inBuff[] = ");
        for (int i =0; i < actuallyReadInBytes; i++){
            System.out.print((char)inBuff[i]);
        }
        */
        System.out.println();
        System.out.println("InetAddress: " + " getLocalSocketAddress= " + srvsck.getLocalSocketAddress() + " toString()= " + srvsck.toString()+ " getInetAddress()" + srvsck.getInetAddress());
        
        System.out.println("InetAddress: " + " toString()= " + sck.getLocalAddress() + "; getHostName= " + sck.getLocalAddress().getHostName() + "; getHostAddress()= " + sck.getLocalAddress().getHostAddress());
        System.out.println("SocketAddress: " + sck.getLocalSocketAddress()); 
        System.out.println("getLocalPort()= " + sck.getLocalPort());
        System.out.println("getPort()= " + sck.getPort());
        System.out.println("getRemoteSocketAddress()= " + sck.getRemoteSocketAddress());
        System.out.println("BEFORE performing .close():: isBound()= " + sck.isBound() + "; isConnected()= " + sck.isConnected() + "; isClosed()= " + sck.isClosed());
        System.out.println("isInputShutdown()= " + sck.isInputShutdown() + "; isOutputShutdown()= " + sck.isOutputShutdown());
        sck.close();
        System.out.println("\n" + "AFTER performing .close():: isBound()= " + sck.isBound() + "; isConnected()= " + sck.isConnected() + "; isClosed()= " + sck.isClosed());
    
        //return inBuff;
        return ;
    }
    
    public static void main(String[] args) throws IOException
    {
        Scanner inputConsol = new Scanner(System.in);

        //Object of the class SocetNetTest.
        InetAddressTest rdWrSocStream = new InetAddressTest();
        
        String dstName = new String();
        int dstPort = 0;
        byte[] outBuffOpen = new byte[6];
        int countOutBytesOpen = 6;
        byte[] outBuffClose = new byte[7];
        int countOutBytesClose = 7;
        int countInBytesOpen = 9;
        int countInBytesClose = 10;
        
        int typeofCommand = 0;
        
        //Filling of the command "Open\r\n"for Client in buffer of write
        outBuffOpen[0] ='O';
        outBuffOpen[1] ='p';
        outBuffOpen[2] ='e';
        outBuffOpen[3] ='n';
        outBuffOpen[4] ='\r';
        outBuffOpen[5] ='\n';
        countOutBytesOpen = 6;
        countInBytesOpen = countOutBytesOpen + 3;
       
        //Filling of the command "Close\r\n"for Client in buffer of write
        outBuffClose[0] ='C';
        outBuffClose[1] ='l';
        outBuffClose[2] ='o';
        outBuffClose[3] ='s';
        outBuffClose[4] ='e';
        outBuffClose[5] ='\r';
        outBuffClose[6] ='\n';
        countOutBytesClose = 7;
        countInBytesClose = countOutBytesClose + 3;
        
        //Object of the class SocetNetTest.
        
        System.out.println("Enter a IP(String): ");
        // IP Destination
        //dstName = inputConsol.next();
        dstName = "46.219.32.132";
        System.out.println("Enter a Port(int): ");
        // port Destination
        //dstPort = inputConsol.nextInt(); 
        dstPort = 333;
        System.out.println("You Enter IP:port " + dstName + ":" + dstPort);
        // Call method for write of the command for Client and read of the response from Client
        do{
            System.out.println("Enter a command: 1 - Open  2 - Close  0 - End of program");
            typeofCommand = inputConsol.nextInt();
            switch(typeofCommand){
                case 1 :{
                    rdWrSocStream.readWriteSocketStream(dstName, dstPort, outBuffOpen, countOutBytesOpen, countInBytesOpen);
                    break;
                }
                case 2 :{
                    rdWrSocStream.readWriteSocketStream(dstName, dstPort, outBuffClose, countOutBytesClose, countInBytesClose);
                    break;
                }
                default :{
                    if (typeofCommand != 0) System.out.println("ERROR. You entered a wrong command " + typeofCommand);
                    break;
                }
            }
        }while(typeofCommand != 0);
        System.out.println("END of program");
    }
}

