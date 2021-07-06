package com.springProject.Financial_Goal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springProject.Financial_Goal.Dao.GoalDao;
import com.springProject.Financial_Goal.entities.Goal;

@Service
public class GoalServiceImpl implements GoalService {

//	List<Goal> list;

	@Autowired
	private GoalDao goalDao;

	public GoalServiceImpl() {

		/*
		 * list = new ArrayList<>();
		 * 
		 * Goal g1 = new Goal(1, "Buy Laptop", 5000, 0, new ArrayList<>(), false); Goal
		 * g2 = new Goal(2, "Buy phone", 1000, 0, new ArrayList<>(), false);
		 * list.add(g1); list.add(g2);
		 */

	}

	@Override
	public List<Goal> getGoals() {
		// TODO Auto-generated method stub

		return goalDao.findAll();

	}

	@Override
	public Goal getGoal(int goal_Id) {
		// TODO Auto-generated method stub

		/*
		 * for (int i = 0; i < list.size(); i++) { if (list.get(i).getGoal_Id() ==
		 * Integer.parseInt(goal_Id)) { return list.get(i); } }
		 */

		return goalDao.getById(goal_Id);
	}

	@Override
	public Goal addGoal(Goal goal) {

		// list.add(goal);

		goalDao.save(goal);
		return goal;
	}

	@Override
	public Goal updateGoal(Goal goal) {
		// TODO Auto-generated method stub
		/*
		 * for (Goal g : list) { if (g.getGoal_Id() == GoalId) {
		 * g.getTransactions().add(addamount); g.setCurrent_amount(addamount +
		 * g.getCurrent_amount());
		 * 
		 * if (g.getCurrent_amount() >= g.getTarget_amount()) { g.setCompleted(true); }
		 * 
		 * }
		 * 
		 * }
		 */
		goalDao.save(goal);
		return goal;
	}

	@Override
	public ResponseEntity<HttpStatus> deleteGoal(int goal_Id) {
		// TODO Auto-generated method stub

		/*
		 * for (int i = 0; i < list.size(); i++) {
		 * 
		 * if (list.get(i).getGoal_Id() == goalId) {
		 * 
		 * list.remove(i); break; }
		 * 
		 * }
		 */
		Goal entity = goalDao.getById(goal_Id);
		goalDao.delete(entity);
		return null;
	}

}
