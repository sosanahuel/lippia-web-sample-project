package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.MenuService;
import lippia.web.services.MyAccountService;

public class MyAccountSteps {

    @When("el usuario hace click en MyAccount")
    public void el_usuario_hace_click_en_MyAccount() {
        MenuService.clickMyAccount();
    }

    @And("^el usuario ingresa (.*) y (.*) validos$")
    public void ingreso_mail_y_contrasenia_validos(String mail, String contrasenia) {
        MyAccountService.SendEmail(mail);
        MyAccountService.SendPassword(contrasenia);
    }
    @And("el usuario hace click en Login")
    public void el_usuario_hace_click_en_Login() {
        MyAccountService.ClickLogin();
    }
    @Then("^valida que esta con su (.*)$")
    public void valida_que_esta_con_su_usuario(String usuario) {
        MyAccountService.ValidarUsuario(usuario);
    }

    @And("^el usuario ingresa (.*) correcto y (.*) incorrecto$")
    public void el_usuario_ingresa_contrasenia_incorrecto(String mail, String contrasenia) {
        MyAccountService.SendEmail(mail);
        MyAccountService.SendPassword(contrasenia);
    }
    @Then("^valida que (.*) aparezca$")
    public void valida_que_aviso_aparezca(String aviso){
        MyAccountService.ValidarContrasenia(aviso);
    }


}
