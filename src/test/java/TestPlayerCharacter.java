
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPlayerCharacter {

    @Test
    void getX_ShouldReturnNull() {
        assertEquals(0, PlayerCharacter.getX());
    }

}
