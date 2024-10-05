//pstori2s & dtunce2s
package org.hbrs.se1.ws24.exercises.uebung1.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.hbrs.se1.ws24.exercises.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws24.exercises.uebung1.control.Translator;
import org.junit.jupiter.api.Test;

public class GermanTranslatorTest {

    @Test
    public void aTest() {
        GermanTranslator translator = new GermanTranslator();

        assertEquals("null" , translator.translateNumber(0));
    }

        @Test
        void testValidNumbers() {
            GermanTranslator translator = new GermanTranslator();
            assertEquals("eins", translator.translateNumber(1));
            assertEquals("zehn", translator.translateNumber(10));
            assertEquals("sechs", translator.translateNumber(6));
            assertEquals("acht", translator.translateNumber(8));
            assertEquals("neun", translator.translateNumber(9));
            assertEquals("drei", translator.translateNumber(3));
            assertEquals("zwei", translator.translateNumber(2));
        }

        @Test
        void testInvalidNumbers() {
            GermanTranslator translator = new GermanTranslator();
            assertEquals("Übersetzung der Zahl 99 nicht möglich (1.0)", translator.translateNumber(99));
            assertEquals("Übersetzung der Zahl -11 nicht möglich (1.0)", translator.translateNumber(-11));
            assertEquals("Übersetzung der Zahl 15 nicht möglich (1.0)", translator.translateNumber(15));
            assertEquals("Übersetzung der Zahl -672 nicht möglich (1.0)", translator.translateNumber(-672));
            assertEquals("Übersetzung der Zahl -19 nicht möglich (1.0)", translator.translateNumber(-19));
            assertEquals("Übersetzung der Zahl 377 nicht möglich (1.0)", translator.translateNumber(377));
            assertEquals("Übersetzung der Zahl 111 nicht möglich (1.0)", translator.translateNumber(111));
        }

        public static void main(String[] args) {
            GermanTranslator translator = new GermanTranslator();
        System.out.println(translator.translateNumber(-11));
        System.out.println(translator.getDate());
        }
    }
