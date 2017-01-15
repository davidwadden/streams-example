package io.dwadden.gps.httpsource;

import io.dwadden.gps.entities.Widget;
import org.springframework.stereotype.Component;

@Component
public class WidgetGenerator {

    public Widget transform(Long key) {

        return Widget.builder()
            .key(key)
            .type("some-type")
            .payload("some-payload")
            .build();
    }
}
