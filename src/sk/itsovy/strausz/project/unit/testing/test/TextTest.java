package sk.itsovy.strausz.project.unit.testing.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sk.itsovy.strausz.project.unit.testing.Text;
import static junit.framework.TestCase.assertEquals;

class TextTest {
    private Text text;

    @BeforeEach
    void setUp() {
        text = new Text();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void reverse() {

        assertEquals("sep", text.reverse("pes"));
        assertEquals("ysp avD", text.reverse("Dva psy"));
        assertEquals("ysp elam irT", text.reverse("Tri male psy"));
        assertEquals("retrevnoc yraniB ot lamiceD", text.reverse("Decimal to Binary converter"));
        assertEquals("ecneirepxe ruoy evorpmi ot 5 seikooc ! sesu etisbew 2 sihT", text.reverse("This 2 website uses ! cookies 5 to improve your experience"));
    }
}