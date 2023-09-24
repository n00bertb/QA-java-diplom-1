import org.junit.Test;
import ru.yandex.praktikum.*;

import static org.junit.Assert.assertEquals;

public class IngredientTest {
    @Test
    public void testGetType() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100);
        assertEquals(IngredientType.SAUCE, ingredient.getType());
    }

    @Test
    public void testGetName() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100);
        assertEquals("hot sauce", ingredient.getName());
    }

    @Test
    public void testGetPrice() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100);
        assertEquals(100.0f, ingredient.getPrice(), 0.01);
    }
}
