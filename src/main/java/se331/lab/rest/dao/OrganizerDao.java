package se331.lab.rest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.lab.rest.entity.Event;
import se331.lab.rest.entity.Organizer;

import java.util.Optional;

public interface OrganizerDao {
    Page<Organizer> getOrganizer(Pageable pageRequest);
    Organizer getOrganizer(Long id);
    Organizer save(Organizer organizer);
    Optional<Organizer> findById(Long id);
}
