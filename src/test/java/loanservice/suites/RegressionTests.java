package loanservice.suites;

import loanservice.*;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        CreateOrderTest.class,
        DeleteOrderTest.class,
        GetStatusOrderTest.class,
        GetTariffsTest.class,
        CreateOrderNegativeTest.class,
        DeleteOrderNegativeTest.class,
        GetStatusOrderNegativeTest.class,
        E2ETests.class
})
public class RegressionTests {
}
