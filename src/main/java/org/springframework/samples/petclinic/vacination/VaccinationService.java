package org.springframework.samples.petclinic.vacination;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VaccinationService {
	
	@Autowired
	private VaccinationRepository vaccinationRepository;
	
    public List<Vaccination> getAll(){
        return vaccinationRepository.findAll();
    }

    public List<Vaccine> getAllVaccines(){
        return null;
    }

    public Vaccine getVaccine(String typeName) {
        return vaccinationRepository.findVaccineByName(typeName);
    }
    
    @Transactional(rollbackFor = UnfeasibleVaccinationException.class)
    public Vaccination save(Vaccination p) throws UnfeasibleVaccinationException {
    	if (p.getVaccinatedPet().getType() == p.getVaccine().getPetType()) {
    		return vaccinationRepository.save(p); 
    	}else {
    		throw new UnfeasibleVaccinationException();
    	}
            
    }

    
}
