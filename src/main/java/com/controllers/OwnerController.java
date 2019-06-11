package com.controllers;

import com.model.Owner;
import com.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
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

    //       @ModelAttribute(binding=false)   no data binding, can also use @Model


    @GetMapping
    public String setupForm(
            @RequestHeader("Accept-Encoding") String encoding,
            @RequestParam("petId") int petId, Model model) {
        model.addAttribute("pet", new Object());
        return "petForm";
    }



/*    @RequestMapping("/")
    public String handle(@SessionAttribute User user) {
        // ...
    }

    @GetMapping("/")
    public String handle(@RequestAttribute Client client) {
        // ...
    }

    @GetMapping("/something")
    public ResponseEntity<String> handle() {
        String body = ... ;
        String etag = ... ;
        return ResponseEntity.ok().eTag(etag).build(body);
    }

    */

    // Returns a same model object to all request handler methods
    @ModelAttribute
    public void addCommonObjects(Model model){
        model.addAttribute("a","a");
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
       //  binder.setDisallowedFields();   takes an array of fields
    }

    @ResponseStatus(value = HttpStatus.BAD_GATEWAY)
    @ExceptionHandler(value = NullPointerException.class)
    public void handleNLP(Exception ex){
        /// handle NLP, return some error view, control is transferred here whenever there is exception occurs
    }
}
