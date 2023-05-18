package loanservice;

import api.steps.LoanServiceSteps;
import org.junit.jupiter.api.Test;

public class GetStatusOrderTest {
    private final LoanServiceSteps loanServiceSteps = new LoanServiceSteps();

    @Test
    void getStatusOrderPositive() {
        String orderId = "7d5c653d-30c0-43e3-ac12-18d420759daa";
        loanServiceSteps.getStatusOrder(orderId)
                .responseStatusShouldBeEqualTo(200)
                .getStatusOrderShouldBeSuccessful();
    }
}
