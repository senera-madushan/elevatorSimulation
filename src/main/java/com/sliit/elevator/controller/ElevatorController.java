package com.sliit.elevator.controller;

import com.sliit.elevator.Service.ElevatorService;
import com.sliit.elevator.model.Elevator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/smartkent")
public class ElevatorController {
    @Autowired
    ElevatorService elevatorService;


   @RequestMapping(method = RequestMethod.GET,value = "/liftsimulation")
    public Elevator liftsimulation(@RequestParam Map<String,String> query){
        int fromFloor =Integer.parseInt(query.get("fromFloor"));
        int toFloor =Integer.parseInt(query.get("toFloor"));

            return elevatorService.pickAndDrop(fromFloor,toFloor);
    }
}
