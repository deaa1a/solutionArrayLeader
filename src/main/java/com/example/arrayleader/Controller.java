package com.example.arrayleader;

import com.example.arrayleader.dto.RequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Solution solution;

    @PostMapping("/numbers/leaders")
    public ResponseEntity<int[]> validateLeaders(@RequestBody RequestDTO request){
        return new ResponseEntity<>(solution.solution(request.getK(),request.getM(),request.getA()), HttpStatus.ACCEPTED);
    }
}
