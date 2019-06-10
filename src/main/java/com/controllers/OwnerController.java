package com.controllers;

import com.model.Owner;
import com.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OwnerController {
    @Autowired
    OwnerService ownerService;

    @GetMapping("/owners")
    @ResponseBody
    public List<Owner> get() {
        return ownerService.get();
    }

    @GetMapping("/owners/{id}")
    @ResponseBody
    public Owner retrieve(@PathVariable String id) {
        return ownerService.retrieve(id);
    }

    @PostMapping(value = "/owners")
    @ResponseBody
    public Owner crete(@ModelAttribute Owner owner) {
        return ownerService.create(owner);
    }

    @PatchMapping("/owners/{id}")
    @ResponseBody
    public Owner update(@PathVariable String id, @RequestBody Owner owner) {
        return ownerService.update(id, owner);
    }

    @DeleteMapping("/owners/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        ownerService.delete(id);
    }
}
