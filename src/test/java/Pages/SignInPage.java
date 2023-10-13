package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    private static final SelenideElement inputEmail = $(byXpath("/html/body/div[1]/section/div/div/div/div/div/div[3]/input"));
    private static final SelenideElement inputPassword = $(byXpath("/html/body/div[1]/section/div/div/div/div/div/div[4]/div/input"));
    private static final SelenideElement signInButton = $(byXpath("/html/body/div[1]/section/div/div/div/div/div/div[5]/a[1]"));
    private static final SelenideElement linkForgotPassword = $(byXpath("/html/body/div[1]/section/div/div/div/div/div/div[5]/a[2]"));
    private static final SelenideElement signUpButton = $(byXpath("/html/body/div[1]/section/div/div/div/div/div/div[6]/a"));
    private static final SelenideElement signInForm = $(byXpath("/html/body/div[1]/section/div/div/div/div"));

    @Step("Click sign in button")
    public void signIn() {
        signInButton.shouldBe(Condition.visible).click();
    }

    @Step("SignIn with correct credentials.")
    public void getAuth(String email, String password) {
        checkSignInForm();
        setEmail(email);
        setPassword(password);
        signIn();
    }

    @Step("Check signIn form is visible")
    public SignInPage checkSignInForm() {
        signInForm.shouldBe(Condition.visible, Duration.ofSeconds(10));
        return this;

    }

    @Step("enter Email")
    public SignInPage setEmail(String email) {
        inputEmail.shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        inputEmail.setValue(email);
        return this;

    }

    @Step("enter password")
    public SignInPage setPassword(String password) {
        inputPassword.shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        inputPassword.setValue(password);
        return this;

    }

}
