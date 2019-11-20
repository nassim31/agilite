package test.cucumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class SuperHerosTestCucumber1 {
	Weapon arm = new Weapon(10, "arm");
	SuperHeros nassim = new SuperHeros(10, 2, arm);
	
	SuperHeros ennemi = new SuperHeros(10, 5);

	@Given("Nassim change arme")
	public void nassim_change_arme() {
		nassim.usethis(1);
		assertTrue(ennemi.isAlive());
	}
	
	@When("Nassim attaque ennemi")
	public void nassim_attaque_ennemi() {
		nassim.attack(ennemi);
	}
	
	@Then("Ennemi perd la vie")
	public void ennemi_perd_la_vie() {
		assertFalse(ennemi.isAlive());
	}
}
