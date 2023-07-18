package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;


public class GeoServiceTest {
    @Test
    void test_byIp_Localhost() {
        // arrange
        Location expected = new Location("Moscow", Country.RUSSIA, "Lenina", 15);

        GeoService testGeoService = new GeoServiceImpl();
        // act
        Location result = testGeoService.byIp("172.0.32.11");

        // assert
        Assertions.assertEquals(expected.getCity(), result.getCity());
        Assertions.assertEquals(expected.getCountry(), result.getCountry());
        Assertions.assertEquals(expected.getStreet(), result.getStreet());
        Assertions.assertEquals(expected.getBuiling(), result.getBuiling());
    }
}
