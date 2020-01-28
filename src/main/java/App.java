import models.PingPong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class App {
    public static void main(String [] args){
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I am a pingpong application");
        System.out.println("Enter a number");
        try{
            String userInputtedNumber = console.readLine();
            int userNumber = Integer.parseInt(userInputtedNumber);
            ArrayList<Object> firstResult = PingPong.runPingPong(userNumber);
            System.out.println(firstResult);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
