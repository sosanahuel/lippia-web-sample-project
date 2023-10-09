package lippia.web.services;


import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.WebElement;

import java.util.List;
import org.testng.Assert;

public class ShopService {
    public static void clickDropdownMenorAMayor() {
       WebActionManager.setDropdownByIndex(ShopConstants.SHOP_DROP_BUTTON, 4);
    }

    public static void ValidoProductosMenorAMayor() {
        double aux=-1000;
        double precio = 0;
        List<WebElement> productosPrecio = WebActionManager.getElements(ShopConstants.PRODUCTS_LOW_TO_HIGH);

        for (int i = 0; i < 4;i++) {
            precio = convertStringToDouble(productosPrecio.get(i).getText());
            System.out.println("Auxiliar:"+aux);
            System.out.println("Precio del producto:"+precio);
            Assert.assertTrue(aux<precio, "No esta ordenado");
            aux=precio;
        }
    }
    private static Double convertStringToDouble(String texto) {
        texto=texto.replace("₹", "");
        return Double.valueOf(texto);
    }
}

