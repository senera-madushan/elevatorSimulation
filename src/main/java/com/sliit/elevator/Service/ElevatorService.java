package com.sliit.elevator.Service;

import com.sliit.elevator.model.Elevator;
import org.springframework.stereotype.Service;

@Service
public interface ElevatorService {
    public Elevator pickAndDrop(int fromFloor,int toFloor);
}
