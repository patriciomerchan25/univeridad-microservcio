package com.universidad.universidadModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Long> {

}
