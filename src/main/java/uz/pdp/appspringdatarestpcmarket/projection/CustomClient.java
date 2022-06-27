package uz.pdp.appspringdatarestpcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appspringdatarestpcmarket.entity.Address;
import uz.pdp.appspringdatarestpcmarket.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();

    String getFullName();

    String getPhoneNumber();

    Address getAddress();
}
