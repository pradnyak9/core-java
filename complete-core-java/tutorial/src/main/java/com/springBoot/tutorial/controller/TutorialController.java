package com.springBoot.tutorial.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.tutorial.domain.Tutorial;
import com.springBoot.tutorial.repositories.TutorialRepository;
import com.sprintBoot.tutorial.exception.TutorialNotFoundException;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TutorialController {

	@Autowired
	TutorialRepository tutorialRepository;

	@GetMapping("/tutorials")
	public ResponseEntity<List<Tutorial>> getAllTutorials(@RequestParam(required = false) String title) {
		
		try {
			
			List<Tutorial> tutorials = new ArrayList<Tutorial>();
			if(title == null)
				tutorialRepository.findAll().forEach(tutorials::add);
			else
				tutorialRepository.findByTitleContaining(title).forEach(tutorials::add);
			
			if (tutorials.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<List<Tutorial>>(tutorials, HttpStatus.OK);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@PostMapping("/tutorials")
	public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
		try {
			Tutorial _tutorial = tutorialRepository.save(new Tutorial(tutorial.getTitle(), tutorial.getDescription(),
					tutorial.isPublished(), tutorial.getPublisher()));
			
			return new ResponseEntity<Tutorial>(_tutorial, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/tutorials/{id}")
	public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id) {
		
		Optional<Tutorial> tutorial = tutorialRepository.findById(id);
		
		if(tutorial.isPresent()) {
			return new ResponseEntity<Tutorial>(tutorial.get(), HttpStatus.OK);
		} 
		
		throw new TutorialNotFoundException("id: "+id);
		
	}
	
	@PutMapping("/tutorials/{id}")
	public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
		
		try {
			Optional<Tutorial> tutorialData = tutorialRepository.findById(id);
			
			if(tutorialData.isPresent()) {
				Tutorial _tutorial = tutorialData.get();
				_tutorial.setTitle(tutorial.getTitle());
				_tutorial.setDescription(tutorial.getDescription());
				_tutorial.setPublished(tutorial.isPublished());
				_tutorial.setPublisher(tutorial.getPublisher());
				
				return new ResponseEntity<>(tutorialRepository.save(_tutorial), HttpStatus.OK);
			} 
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("tutorials/{id}")
	public ResponseEntity<Tutorial> deleteTutorial(@PathVariable("id") long id) {
		
		try {
			tutorialRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("tutorials/published")
	public ResponseEntity<List<Tutorial>> findByPublished() {
		try {
			List<Tutorial> publishedTutorials = tutorialRepository.findByPublished(false);
			
			publishedTutorials.forEach(System.out::println);
			if(publishedTutorials.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<List<Tutorial>>(publishedTutorials, HttpStatus.OK);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}













