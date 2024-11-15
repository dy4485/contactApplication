package com.contact.repo;

import com.contact.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContactRepo extends JpaRepository<Contact,String> {
    @Override
    Optional<Contact> findById(String id);
}
