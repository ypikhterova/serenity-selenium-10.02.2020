package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class SearchTest extends BaseTest{

    @Before
    public void before(){
        user.login("vvizbor5@gmail.com","Qwerty12");
    }

    @Test

    public void searchBySearchTermTest(){


    }
}