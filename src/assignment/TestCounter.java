package assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCounter {


    @Test
    public void testCountRows() {
        //Arrange
        LogicCounter counter = new LogicCounter();
        //Testdata
        String text = "Det här är min text";

        //Act
        //Spara antal rader
        counter.count(text);
        //Actual: hämta antal rader
        int actual = counter.getRows();
        int expected = 1;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCount5Rows() {
        //Arrange
        LogicCounter counter = new LogicCounter();
        //Testdata
        String text = "Det här är min text";

        //Act
        //Spara antal rader
        counter.count(text);
        counter.count(text);
        counter.count(text);
        counter.count(text);
        counter.count(text);
        //Actual: hämta antal rader
        int actual = counter.getRows();
        int expected = 5;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCount10Letters() {
        //Arrange
        LogicCounter counter = new LogicCounter();
        //Testdata
        String text = "AnteDaylon";

        //Act
        counter.count(text);
        int actual = counter.getLetters();
        int expected = 10;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCount2Rows20Letters() {
        //Arrange
        LogicCounter counter = new LogicCounter();
        //Testdata
        String text = "AnteDaylon";

        //Act
        counter.count(text);
        counter.count(text);
        int actual = counter.getLetters();
        int expected = 20;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCount3Words() {
        //Arrange
        LogicCounter counter = new LogicCounter();
        //Testdata
        String text = "Du luktar illa";

        //Act
        counter.count(text);
        int actual = counter.getWords();
        int expected = 3;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCount4Words2Rows() {
        //Arrange
        LogicCounter counter = new LogicCounter();
        //Testdata
        String text = "000000000 11111111";

        //Act
        counter.count(text);
        counter.count(text);
        int actual = counter.getWords();
        int expected = 4;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCountLongestWord() {
        //Arrange
        LogicCounter counter = new LogicCounter();
        //Testdata
        String text = "Du luktar illa";

        //Act
        counter.count(text);
        String actual = counter.getLongestWord();
        String expected = "luktar";

        //Assert
        assertEquals(expected, actual);
    }

}