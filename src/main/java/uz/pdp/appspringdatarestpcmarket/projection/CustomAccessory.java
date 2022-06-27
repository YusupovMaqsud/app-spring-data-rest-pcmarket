package uz.pdp.appspringdatarestpcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appspringdatarestpcmarket.entity.Accessory;
import uz.pdp.appspringdatarestpcmarket.entity.Attachment;
import uz.pdp.appspringdatarestpcmarket.entity.Inbasket;

@Projection(types = Accessory.class)
public interface CustomAccessory {
    Integer getId();

    String getModel();

    Integer getPrice();

    Attachment getPhoto();

    Inbasket getInbasket();
}
