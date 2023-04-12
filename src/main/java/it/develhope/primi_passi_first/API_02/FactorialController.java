package it.develhope.primi_passi_first.API_02;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/numbers")
public class FactorialController {
    @GetMapping("/factorial/{number}")
    public int getFactorial(@PathVariable Integer number){
        int factorialNum = 1;
        for(int i=1; i<=number; i++){
            factorialNum *= i;
        }
        return factorialNum;
    }
}
