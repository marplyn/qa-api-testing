package loanservice;

import api.steps.LoanServiceSteps;
import org.junit.jupiter.api.Test;

public class GetStatusOrderTest {
    private final LoanServiceSteps loanServiceSteps = new LoanServiceSteps();

    @Test
    void getStatusOrderPositive() {
        String orderId = "b9d53bf0-32a1-4e06-a933-54b699f61ebb";
        loanServiceSteps.getStatusOrder(orderId)
                .responseStatusShouldBeEqualTo(200)
                .getStatusOrderShouldBeSuccessful();
    }

    // неверный код ошибки
    @Test
    void getStatusOrderNegative() {
        String orderId = "67f38d66-6c75-33b5-b981-9f9fd0b488d7";
        loanServiceSteps.getStatusOrder(orderId)
                .responseStatusShouldBeEqualTo(400)
                .getStatusOrderShouldBeFailed();
    }
}
