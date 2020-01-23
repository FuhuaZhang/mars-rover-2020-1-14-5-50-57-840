package com.thoughtworks.marsrover;

class RoverStatus {
    private int x;
    private int y;
    private DirectionValue facing;;
}

enum DirectionValue {
    EAST, SOUTH, WEST, NORTH;
    int index;
}

public class MarsRover {
    private RoverStatus roverStatus;
    public void executeCommand(Command command){

    }
}
