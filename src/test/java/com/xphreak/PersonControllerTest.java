package com.xphreak;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.xphreak.controller.PersonController;
import com.xphreak.service.ChangePersonService;
import com.xphreak.service.impl.ChangePersonServiceImpl;

public class PersonControllerTest {
	private PersonController personController;
	private ChangePersonService changePersonService;

	@Before
	public void setup() {
		changePersonService = new ChangePersonServiceImpl();
		personController = new PersonController(changePersonService);
	}

	@Test
	public void testHandlerShowPerson() {
		final ModelAndView modelAndView = personController.handlerShowPerson();

		Assert.assertNotNull(modelAndView);
		Assert.assertNotNull(modelAndView.getModel().get("thePerson"));
	}
}
