package loanservice;

import api.models.CreateOrderRequest;
import api.steps.LoanServiceSteps;
import org.junit.jupiter.api.Test;

public class CreateOrderNegativeTest {
    private final LoanServiceSteps loanServiceSteps = new LoanServiceSteps();

    @Test
    void postCreateOrderNegative() {
        Long userId = 420356794755L;
        Integer tariffId = 25;
        CreateOrderRequest createOrderRequest = new CreateOrderRequest(userId, tariffId);
        loanServiceSteps.postCreateOrder(createOrderRequest)
                .responseStatusShouldBeEqualTo(400)
                .postCreateOrderShouldBeFailed();
    }
}
