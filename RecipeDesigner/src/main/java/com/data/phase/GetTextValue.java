package com.data.phase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GetTextValue extends Phase {
	int minLength;
	int maxLength;
	@Id
	int id;
	public GetTextValue(String recipeName, String phaseId) {
		super(recipeName,phaseId);
	}

	public int getMinLength() {
		return minLength;
	}

	public void setMinLength(int minLength) {
		this.minLength = minLength;
	}

	public int getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}

}
