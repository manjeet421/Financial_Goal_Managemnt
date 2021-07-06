package com.springProject.Financial_Goal.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Goal {

	@Id
	int Goal_Id;

	String Goal_name;
	int target_amount;
	int current_amount;
	List<Integer> transactions;
	Boolean completed;

	/**
	 * @param goal_Id
	 * @param goal_name
	 * @param target_amount
	 * @param current_amount
	 * @param transactions
	 * @param completed
	 */
	public Goal(int goal_Id, String goal_name, int target_amount, int current_amount, List<Integer> transactions,
			Boolean completed) {
		super();
		Goal_Id = goal_Id;
		Goal_name = goal_name;
		this.target_amount = target_amount;
		this.current_amount = current_amount;
		this.transactions = transactions;
		this.completed = completed;
	}

	/**
	 * 
	 */
	public Goal() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the goal_Id
	 */
	public int getGoal_Id() {
		return Goal_Id;
	}

	/**
	 * @param goal_Id the goal_Id to set
	 */
	public void setGoal_Id(int goal_Id) {
		Goal_Id = goal_Id;
	}

	/**
	 * @return the goal_name
	 */
	public String getGoal_name() {
		return Goal_name;
	}

	/**
	 * @param goal_name the goal_name to set
	 */
	public void setGoal_name(String goal_name) {
		Goal_name = goal_name;
	}

	/**
	 * @return the target_amount
	 */
	public int getTarget_amount() {
		return target_amount;
	}

	/**
	 * @param target_amount the target_amount to set
	 */
	public void setTarget_amount(int target_amount) {
		this.target_amount = target_amount;
	}

	/**
	 * @return the current_amount
	 */
	public int getCurrent_amount() {
		return current_amount;
	}

	/**
	 * @param current_amount the current_amount to set
	 */
	public void setCurrent_amount(int current_amount) {
		this.current_amount = current_amount;
	}

	/**
	 * @return the transactions
	 */
	public List<Integer> getTransactions() {
		return transactions;
	}

	/**
	 * @param transactions the transactions to set
	 */
	public void setTransactions(List<Integer> transactions) {
		this.transactions = transactions;
	}

	/**
	 * @return the completed
	 */
	public Boolean getCompleted() {
		return completed;
	}

	/**
	 * @param completed the completed to set
	 */
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

}
