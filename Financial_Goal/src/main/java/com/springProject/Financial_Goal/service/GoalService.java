
package com.springProject.Financial_Goal.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.springProject.Financial_Goal.entities.Goal;

public interface GoalService {

	public List<Goal> getGoals();

	public Goal addGoal(Goal goal);

	public Goal updateGoal(Goal goal);

	public ResponseEntity<HttpStatus> deleteGoal(int parseInt);

	Goal getGoal(int goal_Id);

}
