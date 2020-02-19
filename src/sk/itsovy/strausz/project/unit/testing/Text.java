package sk.itsovy.strausz.project.unit.testing;

public class Text {
    public String reverse(String text) {
        StringBuilder d = new StringBuilder();
        char[] z = text.toCharArray();

        for (int i = z.length - 1; i >= 0; i--) {
            d.append(z[i]);

        }
        return d.toString();
    }
}
