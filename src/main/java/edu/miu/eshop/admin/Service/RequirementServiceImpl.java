package edu.miu.eshop.admin.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.eshop.admin.Repository.RequirementRepository;
import edu.miu.eshop.admin.domain.Requirement;

@Service
public class RequirementServiceImpl implements RequirementService {

	
	@Autowired
	private RequirementRepository repository;

	
	
	@Override
	public void addRequirement(Requirement requirement) {
		repository.save(requirement);
		
	}

	@Override
	public Requirement getRequirement(Integer id) {
		Optional<Requirement> requirement = repository.findById(id);
		return requirement.orElse(null);
		
	}

	@Override
	public List<Requirement> getAllRequirement() {
		return repository.findAll();
	}
	
	
}
