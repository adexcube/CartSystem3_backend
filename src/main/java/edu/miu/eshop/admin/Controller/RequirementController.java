package edu.miu.eshop.admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.eshop.admin.Service.RequirementService;
import edu.miu.eshop.admin.domain.Requirement;

@RestController
@RequestMapping("/requirement")
public class RequirementController {

	@Autowired
	private RequirementService service;
	
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllRequirement() {
		return new ResponseEntity<List<Requirement>>(service.getAllRequirement(), HttpStatus.OK);
	}
	
	
	
	@GetMapping("/one")
	public ResponseEntity<?> getOneRequirement(@RequestBody Integer id) {
		return new ResponseEntity<Requirement>(service.getRequirement(id), HttpStatus.OK);
	}
	
	
	
	@PostMapping("/add")
	public ResponseEntity<?> addRequirement(@RequestBody Requirement requirement) {
		return new ResponseEntity<String>("Request created successfully", HttpStatus.OK);
	}
	
}
