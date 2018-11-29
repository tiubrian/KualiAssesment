package elevator.states;

/*
    Each individual elevator will do it's appropriate action based off of what object it is.
    It will then return the resulting state it is at.

    I do not implement each function in the children classes but it is obvious what they should do
 */

public abstract class ElevatorState {
    public ElevatorState higherFloorButtonPressed() {}
    public ElevatorState lowerFloorButtonPressed() {}
    public ElevatorState openDoorButtonPressed() {}
    public ElevatorState closeDoorButtonPressed() {}
}
