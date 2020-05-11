package com.sliit.elevator.Service;

import com.sliit.elevator.model.Elevator;
import org.springframework.stereotype.Component;

@Component
public class ElevatorServiceImpl implements ElevatorService {
    @Override
    public Elevator pickAndDrop(int fromFloor, int toFloor) {

        Elevator obj = new Elevator();
        obj.setFloor(1);
        obj.setDirection("no");

        return obj;
    }
}
