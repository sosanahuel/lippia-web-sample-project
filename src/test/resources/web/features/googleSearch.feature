@Busqueda
Feature: As a potential client i need to search in google to find a web site

  Background:
    Given The client is on google page

  Scenario: The client enter the URL practice.automationtesting.in
    When The client click on shop
    Then The client verify that results are shown properly
