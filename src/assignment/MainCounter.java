package assignment;

import java.util.Scanner;

public class MainCounter {

    public static void main(String[] args) {

        System.out.println("Skriv 'stop' för att avsluta");

        //Läser in text ifrån användaren -> Scanner -> Text
        LogicCounter counter = new LogicCounter();
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        //upprepa tills text = "stop"
        while(!text.equals("stop")) {
            counter.count(text);
            text = scan.nextLine();
        }
        //Hämta antal tecken och rader
        int letters = counter.getLetters();
        int rows = counter.getRows();
        //Skriv ut antal tecken och rader
        System.out.println(letters);
        System.out.println(rows);



    }

    //Kontrollerar om man har skrivit stop

}
