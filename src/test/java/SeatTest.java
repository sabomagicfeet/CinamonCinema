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

    @Test
    public void initFifteenSeatTest() {
        SeatsPlan seatsPlan = new SeatsPlan();

        for(int i = 0; i < 15; i ++) {
            Assertions.assertEquals(false, seatsPlan.getSeats().get(i).isAllocated() );
        }
    }



}
