package uz.pdp.appspringdatarestpcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appspringdatarestpcmarket.entity.Address;
import uz.pdp.appspringdatarestpcmarket.entity.Attachment;
import uz.pdp.appspringdatarestpcmarket.projection.CustomAddress;
import uz.pdp.appspringdatarestpcmarket.projection.CustomAttachment;

public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
