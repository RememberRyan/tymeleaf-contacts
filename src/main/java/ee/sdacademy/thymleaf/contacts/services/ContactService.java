package ee.sdacademy.thymleaf.contacts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ee.sdacademy.thymleaf.contacts.domain.Contact;
import ee.sdacademy.thymleaf.contacts.repository.ContactRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Transactional
    public void save(Contact contact) {
        contactRepository.save(contact);
    }

    public Contact get(Integer id) {
//        StreamSupport.
//                stream(contactRepository.findAll().spliterator(), false).collect(Collectors.toList());
        return contactRepository.findById(id).get();
    }
    public List<Contact> findAll() {
        return contactRepository.findAll();
    }
}
