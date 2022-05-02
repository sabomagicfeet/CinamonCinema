import java.util.ArrayList;
import java.util.List;

public class SeatsPlan {

    private List<Seat> seats;

    public SeatsPlan() {
        seats = new ArrayList<Seat>();

        for(int i = 0; i < 3; i ++) {
            for(int j = 0; j < 5; j ++) {
                // if i is 0, put 'A' to the constructor
                // if i is 1, put 'B'
                // if i is 2, put 'C'

                switch(i) {
                    case 0:
                        seats.add(new Seat('A', j + 1, false));
                        break;

                    case 1:
                        seats.add(new Seat('B', j + 1, false));
                        break;

                    case 2:
                        seats.add(new Seat('C', j + 1, false));
                        break;
                }
            }
        }
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
