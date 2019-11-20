Feature: F_02

	En tant que joueur, je veux pouvoir acquerir une nouvelle arme et augmenter en force.
	
	Scenario: Nassim achete une nouvelle arme il veut tester son efficacite.
	Given Nassim ajoute une nouvelle arme dans son arsenal
	When Nassim choisit cette arme
	Then Nassim verifie la puissance de l arme
