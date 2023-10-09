package lippia.web.services;
import lippia.web.constants.MenuConstants;

import static com.crowdar.core.actions.WebActionManager.click;

public class MenuService {
    public static void clickShopMenu()  {
        click(MenuConstants.SHOP_MENU_BUTTON);
    }

    public static void clickMyAccount()  {
        click(MenuConstants.MYACCOUNT_MENU_BUTTON);
    }
}
