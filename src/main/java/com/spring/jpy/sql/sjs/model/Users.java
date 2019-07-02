package com.spring.jpy.sql.sjs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="users", catalog="test")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	@Column(name="salary")
	private Integer salery;
	
	@Column(name="team_id")
	private Integer teamName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalery() {
		return salery;
	}
	public void setSalery(Integer salery) {
		this.salery = salery;
	}
	public Integer getTeamName() {
		return teamName;
	}
	public void setTeamName(Integer teamName) {
		this.teamName = teamName;
	}

	
	
}
