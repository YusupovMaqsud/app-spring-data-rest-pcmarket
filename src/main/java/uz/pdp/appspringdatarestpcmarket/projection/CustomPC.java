package uz.pdp.appspringdatarestpcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appspringdatarestpcmarket.entity.Attachment;
import uz.pdp.appspringdatarestpcmarket.entity.Inbasket;
import uz.pdp.appspringdatarestpcmarket.entity.Laptop;

@Projection(types = Laptop.class)
public interface CustomPC {
    Integer grtId();

    String getModel();

    String getBlockPower();

    Integer getRam();

    Integer getProcessor();

    Integer getSsd();

    Integer getVideoCard();

    Integer getHardDisk();

    Integer getPrice();

    Attachment getPhoto();

    Inbasket getInbasket();
}
