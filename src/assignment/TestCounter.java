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


}