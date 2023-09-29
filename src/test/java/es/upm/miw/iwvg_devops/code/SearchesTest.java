package es.upm.miw.iwvg_devops.code;

import es.upm.miw.iwvg_devops.code.Searches;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {
    private Searches searches;

    @BeforeEach
    void setUp() {
        searches = new Searches();
    }
    @Test
    void testFindDecimalFractionByNegativeSignFraction() {
        Stream<Double> expected = Stream.of(-0.2);
        Stream<Double> actual = searches.findDecimalFractionByNegativeSignFraction();
        List<Double> expectedList = expected.collect(Collectors.toList());
        List<Double> actualList = actual.collect(Collectors.toList());
        assertEquals(expectedList, actualList);
    }

    @Test
    void testFindUserFamilyNameBySomeImproperFraction() {
        Stream<String> expected = Stream.of("Fernandez", "Blanco","López","Torres","Torres");
        Stream<String> actual = searches.findUserFamilyNameBySomeImproperFraction();
        List<String> expectedList = expected.collect(Collectors.toList());
        List<String> actualList = actual.collect(Collectors.toList());
        assertEquals(expectedList, actualList);
    }

    @Test
    void testFindFirstDecimalFractionByUserName() {
        assertEquals(0.0, searches.findFirstDecimalFractionByUserName("Oscar"));
    }

    @Test
    void testFindFractionAdditionByUserId() {
        Fraction expectedFraction = new Fraction(3, 1);
        assertEquals(expectedFraction, searches.findFractionAdditionByUserId("1"));
    }
}
