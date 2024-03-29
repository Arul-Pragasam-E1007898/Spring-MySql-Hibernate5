package com.freshworks.repository;

import com.freshworks.entities.ContactEmailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactEmailRepository
        extends JpaRepository<ContactEmailEntity, Long> {
}
