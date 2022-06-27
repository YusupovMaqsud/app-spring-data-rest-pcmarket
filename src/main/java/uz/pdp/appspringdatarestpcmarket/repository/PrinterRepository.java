package uz.pdp.appspringdatarestpcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appspringdatarestpcmarket.entity.Address;
import uz.pdp.appspringdatarestpcmarket.entity.Printer;
import uz.pdp.appspringdatarestpcmarket.projection.CustomAddress;
import uz.pdp.appspringdatarestpcmarket.projection.CustomPrinter;

@RepositoryRestResource(path = "printer",excerptProjection = CustomPrinter.class)
public interface PrinterRepository extends JpaRepository<Printer,Integer> {
}
