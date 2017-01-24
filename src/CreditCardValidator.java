public class CreditCardValidator {

  
    public static void main(String[] args) {
     
        /**
         * To determine which credit cards are real, double every third number
         * starting from the first one, add them together, and then add them to
         * those figures that were not doubled. If the total sum of all numbers
         * is divisible by 10 without remainder, then this credit card is real.
         */
        String line = "9999 9999 9999 9993";
        String array[] = line.split(" ");
        int suma = 0;
        for (int j = 0; j <= 3; j++) {
            
            for (int i = 0; i < array[j].length(); i++) {
                if (i == 0) {
                    suma = suma + (Character.getNumericValue(array[j].charAt(i)) * 2);

                } else if (i == 2) {
                    suma = suma + (Character.getNumericValue(array[j].charAt(i)) * 2);
                } else {
                    suma = suma + (Character.getNumericValue(array[j].charAt(i)));
                }

  
            }
        }

        if (suma % 10 == 0) {
            System.out.println("Real");
        }else{
            System.out.println("Fake");
        }

    }

}
