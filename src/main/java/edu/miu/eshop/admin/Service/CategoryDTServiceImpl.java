package edu.miu.eshop.admin.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.eshop.admin.Repository.CategoryDTRepository;
import edu.miu.eshop.admin.domain.CategoryDT;


@Service
public class CategoryDTServiceImpl implements CategoryDTService {

	@Autowired
	private CategoryDTRepository repository;
	
	
}
