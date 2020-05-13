package com.coders.software.programming;


public class Student {
	private int rollno;
	private String name;
	private String form;
	
	private boolean eligibility;
	
	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}
	
	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the form
	 */
	public String getForm() {
		return form;
	}
	
	/**
	 * @param form the form to set
	 */
	public void setForm(String form) {
		this.form = form;
	}
	
	/**
	 * @return the eligibility
	 */
	public boolean isEligibility() {
		return eligibility;
	}
	
	/**
	 * @param eligibility the eligibility to set
	 */
	public void setEligibility(boolean eligibility) {
		this.eligibility = eligibility;
	}
	
}
