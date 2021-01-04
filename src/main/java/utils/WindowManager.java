package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack() {
        navigate.back();
    }

    public void refreshPage() {
        navigate.refresh();
    }

    public void goForward() {
        navigate.forward();
    }

    public void goTo(String url) {
        navigate.to(url);
    }

    //method to handle tab window knowing the window title
    public void switchToTab(String TabTitle) {
        var windows = driver.getWindowHandles();

        System.out.println("Number of tabs: " + windows.size());
        windows.forEach(System.out::println);

        for (String window : windows) {
            System.out.println("Switching to Window: " + window);
            driver.switchTo().window(window);

            System.out.println("Current Window Title: " + driver.getTitle());

            if (TabTitle.equals(driver.getTitle())) {
                break;
            }
        }

    }

    //method to switch to the newly opened tab
    public void switchToNewTab() {
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }
}

