package com.xphreak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xphreak.domain.PersonDTO;
import com.xphreak.service.ChangePersonService;

@Controller
public class PersonController {
    private final ChangePersonService changePersonService;
    
    @Autowired
    public PersonController(final ChangePersonService changePersonService) {
        this.changePersonService = changePersonService;
    }
    
    @RequestMapping(value="/person.html", method = RequestMethod.GET)
    public ModelAndView handlerShowPerson() {
        final ModelAndView modelAndView = new ModelAndView("person");
        final PersonDTO thePerson = new PersonDTO();
        thePerson.setFirstName("Zolt");
        thePerson.setLastName("Egete");
        
        final PersonDTO changedPerson = changePersonService.changePerson(thePerson);
        modelAndView.addObject("thePerson", changedPerson);
        
        return modelAndView;
    }
}
