package com.example.hackathonserver;

import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimController {

    //http://localhost:8081/api/anim.json
    @GetMapping("/api/anim.json")
    public AnimResponse[] getRandomLocation(){
        Random r = new Random();
        int low = 50;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        AnimResponse[] anim = getAnimResponses(result);
        return anim;
    }

    private AnimResponse[] getAnimResponses(int i) {
        AnimResponse[] anim = new AnimResponse[i];
        for(int counter = 0;counter<i;counter++){
            anim[counter] = getAnimResponse();
        }
        return anim;
    }


    private AnimResponse getAnimResponse(){
        Double[] coordinates;
        coordinates = new Double[2];


        //coordinates[1] = 59.2887D;

        Random r = new Random();
        int low = 100;
        int high = 1000;
        int result = r.nextInt(high-low) + low;
        coordinates[1]= 59.2887D + (double)result/10000 - (double).05 ;

        result = r.nextInt(high-low) + low;
        coordinates[0] = 18.0959D+ (double)result/10000 - (double).05;

        return new AnimResponse("driver1", "add", 5434,
            coordinates);
    }

}
