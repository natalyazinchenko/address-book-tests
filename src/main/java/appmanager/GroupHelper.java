package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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

    public void deleteGroup() {
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

    public void makeChangesToGroup(GroupData groupData) {
        click(By.name("group_header"));
        type(By.name("group_header"), groupData.getHeader());
        click(By.name("group_footer"));
        type(By.name("group_footer"), groupData.getFooter());
    }

    public int getGroupCount() {
        return driver.findElements(By.name("selected[]")).size();
    }

    public void selectOneGroup(int index) {
        driver.findElements(By.name("selected[]")).get(index).click();
    }

    public List<GroupData> getGroupList() {
        List<GroupData> groups = new ArrayList<GroupData>();
        List<WebElement> elements = driver.findElements(By.cssSelector("span.group"));
        for (WebElement element : elements){
            String name = element.getText();
            GroupData group = new GroupData(null, null);
            groups.add(group);
        }
        return groups;
    }
}
