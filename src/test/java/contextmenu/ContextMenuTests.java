package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testRightClick(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickContextBox();
        String popUpMessage = contextMenuPage.getPopUpText();
        contextMenuPage.acceptPopUp();
        assertEquals(popUpMessage, "You selected a context menu", "Popup message is incorrect");
    }
}
