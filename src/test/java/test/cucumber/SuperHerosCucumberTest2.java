package test.cucumber;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SuperHerosCucumberTest2 {

	Weapon arm = new Weapon(10, "arm");
	SuperHeros nassim = new SuperHeros(10, 2);
	

	@Given("Nassim ajoute une nouvelle arme dans son arsenal")
	public void nassim_ajoute_une_nouvelle_arme_dans_son_arsenal() {
		nassim.addWeepon(arm);
		assertEquals(nassim.getPower(), 2);
	}
	
	@When("Nassim choisit cette arme")
	public void nassim_choisit_cette_arme() {
		assertEquals(nassim.getArm().indexOf(arm), 1);
		nassim.usethis(1);
	}
	
	@Then("Nassim verifie la puissance de l arme")
	public void nassim_verifie_la_puissance_de_l_arme() {
		assertEquals(nassim.getPowerWithWeapon(), 20);
	}
}
