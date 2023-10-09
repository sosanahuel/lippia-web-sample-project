package lippia.web.steps;

import io.cucumber.java.en.*;
import lippia.web.services.HomeService;
import lippia.web.services.MenuService;
import lippia.web.services.ShopService;

public class ShopSteps {

    @Given("el usuario se encuentra en la pagina")
    public void el_usuario_se_encuentra_en_la_pagina(){
        HomeService.navegarWeb();
    }

    @When("el usuario hace click en shop del menu")
    public void el_usuario_hace_click_en_shop_del_menu() {
        MenuService.clickShopMenu();
    }

    @And("ordena por menor precio los productos")
    public void ordena_por_menor_precio_los_productos() {
        ShopService.clickDropdownMenorAMayor();
    }

    @Then("muestra los productos ordenados de menor a mayor precio")
    public void muestra_los_productos_ordenados_de_menor_a_mayor_precio(){
        ShopService.ValidoProductosMenorAMayor();
    }

}
