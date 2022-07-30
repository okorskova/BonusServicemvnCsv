import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")

     public void TestRegisteredUnderLimit(long expected, long amount, boolean registered) {
        BonusService service = new BonusService();

             long actual = service.calculate(amount, registered);

             Assertions.assertEquals(expected, actual);
    }

}
