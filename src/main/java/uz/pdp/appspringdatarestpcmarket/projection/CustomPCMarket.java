package uz.pdp.appspringdatarestpcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appspringdatarestpcmarket.entity.Address;
import uz.pdp.appspringdatarestpcmarket.entity.PCMarket;

@Projection(types = PCMarket.class)
public interface CustomPCMarket {
    Integer getId();

    String getName();

    Address getAddress();
}
