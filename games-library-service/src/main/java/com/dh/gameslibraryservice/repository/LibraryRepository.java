package com.dh.gameslibraryservice.repository;

import com.dh.gameslibraryservice.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {
	List<Library> findAllByUserTag(String userTag);
}
