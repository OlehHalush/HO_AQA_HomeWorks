package examples;

/*
Write a program which prints the next figure to the console: height and width
**********
*           *
*           *
*           *
**********
 */
public class Example_3_10 {

    public static void main(String[] args) {
        final int rows = 12;
        final int columns = 12;

        final String markSymbol = "XX";
        final String emptySymbol = "  ";

        final int[] markedRows = {1, rows};
        final int[] markedColumns = {1, columns};

        for (int rowsCounter = 1; rowsCounter <= rows; rowsCounter++) {
            for (int columnsCounter = 1; columnsCounter <= columns; columnsCounter++) {
                System.out.print(
                        isElementIn(columnsCounter, markedColumns) || isElementIn(rowsCounter, markedRows)
                                ? markSymbol : emptySymbol
                );
            }
            System.out.println();
        }
    }

    private static boolean isElementIn(int element, int[] array) {
        for (int i : array) {
            if (i == element) {
                return true;
            }
        }
        return false;
    }

}

