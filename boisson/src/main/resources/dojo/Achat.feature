@tag
  Feature: F_01 Acheter une boisson
    En tant que Mickael, je veux pouvoir acheter une boisson
    afin de l'ajouter à mon inventaire.


  Scenario Outline: Acheter une bouteille.
    Given Mickael choisit une bouteille
    When Mickael passe en caisse
    Then Mickael obtient une bouteille.
		
		Examples:
		| bouteille               | prix  | argent |
		| petite potion de vie    | 10    | 25     | 
	
  Scenario Outline: Mickael ne peut pas acheter la bouteille
	Given Mickael choisit une bouteille
	When Mickael passe en caisse
	Then Achat refuse avec le message <messageErreur>.
	
	Examples:
	| bouteille               | prix  | argent | messageErreur      |
	| grande potion de vie    | 30    | 25     | pas assez d'argent |