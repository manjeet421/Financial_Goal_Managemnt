package com.springProject.Financial_Goal.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springProject.Financial_Goal.entities.Goal;

public interface GoalDao extends JpaRepository<Goal, Integer> {

}
