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
        type(By.name("group_name"), "seleniumTestGroupCreateorChange");
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

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void updateGroupModification() {
        click(By.name("update"));
    }

    public void makeChangesToGroup() {
        click(By.name("group_header"));
        type(By.name("group_header"), "testChangesIntoGroupHeader");
        click(By.name("group_footer"));
        type(By.name("group_footer"),"changes into footer");
    }
}
