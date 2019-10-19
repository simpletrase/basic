package Lesson_2.Homework;  /*_*/

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(String cellContent, int rowID, int columnID){
        super("Incorrect value (" + cellContent + ")" + " in array cell " + "[" + rowID + "][" + columnID + "]. Required integer!" );
        // super(String.format("Incorrect value '%s' in array cell [%d][%d]. Required integer!"));
    }
}
