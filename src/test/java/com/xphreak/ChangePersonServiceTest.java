package com.xphreak;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.xphreak.domain.PersonDTO;
import com.xphreak.service.ChangePersonService;
import com.xphreak.service.impl.ChangePersonServiceImpl;

public class ChangePersonServiceTest {
	private ChangePersonService changePersonService;

	@Before
	public void setup() {
		changePersonService = new ChangePersonServiceImpl();
	}

	@Test
	public void testChangePerson() {
		final PersonDTO personToChange = new PersonDTO();
		personToChange.setFirstName("zolt");
		personToChange.setLastName("egete");

		final PersonDTO changedPerson = changePersonService
				.changePerson(personToChange);

		Assert.assertNotNull(changedPerson);
		Assert.assertEquals("zoltXXX", changedPerson.getFirstName());
	}
}
