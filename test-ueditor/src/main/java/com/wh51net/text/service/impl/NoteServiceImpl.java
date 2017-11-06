package com.wh51net.text.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wh51net.text.dao.NoteDao;
import com.wh51net.text.entity.Note;
import com.wh51net.text.service.NoteService;

@Service
public class NoteServiceImpl implements NoteService{
	
	@Resource
	NoteDao noteDao;

	public void save(Note note) {
		noteDao.save(note);
	}

}
