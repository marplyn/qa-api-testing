package loanservice;

import api.steps.LoanServiceSteps;
import org.junit.jupiter.api.Test;

public class GetStatusOrderNegativeTest {
    private final LoanServiceSteps loanServiceSteps = new LoanServiceSteps();

    // неверный код ошибки
    @Test
    void getStatusOrderNegative() {
        String orderId = "67f38d66-6c75-33b5-b981-9f9fd0b488d7";
        loanServiceSteps.getStatusOrder(orderId)
                .responseStatusShouldBeEqualTo(400)
                .getStatusOrderShouldBeFailed();
    }
}
