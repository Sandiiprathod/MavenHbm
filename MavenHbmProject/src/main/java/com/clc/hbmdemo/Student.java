package com.clc.hbmdemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	private int stdId;
	private String stdName;
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdNaame=" + stdName + "]";
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdNaame) {
		this.stdName = stdNaame;
	}
	public Student(int stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
