package Lesson_2.Homework;  /*_*/

public class ArrayAndExceptions {
    private static final int ARRAY_SIZE = 4;

    private static final String[][] array = {   //correct
            {"55","7","0","6"},
            {"7","10","1","900"},
            {"8","14","289","-7"},
            {"-1198","5","3", "-100"},
    };

   /* private static final String[][] array = {   //incorrect size
            {"55","0","6"},
            {"7","10","1","900"},
            {"8","14","289","-7"},
            {"0","5","3", "-100"},
    };

    private static final String[][] array = {   //incorrect value
            {"55","7","0","6"},
            {"7","10","1","Q"},
            {"8","14","289","-7"},
            {"0","5","3", "-100"},
    };*/

    public static void main(String[] args) {
        try {
            int result = sumOfArrayElements(array);
            System.out.println("Sum of array elements = " + result);
        } catch (MyArrayDataException e){
            e.printStackTrace();
            System.out.println("Incorrect value! (" + e.getMessage() + ")");
        } catch (MyArraySizeException e){
            e.printStackTrace();
            System.out.println("Incorrect size (" + e.getMessage() + ")");
        }
    }

    private static int sumOfArrayElements(String[][] array){
        checkArraySize(array);

        int result = 0;
        for (int rowID = 0; rowID < array.length; rowID++){
            String [] row = array[rowID];
            for (int columnID = 0; columnID < row.length; columnID++){
                String value = row[columnID];
                try {
                    result = result + Integer.parseInt(value);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(value, rowID, columnID);
                }
            }
        }
        return result;
    }

    private static void checkArraySize(String[][] array){
        if (array.length != ARRAY_SIZE){
            throw new MyArraySizeException();
        }

        for (String[] row : array){
            if (row.length != ARRAY_SIZE){
            throw new MyArraySizeException();
            }
        }
    }
}
