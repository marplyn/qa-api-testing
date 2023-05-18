package loanservice.positive;

import api.models.DeleteOrderRequest;
import api.steps.LoanServiceSteps;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.Long;


public class DeleteOrderTest {
    private final LoanServiceSteps loanServiceSteps = new LoanServiceSteps();


    @ParameterizedTest
    @CsvSource({
            "525489, 720a4b3f-e8d6-4896-b854-4aa5c1946756",
            "233568957, 399926c1-09e9-492b-ab3d-48e39ff6a5a4"
    })
    void postCreateOrderPositive(Long userId, String orderId) {
        DeleteOrderRequest deleteOrderRequest = new DeleteOrderRequest(userId, orderId);
        loanServiceSteps.deleteOrder(deleteOrderRequest)
                .responseStatusShouldBeEqualTo(200);
    }
}
