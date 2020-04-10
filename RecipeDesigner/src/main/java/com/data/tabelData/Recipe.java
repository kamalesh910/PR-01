package com.data.tabelData;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recipe {
	String recipeName;
	String design;
	@Id
	int id;
	public String getRecipeName() {

		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
