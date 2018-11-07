package org.jvi.error.handling.controller;

import org.jvi.error.handling.exception.DataIntegrityViolationFromHandlerException;
import org.jvi.error.handling.exception.MonException;
import org.jvi.error.handling.exception.MonExceptionAvecCustomResponseStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("error-handling")
public class TestController {

	@GetMapping("500")
	public void get500Error() {

		// Cette erreur sera loggée par défaut
		throw new RuntimeException("Une erreur 500");
	}

	@GetMapping("monexception")
	public void getMonexception() {

		// Cette erreur sera loggée par défaut
		throw new MonException("Message de MonException");
	}

	@GetMapping("MonExceptionAvecCustomResponseStatus")
	public void getMonExceptionAvecCustomResponseStatus() {

		// Cette erreur ne sera PAS loggée par défaut, parce que @ResponseStatus
		// est annoté sur la classe?

		throw new MonExceptionAvecCustomResponseStatus("Message de MonExceptionAvecCustomResponseStatus");
	}

	@GetMapping("DataIntegrityViolationFromHandlerException")
	public void getDataIntegrityViolationFromHandlerException() {

		// Cette erreur ne sera PAS loggée par défaut, parce que on l'utilise
		// dans un exception handler?

		throw new DataIntegrityViolationFromHandlerException("Message de DataIntegrityViolationFromHandlerException");
	}

}
