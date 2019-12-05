package boisson;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

public class InventorySteps {
	private Client myriam;
	private List<Boisson> boissons = new ArrayList<Boisson>();
	private Boisson petitepotionvie = new Boisson("petite potion de vie", 10, 20);
	private Boisson moyennepotionforce = new Boisson("moyenne potion de force", 20, 30);
	
	@Given("Myriam est une cliente")
	public void myriam_est_une_cliente() {
		myriam.setNom("Myriam");
		myriam.setArgent(20);
	}
	
	@When("Myriam verifie son inventaire")
	public void myriam_verifie_son_inventaire() {
		boissons.add(petitepotionvie);
		boissons.add(moyennepotionforce);
	}
	
	@Then("Myriam constate que son inventaire n'est pas vide")
	public void myriam_inventaire_non_vide() {
		myriam.setPossessions(boissons);
		assertEquals(true, myriam.hasBottle());
	}
	
	@Then("Myriam constate que son inventaire est vide")
	public void myriam_inventaire_vide() {
		assertEquals(false, myriam.hasBottle());
	}
}
