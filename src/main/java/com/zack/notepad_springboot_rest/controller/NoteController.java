package com.zack.notepad_springboot_rest.controller;

import com.zack.notepad_springboot_rest.model.Note;
import com.zack.notepad_springboot_rest.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/note")
@CrossOrigin(origins = "*")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Note> getNotes(){
        return noteService.getAllNote();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Note postNote(@RequestBody Note note) {
        return noteService.addNote(note);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Note getNoteById(@PathVariable("id") int id) {
        return noteService.getNoteById(id);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public int updateEmp(@PathVariable("id") int id, Note note){
        return noteService.updateNote(id, note);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public int removeNote(@PathVariable ("id") int id ){
        return noteService.deleteNote(id);
    }
}
