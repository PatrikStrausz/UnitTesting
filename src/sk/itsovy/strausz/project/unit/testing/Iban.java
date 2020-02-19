package sk.itsovy.strausz.project.unit.testing;

public class Iban {
    public String iban(String bankCode, String predCislie, String accountNumber) {

        if (bankCode.length() == 4 && predCislie.length() > 0 && predCislie.length() <= 6 && accountNumber.length() >= 2 && accountNumber.length() <= 10) {

            String country = "282000"; //SK00

            String initialNumber = bankCode + predCislie + accountNumber;
            String secondNumber = initialNumber + country;


            String first8 = secondNumber.substring(0, 10);
            System.out.println(first8);
            long firstDivider = Long.parseLong(first8) % 97;
//            System.out.println(firstDivider);


            String secondString = firstDivider + secondNumber.substring(10);
            long secondDivider = Long.parseLong(secondString) % 97;
//            System.out.println(secondDivider);


            int minus98 = 98 - (int) secondDivider;
            String u = String.valueOf(minus98);
            if (u.length() == 1) {
                u = "0" + u;
            }

            String countryCode = "SK" + u + initialNumber; //SK42

            String finalIban = countryCode.substring(0, 4) + " " + countryCode.substring(4, 8)
                    + " " + countryCode.substring(8, 12) + " " + countryCode.substring(12, 16) + " " + countryCode.substring(16, 20) + " " + countryCode.substring(20, 24);

            System.out.println(finalIban);
            return finalIban;
        } else {
            System.out.println("Wrong input");
            return null;
        }
    }


    public boolean checkIban(String iban) {

        if (!iban.substring(0, 2).equals("SK") || !iban.substring(4, 8).equals("1100") &&
                !iban.substring(4, 8).equals("0720") && !iban.substring(4, 8).equals("0900") && !iban.substring(4, 8).equals("1111") &&
                !iban.substring(4, 8).equals("5200") || iban.length() > 24) {

            return false;
        } else {

            return true;
        }


    }
}
