package edu.miu.eshop.admin.Service;

import java.util.List;

import edu.miu.eshop.admin.domain.Requirement;

public interface RequirementService {

	public void addRequirement(Requirement requirement);
	public Requirement getRequirement(Integer id);
	public List<Requirement> getAllRequirement();
}
