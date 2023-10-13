package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private SelenideElement nocodeLogo = $(byXpath("/html/body/div[1]/div[1]/header/div/div/a/img"));
    private SelenideElement buttonAboutUs = $(byXpath("/html/body/div[1]/div[1]/header/div/div/div/a[1]/span"));
    private SelenideElement buttonCourses = $(byXpath("/html/body/div[1]/div[1]/header/div/div/div/a[2]/span"));
    private SelenideElement buttonProfessors = $(byXpath("/html/body/div[1]/div[1]/header/div/div/div/a[3]/span"));
    private SelenideElement buttonSignIn = $(byXpath("/html/body/div[1]/div[1]/header/div/div/div/div/a[1]"));
    private SelenideElement buttonSignUp = $(byXpath("/html/body/div[1]/div[1]/header/div/div/div/div/a[2]"));

    public void logoShouldBeVisible() {
        SelenideElement nocodelogo = null;
        nocodelogo.shouldBe(Condition.visible);
    }

    @Step("Click signIn button")
    public SignInPage clickButtonSignIn() {
        buttonSignIn.shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        return new SignInPage();
    }

    @Step("Click signUp button")
    public SignInPage clickButtonSignUp() {
        buttonSignIn.shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        return new SignInPage();
    }
}
