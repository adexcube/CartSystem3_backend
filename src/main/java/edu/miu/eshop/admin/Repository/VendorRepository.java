package edu.miu.eshop.admin.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.miu.eshop.admin.domain.Vendor;

@Repository
public interface VendorRepository extends MongoRepository<Vendor, Long> {

}
