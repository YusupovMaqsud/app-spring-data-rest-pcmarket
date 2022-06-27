package uz.pdp.appspringdatarestpcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appspringdatarestpcmarket.entity.Attachment;
import uz.pdp.appspringdatarestpcmarket.entity.AttachmentContent;
import uz.pdp.appspringdatarestpcmarket.projection.CustomAttachment;
import uz.pdp.appspringdatarestpcmarket.projection.CustomAttachmentContent;

import java.util.Optional;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
    Optional<AttachmentContent> findAllByAttachment_Id(Integer attachment_id);
}
