@tag
Feature: F_02 Boire une potion
    En tant que Super-Nassim, je veux pouvoir boire une bouteille
    dans mon inventaire et en acheter une correspondant à mes besoins
    si besoin 

  Scenario: Super-Nassim boit une potion
    Given Super-Nassim veut boire une potion de vie
    When Super-Nassim trouve une potion de vie dans son inventaire
    Then Super-Nassim consomme la premiere potion qui correspond a ses besoins
    

  Scenario: Super-Nassim n'a pas de potion correspondante
    Given Super-Nassim veut boire une potion de vie mais n'en possede pas
    When Super-Nassim ne trouve pas de potion de vie dans son inventaire
    Then Super-Nassim achete potion de vie
    And Super-Nassim consomme la potion
    
	Scenario: Super-Nassim n'a pas de potion et n'a pas d'argent pour en acheter
		Given Super-Nassim veut boire une potion de force
		When Super-Nassim ne trouve pas de potion de force dans son inventaire
		Then Super-Nassim essaie d'acheter une potion de force
		And L'achat est refuse