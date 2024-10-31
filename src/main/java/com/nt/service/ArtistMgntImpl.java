package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Artist;
import com.nt.reposistory.IArtistRepository;
@Service("artist")
public class ArtistMgntImpl implements IArtistMgntService {
	@Autowired
	private IArtistRepository arsistRepo;

	@Override
	public String resisterArtist(Artist artist) {
		Artist artist1=arsistRepo.save(artist);
		return artist1.getAid()==null?"Artist is not saved(record not inserted)":"Artist is saved(record is inserted)";
	}

}
