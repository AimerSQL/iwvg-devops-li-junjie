package es.upm.miw.iwvg_devops.code;

import es.upm.miw.iwvg_devops.code.Searches;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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
}