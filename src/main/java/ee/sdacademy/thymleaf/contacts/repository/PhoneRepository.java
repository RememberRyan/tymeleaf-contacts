package ee.sdacademy.thymleaf.contacts.repository;

import ee.sdacademy.thymleaf.contacts.domain.Phone;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Ryan Alexander on 29/11/2018.
 */

public interface PhoneRepository extends CrudRepository<Phone, Integer> {
    List<Phone> findByContactid(Integer contactId);
}
