@Busqueda
Feature: As a potential client i need to search in google to find a web site

  Background:
    Given The client is on google page

  Scenario Outline: The client search by <var>
    When The client search for word <var>
    Then The client verify that results are shown properly
    @Crowdar
    Examples:
      | var             |
      | crowdar academy |
    @Calidad
    Examples:
      | var     |
      | Calidad |
    @Software
    Examples:
      | var      |
      | Software |
    @Testing
    Examples:
      | var     |
      | Testing |
