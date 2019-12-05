package boisson;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;

public class PotionSteps {
	
	private Boisson petitepotionvie;
	private Boisson moyennepotionforce;
	String effect1;
	String effect2;
	
	@Given("La potion possede un nom")
	public void potion_possede_nom() {
		petitepotionvie.setNom("petite potion de vie");
		moyennepotionforce.setNom("moyenne potion de force");
	}
	
	@When("L'etiquette de la potion est parcourue")
	public void etiquette_potion_parcourue() {
		effect1=petitepotionvie.effects();
		effect2=moyennepotionforce.effects();
	}
	
	@Then("La potion de vie renvoie son effet")
	public void potion_vie_renvoie_effet() {
		assertEquals(true, effect1.equals("vie"));
	}
	
	@Then("La potion de force renvoie son effet")
	public void potion_force_renvoie_effet() {
		assertEquals(true, effect2.equals("force"));
	}
	
}
