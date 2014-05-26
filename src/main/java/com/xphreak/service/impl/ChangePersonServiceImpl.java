package com.xphreak.service.impl;

import org.springframework.stereotype.Service;

import com.xphreak.domain.PersonDTO;
import com.xphreak.service.ChangePersonService;

@Service("hangePersonService")
public class ChangePersonServiceImpl implements ChangePersonService {
    public PersonDTO changePerson(final PersonDTO personToChange) {
        personToChange.setFirstName(personToChange.getFirstName() + "XXX");
        personToChange.setLastName(personToChange.getLastName() + "XXX");
        personToChange.setMiddleName(personToChange.getMiddleName() + "XXX");
        
        return personToChange;
    }
}
