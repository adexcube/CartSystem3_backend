package edu.miu.eshop.admin.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.miu.eshop.admin.domain.Requirement;

@Repository
public interface RequirementRepository extends MongoRepository<Requirement, Integer> {

	

}
