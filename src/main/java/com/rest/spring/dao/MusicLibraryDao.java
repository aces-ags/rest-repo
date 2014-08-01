package com.rest.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.google.common.collect.Lists;
import com.rest.spring.domain.Album;

@Repository("musicLibraryDao")
public class MusicLibraryDao {

	public List<Album> listAllAlbums() {
		return Lists.newArrayList();
	}
}
