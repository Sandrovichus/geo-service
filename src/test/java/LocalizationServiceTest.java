import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceTest {
    @Test
    void test_locale_Russia() {
        // arrange
        String expected = "Добро пожаловать";

        LocalizationService localizationService = new LocalizationServiceImpl();
        // act
        String result = localizationService.locale(Country.RUSSIA);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void test_locale_notRussia() {
        // arrange
        String expected = "Welcome";

        LocalizationService localizationService = new LocalizationServiceImpl();
        
        // act
        String result = localizationService.locale(Country.USA);
        
        // assert
        Assertions.assertEquals(expected, result);
    }
}
