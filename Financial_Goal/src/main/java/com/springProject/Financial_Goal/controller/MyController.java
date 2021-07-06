package com.springProject.Financial_Goal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springProject.Financial_Goal.entities.Goal;
import com.springProject.Financial_Goal.service.GoalService;

@RestController
public class MyController {

	@Autowired
	private GoalService goalservice;

	@GetMapping("/goals")
	public List<Goal> getGoals() {
		return goalservice.getGoals();

	}

	@GetMapping("/goals/{Goal_Id}")
	public Goal getGoal(@PathVariable String Goal_Id) {
		return goalservice.getGoal(Integer.parseInt(Goal_Id));

	}

	@PostMapping("/goals")
	public Goal addGoal(@RequestBody Goal goal) {
		return this.goalservice.addGoal(goal);

	}

	@PutMapping("/goals")
	public Goal updateGoal(@RequestBody Goal goal) {
		return this.goalservice.updateGoal(goal);
	}

	@DeleteMapping("/goals/{Goal_Id}")
	public ResponseEntity<HttpStatus> deleteGoal(@PathVariable String Goal_Id) {
		try {
			return this.goalservice.deleteGoal(Integer.parseInt(Goal_Id));
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
