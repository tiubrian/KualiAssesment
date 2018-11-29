public class ElevatorRequest {
    private int floor;
    private ElevatorRequestButton button;

    public ElevatorRequest(int floor, ElevatorRequestButton button) {
        this.floor = floor;
        this.button = button;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public ElevatorRequestButton getButton() {
        return button;
    }

    public void setButton(ElevatorRequestButton button) {
        this.button = button;
    }
}

