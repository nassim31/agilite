package boisson;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  
import cucumber.api.PendingException;

public class DrinkSteps {
	private Boisson petitepotionvie = new Boisson("petite potion de vie", 10, 20);
	private Boisson moyennepotionforce = new Boisson("moyenne potion de force", 20, 30);
	private Client super_nassim = new Client("Super-Nassim", 15);
	private List<Boisson> boissons = new ArrayList<Boisson>();
	private String chosen;
	private int initialSize;

	@Given("Super-Nassim veut boire une potion de vie")
	public void super_nassim_veut_boire_potion_de_vie() {
		boissons.add(petitepotionvie);
		boissons.add(moyennepotionforce);
		super_nassim.getPossessions().add(petitepotionvie);
		chosen="vie";				
	}
	
	@Given("Super-Nassim veut boire une potion de vie mais n'en possede pas")
	public void super_nassim_veut_boire_potion_de_vie_mais_nen_possede_pas() {
		boissons.add(petitepotionvie);
		boissons.add(moyennepotionforce);
		chosen="vie";				
	}
	
	@Given("Super-Nassim veut boire une potion de force")
	public void super_nassim_veut_boire_potion_de_force() {
		boissons.add(petitepotionvie);
		boissons.add(moyennepotionforce);
		chosen="force";
	}
	
	
	@When("Super-Nassim trouve une potion de vie dans son inventaire")
	public void super_nassim_trouve_potion_de_vie() {
		initialSize=super_nassim.getPossessions().size();
		assertEquals(true, super_nassim.drinkBottle(chosen));
	}
	
	@When("Super-Nassim ne trouve pas de potion de vie dans son inventaire")
	public void super_nassim_ne_trouve_pas_potion_de_vie() {
		assertEquals(false, super_nassim.drinkBottle(chosen));
	}
	
	@When("Super-Nassim ne trouve pas de potion de force dans son inventaire")
	public void super_nassim_ne_trouve_pas_potion_de_force() {
		assertEquals(false, super_nassim.drinkBottle(chosen));
	}
	
	@Then("Super-Nassim consomme la premiere potion qui correspond a ses besoins")
	public void super_nassim_boit_potion_de_vie() {
		assertEquals(super_nassim.getPossessions().size(), initialSize-1);
	}
	
	@Then("Super-Nassim achete potion de vie")
	public void super_nassim_achete_potion_de_vie() {
		assertEquals(true, super_nassim.buyBottle(petitepotionvie));
	}
	
	@Then("Super-Nassim consomme la potion")
	public void super_nassim_boit_potion() {
		assertEquals(true, super_nassim.drinkBottle(chosen));
	}
	
	@Then("Super-Nassim essaie d'acheter une potion de force")
	public void super_nassim_essaie_dacheter_potion_de_force() {
		assertEquals(false, super_nassim.buyBottle(moyennepotionforce));
	}
	
	@Then("L'achat est refuse")
	public void achat_refuse() {
		assertEquals(false, super_nassim.getPossessions().contains(moyennepotionforce));
	}
	
	
}
