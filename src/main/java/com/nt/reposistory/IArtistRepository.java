package com.nt.reposistory;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Artist;

public interface IArtistRepository extends CrudRepository<Artist,Integer> {

}
