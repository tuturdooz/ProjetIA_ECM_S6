package fr.ecm1A.model;

public class Fait {
	
	private String nom;
	private Boolean val;

	public Fait (String nom){
		this.nom=nom;
		this.val=false;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Boolean getVal() {
		return val;
	}

	public void setVal(Boolean val) {
		this.val = val;
	}
	
}