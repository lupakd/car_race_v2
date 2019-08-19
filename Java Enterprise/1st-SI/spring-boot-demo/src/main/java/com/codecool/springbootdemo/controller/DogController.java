package com.codecool.springbootdemo.controller;

import com.codecool.springbootdemo.model.Dog;
import com.codecool.springbootdemo.service.DogStorge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/dog")
public class DogController {

    @Autowired
    private DogStorge dogStorge;

    @GetMapping("/list")
    public List<Dog> dogList() {
        return dogStorge.getDogs();
    }

    @GetMapping("/random")
    public Dog createRandomDog() {
        return dogStorge.addRandomDog();
    }

    @PostMapping("/add")
    public Dog addDog(@RequestBody @Valid Dog dog) {
        dogStorge.addDog(dog);
        return dog;
    }

    @PutMapping("/{name}")
    public Dog update(@PathVariable("name") String name, @RequestBody Dog dog) throws Exception {
        return dogStorge.update(name, dog);

    }


}
