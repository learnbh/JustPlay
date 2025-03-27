
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPlayerCharacter {

    @Test
    void getX_shouldReturnNull() {
        assertEquals(0, PlayerCharacter.getX());
    }
    @Test
    void getY_ShouldReturnNull() {
        assertEquals(0, PlayerCharacter.getY());
    }
    @Test
    void move_ShouldReturnArr01_afterPressingKeyW() {
        int[] expected = new int[] {0,1};
        assertArrayEquals(expected, PlayerCharacter.move("W"));
    }
    @Test
    void move_ShouldReturnArr0neg1_afterPressingKeyS() {
        int[] expected = new int[] {0,-1};
        assertArrayEquals(expected, PlayerCharacter.move("S"));
    }
    @Test
    void move_ShouldReturnArrneg10_afterPressingKeyD() {
        int[] expected = new int[] {1,0};
        assertArrayEquals(expected, PlayerCharacter.move("D"));
    }
    @Test
    void move_ShouldReturnArrneg10_afterPressingKeyA() {
        int[] expected = new int[] {-1,0};
        assertArrayEquals(expected, PlayerCharacter.move("A"));
    }
}
