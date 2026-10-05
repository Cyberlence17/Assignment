package assignment;

import java.util.Scanner;

public class MainCounter {

    public static void main(String[] args) {

        //Skriv ett program som läser in text ifrån
        //kommandoraden rad för rad tills användaren
        //skriver ordet stop.

        Scanner scan = new Scanner(System.in);
        String[] input = new String[1];
        System.out.println("Skriv 'stop' för att avsluta");

        for (int i=0; i < input.length; i++){
            input[i] = scan.nextLine();
            /*if ("stop"){
                System.out.println("Stopped");
                break;
            } else {
                System.out.println("not stopped");
                //input[i] = scan.nextLine();
            }*/
        }

    }
}
