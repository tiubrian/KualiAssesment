package elevator_manager;

import elevator.Elevator;

import java.util.HashSet;

public class ElevatorManager {
    final int NUM_OF_FLOORS = 100; // 100 is just a place holder
    final int NUM_OF_ELEVATORS = 5;

    HashSet<Elevator> elevatorsMovingUp;
    HashSet<Elevator> elevatorsMovingDown;
    HashSet<Elevator> elevatorsRestingAtBottom;
    HashSet<Elevator> elevatorsRestingAtTop;

    public ElevatorManager() {
        // put all elevators at the bottom
        runElevators();
    }

    private void runElevators() {
        for(;;) {
            ElevatorRequest request = getElevatorRequest();// <= this function isn't implemented but is here to capture customers requesting for an elevator
            Elevator bestElevator = findBestElevator(request);
            bestElevator.handleRequest(request);
        }
    }

    private Elevator findBestElevator(ElevatorRequest request) {
        /*
            1) Get the direction and floor out of the request object
            2) Depending on the direction, look into the appropriate HashSets
            3) First look at the ones moving already and see if they have passed the floor.
            4) If they haven't, use those elevators. If not, us the resting ones
         */
        return bestElevator;
    }


}
