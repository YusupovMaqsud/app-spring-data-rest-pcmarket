package uz.pdp.appspringdatarestpcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appspringdatarestpcmarket.entity.Attachment;
import uz.pdp.appspringdatarestpcmarket.entity.Inbasket;
import uz.pdp.appspringdatarestpcmarket.entity.Printer;

@Projection(types = Printer.class)
public interface CustomPrinter {
    Integer grtId();

    String getModel();

    String getColor();

    String getType();

    Integer getPrice();

    Attachment getPhoto();

    Inbasket getInbasket();
}
