import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeatTest {

    @Test
    public void initOneSeatTest() {
        // Arrange
        Seat seat = new Seat('A', 1, false);

        // Act
        boolean expected = false;
        boolean acutaul = seat.isAllocated();

        // Assert
        Assertions.assertEquals(expected, acutaul);

    }
}
