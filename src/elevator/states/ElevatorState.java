package elevator.states;

public abstract class ElevatorState {
    public ElevatorState() {
    }

    public ElevatorState higherFloorButtonPressed() {}
    public ElevatorState lowerFloorButtonPressed() {}
    public ElevatorState openDoorButtonPressed() {}
    public ElevatorState closeDoorButtonPressed() {}
}
