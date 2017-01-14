package io.dwadden.gps.httpsource;

import io.dwadden.gps.entities.AvroWidget;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Component;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Component
public class AvroWidgetTransformer {

    static Mapper dozerBeanMapper = new DozerBeanMapper();

    public AvroWidget transform(Widget widget) {

        return dozerBeanMapper.map(widget, AvroWidget.class);
    }

}