package tm.SpringBootRestApi.repositories;

import org.springframework.data.repository.CrudRepository;

import tm.SpringBootRestApi.entities.Organization;

public interface OrganizationRepository extends CrudRepository<Organization,Long>{

}
