public class upg7 {
    public static void main(String[] arg) {
        int number = 65;
        char letter = 'J';
        double decimal = 77.2;

        int number2;
        char letter2;
        double decimal2;

        checkType(number);
        checkType(letter);
        checkType(decimal);

        // char to int
        number2 = (int) letter;
        checkType(number2);

        // double to int
        number2 = (int) decimal;
        checkType(number2);

        // int to char
        letter2 = (char) number;
        checkType(letter2);

        // double to char
        letter2 = (char) decimal;
        checkType(letter2);

        // int to double
        decimal2 = (double) number;
        checkType(decimal2);

        // char to double
        decimal2 = (double) letter;
        checkType(decimal2);
    }

    static void checkType(Object obj) {
        System.out.println("The variable is: " + obj);
        if (obj instanceof Integer) {
            System.out.println("The variable is an Integer.\n");
        } else if (obj instanceof Boolean) {
            System.out.println("The variable is a Boolean.\n");
        } else if (obj instanceof Character) {
            System.out.println("The variable is a Character.\n");
        } else if (obj instanceof String) {
            System.out.println("The variable is a String.\n");
        } else if (obj instanceof Double) {
            System.out.println("The variable is a Double.\n");
        } else {
            System.out.println("Unknown type.\n");
        }
    }
}