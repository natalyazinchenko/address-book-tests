package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void submitChanges(String submit) {
        click(By.name(submit));
    }

    public void groupNameTyping() {
        type(By.name("group_name"), "seleniumTestGroupCreate");
    }

    public void selectGroups() {
        click(By.linkText("groups"));
    }

    public void selectAndDeleteGroup() {
        click(By.name("selected[]"));
        click(By.name("delete"));
    }

    public void clickNewGroupButton() {
        click(By.name("new"));
    }
}
