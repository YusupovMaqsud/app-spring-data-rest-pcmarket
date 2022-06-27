package uz.pdp.appspringdatarestpcmarket.projection;

import org.springframework.context.annotation.Primary;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appspringdatarestpcmarket.entity.Address;

@Projection(types = Address.class)
public interface CustomAddress {
    Integer getId();

    String getCity();

    String getStreet();

    Integer getHouseNumber();
}
