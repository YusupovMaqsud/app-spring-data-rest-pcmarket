package uz.pdp.appspringdatarestpcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appspringdatarestpcmarket.entity.Attachment;
import uz.pdp.appspringdatarestpcmarket.entity.AttachmentContent;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {
    Integer getId();

    Byte[] getBytes();

    Attachment getAttachment();
}
