package boisson;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  
import cucumber.api.PendingException;


public class AchatSteps {
	private Client mickael = new Client("Mickael", 15);
	private List<Boisson> boissons = new ArrayList<Boisson>();
	private Boisson petitepotionvie = new Boisson("petite potion de vie", 10, 20);
	private Boisson moyennepotionforce = new Boisson("moyenne potion de force", 20, 30);
	private Boisson chosen;
	private Boisson chosen2;
	private int argentbase;
	
	@Given("Mickael choisit une bouteille")
	public void mickael_choisit_une_bouteille() {
		boissons.add(petitepotionvie);
		boissons.add(moyennepotionforce);
		chosen=mickael.selectBottle(boissons, 0);
		chosen2=mickael.selectBottle(boissons, 1);
	}
	
	@When("Mickael passe en caisse")
	public void mickael_passe_en_caisse() {
		argentbase = mickael.getArgent();
		mickael.buyBottle(chosen);
		mickael.buyBottle(chosen2);
	}
	
	@Then("Mickael obtient une bouteille.")
	public void mickael_obtient_une_bouteille() {
		assertEquals(true, mickael.getPossessions().contains(chosen));
		assertEquals(mickael.getArgent(), argentbase-chosen.getPrix());
	}
	
	@Then("Achat refuse avec le message pas assez d'argent.")
	public void achat_refuse() {
		assertEquals(false, mickael.getPossessions().contains(chosen2));
		System.out.println("pas assez d'argent");
	}
}