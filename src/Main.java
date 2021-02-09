
import gui.MenuGlowne;
import gui.SystemSlow;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        SystemSlow.downloadSettingFromFile();
        MenuGlowne m1 = new MenuGlowne();
        m1.checkTheCheckBox();
        m1.refreshListSekcja();
        m1.setVisible(true);
    }
}
