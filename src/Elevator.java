import states.ElevatorState;
import states.ElevatorStateEnum;
import states.RestingAtBottomState;

public class Elevator {

    // An elevator can only been in one state at a time
    ElevatorState elevatorState;

    public Elevator() {
        // I'm going to assume the elevator starts at floor 1
        elevatorState = new RestingAtBottomState();

        runElevator();
    }

    private void runElevator() {

        for(;;) { // I like this better than while(true) cause there's no magic numbers lol
            ElevatorStateEnum command = getButtonPress(); // <= this method doesn't exist but is there in place to capture button presses in the elevator
            switch(command) {
                case HIGHER_FLOOR_BUTTON_PRESSED:
                    elevatorState = elevatorState.higherFloorButtonPressed();
                    break;
                case LOWER_FLOOR_BUTTON_PRESSED:
                    elevatorState = elevatorState.higherFloorButtonPressed();
                    break;
                case OPEN_DOOR_BUTTON_PRESSED:
                    elevatorState = elevatorState.higherFloorButtonPressed();
                    break;
                case CLOSE_DOOR_BUTTON_PRESSED:
                    elevatorState = elevatorState.higherFloorButtonPressed();
                    break;
            }
        }

    }


}
