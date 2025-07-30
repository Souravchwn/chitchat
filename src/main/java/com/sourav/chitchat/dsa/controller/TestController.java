package com.sourav.chitchat.dsa.controller;

import com.sourav.chitchat.dsa.controller.algorithms.DPProblems;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by souravkumarchowhan on 30/07/2025
 *
 * @author : souravkumarchowhan
 * @Date : 30/07/2025
 * @File : {@link TestController}
 */
@RestController
public class TestController {
    private final DPProblems dpProblems;

    public TestController(DPProblems dpProblems) {
        this.dpProblems = dpProblems;
    }

    @GetMapping("/fibonacci")
    public ResponseEntity<Object> fibonacciSeries(@RequestParam(value = "n", defaultValue = "10") int n) {
        return ResponseEntity.ok(dpProblems.fibonacci(n));

    }
}
