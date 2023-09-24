import org.junit.Test;
import ru.yandex.praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTypeTest {
    @Test
    public void selectSauceIngredientFromEnumIsCorrect() {
        assertEquals(IngredientType.valueOf("SAUCE"), IngredientType.SAUCE);
    }

    @Test
    public void selectFillingIngredientFromEnumIsCorrect() {
        assertEquals(IngredientType.valueOf("FILLING"), IngredientType.FILLING);
    }
}