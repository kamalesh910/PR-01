package com.data.phase;

public class Phase {
	String recipeName;
	String instruction;
	String phaseId;
	public Phase(String recipeName, String phaseId) {
		setPhaseId( phaseId);
		setRecipeName( recipeName);
	}
	public String getPhaseId() {
		return phaseId;
	}
	private void setPhaseId(String phaseId) {
		this.phaseId = phaseId;
	}
	public String getRecipeName() {
		return recipeName;
	}
	private void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

}
