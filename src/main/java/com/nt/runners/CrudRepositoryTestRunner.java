package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Artist;
import com.nt.service.IArtistMgntService;
@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IArtistMgntService artistService;
	
	@Override
	public void run(String... args) throws Exception {
		Artist artist=new Artist("Raju","hero",8200000.0);
		//invoke the b.method
		try {
			String msg=artistService.resisterArtist(artist);
			System.out.println(msg);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
