package loanservice.suites;

import loanservice.CreateOrderTest;
import loanservice.DeleteOrderTest;
import loanservice.GetStatusOrderTest;
import loanservice.GetTariffsTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        CreateOrderTest.class,
        DeleteOrderTest.class,
        GetStatusOrderTest.class,
        GetTariffsTest.class
})
public class SmokeTests {

}
