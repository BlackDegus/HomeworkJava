public class HomeWorkApp2 {
    public static void main(String[] args){
    System.out.println(methodCompare(0, 20));
    methodPositiveText(0);
    System.out.println(methodPositiveBoolean(-1));
    methodPrint(2,"It's alive!!!");
    System.out.println(methodLeap(404));
    }
    public static boolean methodCompare(int a, int b) {
        int result = a + b;
        if ( result <= 20 && result >= 10){
            return true;
        } else {
            return false;
        }
    }
    public static void methodPositiveText(int c) {
        if (c >= 0){
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    public static boolean methodPositiveBoolean(int d){
        if (d < 0){
            return true;
        } else {
            return false;
        }
    }
    public static void methodPrint(int e, String str1){
        for (int i = 0; i < e; i++){
            System.out.println(str1);
        }
    }
    public static boolean methodLeap(int y) {
    if (y % 400 == 0){
        return true;
    } else if (y % 100 == 0){
        return false;
    } else if (y % 4 == 0){
        return true;
    } else {
        return false;
    }
    }
}

