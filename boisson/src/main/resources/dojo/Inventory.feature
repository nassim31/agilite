@tag
Feature: F_03 Vérifier l'inventaire
		Myriam veut pouvoir vérifier si elle possède des boissons dans son inventaire

  Scenario Outline: Myriam vérifie son inventaire
    Given Myriam est une cliente
    When Myriam verifie son inventaire
    Then Myriam constate que son inventaire n'est pas vide

  Scenario Outline: L'inventaire de Myriam est vide
    Given Myriam est une cliente
    When Myriam verifie son inventaire
    Then Myriam constate que son inventaire est vide
