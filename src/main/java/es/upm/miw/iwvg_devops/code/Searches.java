package es.upm.miw.iwvg_devops.code;

import org.apache.logging.log4j.LogManager;

import java.util.Objects;
import java.util.stream.Stream;

public class Searches {

    public Stream<Double> findDecimalFractionByNegativeSignFraction() {
        return new UsersDatabase().findAll()
                .flatMap(user -> user.getFractions().stream())
                .filter(fraction -> fraction.getNumerator() < 0)
                .map(Fraction::decimal);
    }



}