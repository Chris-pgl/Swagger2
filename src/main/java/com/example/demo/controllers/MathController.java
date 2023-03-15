package com.example.demo.controllers;


import com.example.demo.entities.ArithmeticOperation;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
@Api(value = "MathController", tags = { "Math Operations" })
public class MathController {

    @GetMapping("")
    public String welcomeMathMsg(){
        return "Welcome to the math operations controller!";
    }


    @GetMapping("/division")
    public int division(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2 ){
        return num1 / num2;
    }

    @GetMapping("/moltiplication")
    public int moltiplication(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2 ){
        return num1 * num2;
    }

    @GetMapping("/sum")
    public int sum (@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2 ) {
        return num1 + num2;
    }



    @GetMapping("/sub")
    public int sub(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2 ){
            return num1 - num2;
        }

}
