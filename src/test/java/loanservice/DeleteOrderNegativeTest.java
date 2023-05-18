package loanservice;

import api.models.DeleteOrderRequest;
import api.steps.LoanServiceSteps;
import org.junit.jupiter.api.Test;

public class DeleteOrderNegativeTest {
    private final LoanServiceSteps loanServiceSteps = new LoanServiceSteps();

    @Test
    void postCreateOrderNegative() {
        Long userId = 420354756L;
        String orderId = "3d046c52-7045-4041-93a6-4856dc3106a0";
        DeleteOrderRequest deleteOrderRequest = new DeleteOrderRequest(userId, orderId);
        loanServiceSteps.deleteOrder(deleteOrderRequest)
                .responseStatusShouldBeEqualTo(400)
                .deleteOrderShouldBeFailed();
    }
}