package uz.pdp.appspringdatarestpcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appspringdatarestpcmarket.entity.Accessory;
import uz.pdp.appspringdatarestpcmarket.entity.Address;
import uz.pdp.appspringdatarestpcmarket.projection.CustomAccessory;
import uz.pdp.appspringdatarestpcmarket.projection.CustomAddress;

@RepositoryRestResource(path = "address",excerptProjection = CustomAddress.class)
public interface AddressRepository extends JpaRepository<Address,Integer> {
}
