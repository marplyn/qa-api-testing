package loanservice.positive;

import api.steps.LoanServiceSteps;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class GetStatusOrderTest {
    private final LoanServiceSteps loanServiceSteps = new LoanServiceSteps();

    @ParameterizedTest
    @ValueSource(strings = {"399926c1-09e9-492b-ab3d-48e39ff6a5a4", "f4fa0932-3a29-4b1e-885e-11546cb51704"})
    void getStatusOrderPositive(String orderId) {
        loanServiceSteps.getStatusOrder(orderId)
                .responseStatusShouldBeEqualTo(200)
                .getStatusOrderShouldBeSuccessful();
    }
}
