package com.example.hackathonserver;

import com.example.hackathonserver.dao.Position;
import com.example.hackathonserver.dao.PositionDao;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PositionController {

    private PositionDao positionDao;

    public PositionController(PositionDao positionDao){
        this.positionDao = positionDao;
    }

    //http://localhost:8081/api/position.json
    @GetMapping("/api/position.json")
    public List<Position> getRandomLocation(){

        return positionDao.listStudents(100);
    }

    static int limit = 0;

    //http://localhost:8081/api/positionanim.json
    @GetMapping("/api/positionanim.json")
    public List<AnimResponse> getPositionsForOneUser(){
        if(limit == 15000) limit = 0;
        return positionDao.listStudents(limit+=100).stream().map(
            position -> new AnimResponse("dr", "ad", 4212,
                new Double[]{position.getLon(),position.getLat()}))
            .collect(Collectors.toList());
    }

    //http://localhost:8081/api/posusers.json

    @GetMapping("/api/posusers.json")
        public List<AnimResponse> getPositionsForUsers(){
            if(limit == 4000000) limit = 0;
        System.out.println(limit);
            return positionDao.listPointsForUsers(limit+=10000, 163).stream().map(
                position -> new AnimResponse("", "", 4212,
                    new Double[]{position.getLon(),position.getLat()}))
                .collect(Collectors.toList());
        }


}
