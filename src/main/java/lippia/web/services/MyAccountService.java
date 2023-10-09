package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.MenuConstants;
import lippia.web.constants.MyAccountConstants;
import org.testng.Assert;

public class MyAccountService {

    public static void ClickMyAccount(){
        WebActionManager.click(MenuConstants.MYACCOUNT_MENU_BUTTON);
    }

    public static void SendEmail(String mail){
        WebActionManager.setInput(MyAccountConstants.INPUT_EMAIL,mail);
    }

    public static void SendPassword(String contrasenia){
        WebActionManager.setInput(MyAccountConstants.INPUT_PASSWORD,contrasenia);
    }

    public static void ClickLogin(){
        WebActionManager.click(MyAccountConstants.CLICK_LOGIN_BUTTON);
    }

    public static void ValidarUsuario(String usuario){
        String nombre = WebActionManager.getElement(MyAccountConstants.EMAIL_NAME).getText();
        Assert.assertEquals(usuario, nombre, "El nombre de usuario no es correcto");
        System.out.println(nombre);
        System.out.println(usuario);
    }

    public static void ValidarContrasenia(String aviso){
        String lostPassword = WebActionManager.getElement(MyAccountConstants.LOST_PASSWORD_NAME).getText();
        Assert.assertEquals(aviso, lostPassword, "El aviso no funciona correctamente");
        System.out.println(aviso);
    }
}
