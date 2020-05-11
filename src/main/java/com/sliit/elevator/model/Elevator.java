package com.sliit.elevator.model;

import com.sliit.elevator.constraints.Direction;
import com.sliit.elevator.constraints.State;
import lombok.Data;

@Data
public class Elevator {
    private String liftId;
    private State state;
    private Direction direction;
    private int person;
    private int floor;

    public Elevator(String liftId, State state, Direction direction, int person, int floor) {
        this.liftId = liftId;
        this.state = state;
        this.direction = direction;
        this.person = person;
        this.floor = floor;
    }

    public Elevator(){

    }
}
