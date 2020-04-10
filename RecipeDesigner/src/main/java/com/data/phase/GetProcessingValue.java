package com.data.phase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GetProcessingValue extends Phase{
	int lowLimit;
	int heighLimit;
    @Id
	int id;
	public GetProcessingValue(String recipeName, String phaseId) {
		super(recipeName,phaseId);
	}
	
	public int getLowLimit() {
		return lowLimit;
	}
	
	public void setLowLimit(int lowLimit) {
		this.lowLimit = lowLimit;
	}
	
	public int getHeighLimit() {
		return heighLimit;
	}
	
	public void setHeighLimit(int heighLimit) {
		this.heighLimit = heighLimit;
	}
	
}
