import java.util.Random;

public class HomeWorkApp3 {

    public static Random random = new Random();

    public static void main(String[] args){


        System.out.println();
    binaryReplace();

    System.out.println();
    fillHundredInt();

    System.out.println();
    mathLessSix();

    System.out.println();
    diagonalSquareArray(9);

    System.out.println();
    returnCustomArray(2, 3);

    System.out.println();
    int [] balanceArray = {1, 2, 3, 4, 5, 6, 2, 1};
    System.out.println(checkBalance(balanceArray));

    System.out.println();
    findMinMax(11);

     }

    public static void binaryReplace() {
        int [] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int y = 0; y < binaryArray.length; y++){
            if (binaryArray[y] == 1) {
                binaryArray[y] = 0;
            }
            else {
                binaryArray[y] = 1;
            }
            //System.out.print(binaryArray[y]);
        }

    }

    public static void fillHundredInt() {
        int [] hundredArray = new int[100];
        for (int y = 0; y < hundredArray.length; y++){
            hundredArray[y] = y + 1;
           //System.out.print(hundredArray[y] + " ");
        }
    }

    public static void mathLessSix() {
        int [] lessSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int y = 0; y < lessSix.length; y++){
            if (lessSix[y] < 6) {
                lessSix[y] = lessSix[y] * 2;
            }
            //System.out.print(lessSix[y] + " ");
        }
    }

    public static void diagonalSquareArray(int l) {
        int [][] squareArray = new int[l][l];
        for (int y = 0; y < squareArray.length; y++) {
            for (int x = 0; x < squareArray[y].length; x++){
                if (x == y) {
                    squareArray[y][x] = 1;
                }
                else if (x + y == squareArray.length - 1){
                    squareArray[y][x] = 1;
                }
                else {
                    squareArray[y][y] = 0;
                }
                System.out.print(squareArray[y][x] + "|");

            }
            System.out.println();
        }
    }

    public static int[] returnCustomArray (int len, int initialValue) {
        int [] customArray = new int [len];
        for (int y = 0; y < customArray.length; y++){
            customArray[y] = initialValue;
            System.out.print(customArray[y] + " ");
        }
        return customArray;
    }

    public static void findMinMax(int l) {
        int [] minMaxArray = new int[l];
        for (int y = 0; y < minMaxArray.length; y++) {
           minMaxArray[y] = random.nextInt(25);
           System.out.print(minMaxArray[y] + " ");
        }

        int max = minMaxArray[0];
        int min = minMaxArray[0];

        for (int y = 0; y < minMaxArray.length; y++) {

            if (minMaxArray[y] > max) {
                max = minMaxArray[y];
            }

            if (minMaxArray[y] < min) {
                min = minMaxArray[y];
            }

        }

        System.out.println("\nМаксимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);


    }

    public static boolean checkBalance(int [] balanceArray) {

        /*for (int y = 0; y < balanceArray.length; y++){
            balanceArray[y] = random.nextInt(25);
        }*/

        int sum = 0;
        for (int y = 0; y < balanceArray.length - 2; y++){
            sum += balanceArray[y];
        }
        System.out.println("\nСумма левой части равна: " + sum);

        int rightsum = 0;
        for (int y = balanceArray.length - 2; y < balanceArray.length; y++){
            rightsum += balanceArray[y];
        }
        System.out.println("Сумма правой части равна: " + rightsum);

        if (sum == rightsum) {
            return true;
        } else {
            return false;
        }

    }



}
