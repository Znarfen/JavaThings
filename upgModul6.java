public class upgModul6 {
    public static void main(String[] arg) {
        boolean valid = false;
        int year = 0, month = 0, day = 0, lastFourDigits = 0;

        while (!valid) {
            valid = true;
            System.out.println("Enter a valid personal number (format: YY-MM-DD-XXXX): ");
            // YY-MM-DD-XXXX
            String personalNumber = System.console().readLine();

            if (!personalNumber.contains("-")) {
                System.out.println("Must use '-' as separator.");
                valid = false;
            }

            String[] pnParts = personalNumber.split("-");
            if (pnParts.length != 4) {
                System.out.println("Personal number must have 4 parts.");
                valid = false;
            }

            try {
                year = Integer.parseInt(pnParts[0]);
                month = Integer.parseInt(pnParts[1]);
                day = Integer.parseInt(pnParts[2]);
                lastFourDigits = Integer.parseInt(pnParts[3]);
            } catch (NumberFormatException e) {
                System.out.println("Can only contain numbers.");
                valid = false;
            }

            if (!((month >= 1 && month <= 12 )&&( day >= 1 && day <= 31))) {
                System.out.println("Format must be YY-MM-DD-XXXX.");
                valid = false;
            }
        }
        System.out.println("Valid personal number entered.");
    }
}
