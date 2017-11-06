package com.wh51net.text.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wh51net.text.common.JsonResult;
import com.wh51net.text.entity.Note;
import com.wh51net.text.service.NoteService;

@Controller
@RequestMapping("/text")
public class NoteController {
	
	@Resource
	NoteService noteService;
	
	@RequestMapping("/save")
	@ResponseBody
	public JsonResult save(Note note) {
		System.out.println("111");
		noteService.save(note);
		return new JsonResult();
	}
	
}
