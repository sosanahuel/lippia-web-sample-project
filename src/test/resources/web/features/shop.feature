@shop
Feature: Como usuario deseo ordenar y poder comprar productos

  Background: El usuario ingresa a la pagina practice automationtesting
    Given el usuario se encuentra en la pagina

  @LowToHigh
  Scenario: Ordenar productos por precio
    When el usuario hace click en shop del menu
    And ordena por menor precio los productos
    Then muestra los productos ordenados de menor a mayor precio
