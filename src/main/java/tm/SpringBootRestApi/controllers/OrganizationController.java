package tm.SpringBootRestApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tm.SpringBootRestApi.entities.Organization;
import tm.SpringBootRestApi.repositories.OrganizationRepository;

@RestController
public class OrganizationController {
	@Autowired
	private OrganizationRepository organizationRepository;
	
	@RequestMapping("/organizations")
	public Iterable<Organization> getOrganizations(){
		return organizationRepository.findAll();
	}
}
