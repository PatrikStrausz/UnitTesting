package sk.itsovy.strausz.project.unit.testing;

public class Main {
    public static void main(String[] args) {

        int x[] = {5,1,2,3};

        MyMath math = new MyMath();
        Information info = new Information();
        Text text = new Text();
//        System.out.println(math.getMinValue(x));
        System.out.println(math.isPrimeNumber(105));
        System.out.println(math.existTriangle(2,2,5));
        System.out.println(text.reverse("Banany"));
        System.out.println(info.convertToBinary(255));

    }
}
