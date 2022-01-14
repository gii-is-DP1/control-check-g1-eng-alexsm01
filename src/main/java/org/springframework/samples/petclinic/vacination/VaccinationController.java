package org.springframework.samples.petclinic.vacination;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class VaccinationController {
	
	@Autowired
	private VaccinationService vaccinationService;
	
	private static final String VIEWS_VACCINATION_CREATE_OR_UPDATE = "vaccination/createOrUpdateProductForm";
	
	/*
	@GetMapping(path="/create")
	public String initCreationForm(ModelMap modelMap) {
		String view = VIEWS_VACCINATION_CREATE_OR_UPDATE;
		
	}
    */
}
