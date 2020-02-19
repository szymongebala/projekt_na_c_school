package com.projekt.pakowanie.pakowanie.repository;
import com.projekt.pakowanie.pakowanie.klasy.Preservation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface PreservationRepository extends CrudRepository<Preservation,Long>
{
}
