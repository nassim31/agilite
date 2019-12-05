@tag
Feature: F_04 Effet d'une potion
		En tant que potion, je veux pouvoir afficher mon effet.

  Scenario Outline: La potion de vie donne son effet
    Given La potion possede un nom
    When L'etiquette de la potion est parcourue
    Then La potion de vie renvoie son effet
    
  Scenario Outline: La potion de vie donne son effet
    Given La potion possede un nom
    When L'etiquette de la potion est parcourue
    Then La potion de force renvoie son effet
