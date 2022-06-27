package uz.pdp.appspringdatarestpcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appspringdatarestpcmarket.entity.Accessory;
import uz.pdp.appspringdatarestpcmarket.projection.CustomAccessory;

@RepositoryRestResource(path = "accessory",excerptProjection = CustomAccessory.class)
public interface AccessoryRepository extends JpaRepository<Accessory ,Integer> {
}
