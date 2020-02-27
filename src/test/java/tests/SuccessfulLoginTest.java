package tests;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)

public class SuccessfulLoginTest extends BaseTest {

    @TestData
    public static Collection<Object[]> testData(){
        return Arrays.asList(new Object[][]{
                {"vvizbor5@gmail.com",     "Qwerty12"},
                {"vvizbor7@gmail.com",     "Qwerty12"}

        });
    }

    private String userEmail;
    private String userPassword;

    public SuccessfulLoginTest(String userEmail, String userPassword) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    @Test
    public void successfulLogin() {
        user
                .auth()
                .openLandingPage()
                .login(userEmail, userPassword);
        user
                .homePage()
                .validateHomePageIsLoaded();
    }
}
