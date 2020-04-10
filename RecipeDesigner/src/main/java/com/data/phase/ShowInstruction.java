package com.data.phase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShowInstruction extends Phase {
	@Id
	int id;
	public ShowInstruction(String recipeName, String phaseId) {
		super(recipeName,phaseId);
	}
}
