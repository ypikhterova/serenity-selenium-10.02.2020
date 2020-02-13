package tests;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import pages.LandingPage;


@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest{


    LandingPage landingPage;

    WebElementFacade loginFailMessage;


    @Test
    public void negativeLoginTest()  {
        user
    .login("a@b.c","P@ssword123")
    .validatePageHeader("Don't miss your next opportunity. Sign in to stay updated on your professional world.");




    }
}
