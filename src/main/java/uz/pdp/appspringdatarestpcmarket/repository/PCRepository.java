package uz.pdp.appspringdatarestpcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appspringdatarestpcmarket.entity.Address;
import uz.pdp.appspringdatarestpcmarket.entity.PC;
import uz.pdp.appspringdatarestpcmarket.projection.CustomAddress;
import uz.pdp.appspringdatarestpcmarket.projection.CustomPC;

@RepositoryRestResource(path = "pc",excerptProjection = CustomPC.class)
public interface PCRepository extends JpaRepository<PC,Integer> {
}
