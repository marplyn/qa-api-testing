package loanservice;

import api.models.CreateOrderRequest;
import api.steps.LoanServiceSteps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static java.lang.Long.parseLong;

public class CreateOrderTest {
    private final LoanServiceSteps loanServiceSteps = new LoanServiceSteps();

    @ParameterizedTest
    @CsvSource({
            "120356897, 2",
            "123456, 1",
            "4653785, 3",
            "120356894755, 1"
    })
    void postCreateOrderPositive(Long userId, Integer tariffId) {
        CreateOrderRequest createOrderRequest = new CreateOrderRequest(userId, tariffId);
        loanServiceSteps.postCreateOrder(createOrderRequest)
                .responseStatusShouldBeEqualTo(200)
                .postCreateOrderShouldBeSuccessful();
    }


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
