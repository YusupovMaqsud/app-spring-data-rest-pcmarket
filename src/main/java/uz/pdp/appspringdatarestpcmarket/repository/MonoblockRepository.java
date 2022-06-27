package uz.pdp.appspringdatarestpcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appspringdatarestpcmarket.entity.Address;
import uz.pdp.appspringdatarestpcmarket.entity.Monoblock;
import uz.pdp.appspringdatarestpcmarket.projection.CustomAddress;
import uz.pdp.appspringdatarestpcmarket.projection.CustomMonoblock;

@RepositoryRestResource(path = "monoblock",excerptProjection = CustomMonoblock.class)
public interface MonoblockRepository extends JpaRepository<Monoblock,Integer> {
}
