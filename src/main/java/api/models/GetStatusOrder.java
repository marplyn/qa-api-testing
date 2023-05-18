package api.models;

import com.fasterxml.jackson.annotation.JsonRootName;
import io.restassured.response.Response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonRootName(value = "data")
public class GetStatusOrder {
    private String orderStatus;

    public static GetStatusOrder createFrom(Response response) {
        return response.getBody().as(GetStatusOrder.class);
    }
}
