package com.pimwi.marvel.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pimwi.marvel.model.Favorite;

@Repository
public interface FavoriteRepository extends CrudRepository<Favorite, Long> {

	List<Favorite> findAll();
}
