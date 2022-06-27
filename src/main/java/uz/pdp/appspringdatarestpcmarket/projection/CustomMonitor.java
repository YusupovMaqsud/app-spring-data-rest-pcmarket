package uz.pdp.appspringdatarestpcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appspringdatarestpcmarket.entity.Attachment;
import uz.pdp.appspringdatarestpcmarket.entity.Inbasket;
import uz.pdp.appspringdatarestpcmarket.entity.Monitor;

@Projection(types = Monitor.class)
public interface CustomMonitor {
    Integer grtId();

    String getModel();

    String getScreen();

    Integer getPrice();

    Attachment getPhoto();

    Inbasket getInbasket();
}
