package assignment;


public class LogicCounter {
    //definiera variabel - attribut
    private int rows;
    //attribut för antal tecken
    private int letters;
    //attribut för antal ord
    private int words;
    //attribut för längsta ord
    private String longestWord = "";


    public void count(String text) {
        //lägg till 1
        rows++;

        //lägg till antal tecken
        letters += text.length();

        //lägg till antal ord
        String[] word = text.split(" ");
        words += word.length;

        //lägg till längsta ordet
        for (int i = 0; i < word.length; i++) {
            if(word[i].length() > longestWord.length()){
                longestWord = word[i];
            }
        }
    }

    //Räknar rader
    public int getRows() {
        //Returnera attribut
        return rows;
    }

    //Räknar tecken
    public int getLetters() {
        //returnera antal tecken
        return letters;
    }

    //Räknar ord --
    public int getWords() {
        //returnera antal ord
        return words;
    }

    //Har koll på det längsta ordet --
    public String getLongestWord() {
        //returnera längsta ordet (String)
        return longestWord;
    }

    //lägg till getWords, getLongestWord to Main



    //Har vi skrivit stop? return Boolean


}
