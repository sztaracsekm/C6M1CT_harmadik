package hu.c6m1ct.beadandoFeladat.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/harmadik")

public class MainController {

    @GetMapping("")
    public Response greetUser(@RequestParam(defaultValue = "Felhasznalo") String name){

        String response = String.format("Hello %s", name);
        return Response.builder().content(response).build();
    }

    @PostMapping("")
    public Response flipMessage(@RequestParam(defaultValue = "Alma a fa alatt") String text){

        String response = new StringBuffer(text).reverse().toString();
        return Response.builder().content(response).build();
    }


}
