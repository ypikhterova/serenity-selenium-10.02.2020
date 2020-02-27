package tests;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.TestData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)
public class SearchTest extends BaseTest {

    @TestData
    public static Collection<Object[]> testData(){
        return Arrays.asList(new Object[][]{
                {"hr"},
                {"human resources"}

        });
    }

    private String searchTerm;

    public SearchTest(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    @Before
    public void before() {
        user
                .auth()
                .openLandingPage()
                .login("vvizbor5@gmail.com", "Qwerty12");
    }

    @Test
    public void searchBySearchTermTest() {
        String [] relevantResults ={"hr", "HR", "Human Resources", "HUMAN RESOURCES"};
        user
                .validatePageTitle("LinkedIn")
                .homePage()
                .searchFor(searchTerm);
        user
                .validatePageTitle("LinkedIn")
                .searchPage()
                .verifyEachResultContains(relevantResults);
    }
}
