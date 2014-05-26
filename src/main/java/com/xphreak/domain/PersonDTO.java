package com.xphreak.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString(includeFieldNames=true)
public class PersonDTO {
    private String firstName;
    private String lastName;
    private String middleName;
}
