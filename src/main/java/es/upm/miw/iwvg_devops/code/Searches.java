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

    public Stream<String> findUserFamilyNameBySomeImproperFraction(){
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(Fraction::isImproper))
                .map(User::getFamilyName);
    }

    public Double findFirstDecimalFractionByUserName(String userName) {
        return new UsersDatabase().findAll()
                .filter(user -> userName.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream())
                .filter(Objects::nonNull)
                .findFirst()
                .map(Fraction::decimal)
                .orElse(null);
    }

}