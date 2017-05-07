package com.psideris.pharmacy.services;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.psideris.pharmacy.entities.Doctor;

@Component
public class DoctorService {

	private Log LOG = LogFactory.getLog(DoctorService.class);
	
	@Autowired
	private List<Doctor> doctors;
	
	public void addNewDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	
	public List<Doctor> getDoctorsList() {
		return doctors;
	}
	
	public Doctor getDoctorByEmail(String email) {
		Optional<Doctor> doc = doctors.stream().filter(e -> e.getEmail().equals(email))
						.findFirst();
		return doc.isPresent() ? (Doctor) doc.get() : null;
	}
	
	public Doctor getDoctorByName(String firstName, String lastName) {
		Optional<Doctor> doc = doctors.stream()
						.filter(e -> e.getFirstName().equalsIgnoreCase(firstName) && e.getLastName().equalsIgnoreCase(lastName))
						.findFirst();
		return doc.isPresent() ? (Doctor) doc.get() : null;
	}
	
	public void deleteDoctorByEmail(String email) {
		for(Doctor doc: doctors) {
			if(doc.getEmail().equalsIgnoreCase(email)) {
				LOG.debug("Deleting the Doctor with email: " + doc.getEmail());
				doctors.remove(doc);
			}
		}
	}
	
	@ModelAttribute("dummyDoctor")
	public Doctor getDumpDoctor() {
		return new Doctor("Isidoros", "Sideris", "isideris@bmj.com", "isid", "surgeon", "London 1");
	}
}
