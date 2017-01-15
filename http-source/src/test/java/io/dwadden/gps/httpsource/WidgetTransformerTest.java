package io.dwadden.gps.httpsource;

import io.dwadden.gps.entities.AvroWidget;
import io.dwadden.gps.entities.Widget;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@FieldDefaults(level = AccessLevel.PRIVATE)
class WidgetTransformerTest {

    WidgetTransformer transformer;

    @BeforeEach
    void setUp() {
        transformer = new WidgetTransformer();
    }

    @DisplayName("should transform a Widget into an AvroWidget")
    @Test
    void transform() {
        Widget widget = Widget.builder()
            .key(1004L)
            .type("some-type")
            .payload("some-payload")
            .build();

        AvroWidget avroWidget = transformer.transform(widget);

        assertThat(avroWidget.getKey()).isEqualTo(1004L);
        assertThat(avroWidget.getType()).isEqualTo("some-type");
        assertThat(avroWidget.getPayload()).isEqualTo("some-payload");
    }

}
