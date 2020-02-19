package sk.itsovy.strausz.project.unit.testing;


public class MyMath {


    public boolean isPrimeNumber(int number) {
        boolean isPrime = true;
        if(number ==0 || number == 1){
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public int getMinValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;


    }

    public boolean existTriangle(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return true;
        } else {
            return false;
        }


    }


}
