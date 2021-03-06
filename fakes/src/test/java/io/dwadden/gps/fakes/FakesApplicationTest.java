package io.dwadden.gps.fakes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.MOCK,
    properties = {
        "httpGateway.initialDelay=10000",
        "httpGateway.fixedDelay=1000",
        "httpGateway.endpoint=http://some.api/endpoint",
    }
)
class FakesApplicationTest {

    @DisplayName("should autowire successfully")
    @Test
    void contextLoads() { }

}
