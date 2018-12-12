package com.zack.notepad_springboot_rest.service;

import com.zack.notepad_springboot_rest.dao.NoteDao;
import com.zack.notepad_springboot_rest.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService{

    @Autowired
    private NoteDao noteDao;

    @Override
    public Note addNote(Note emp) {
        return noteDao.addNote(emp);
    }

    @Override
    public Note getNoteById(int id) {
        return noteDao.getNoteById(id);
    }

    @Override
    public List<Note> getAllNote() {
        return noteDao.getAllNote();
    }

    @Override
    public int updateNote(int id, Note note) {
        return noteDao.updateNote(id, note);
    }

    @Override
    public int deleteNote(int id) {
        return noteDao.deleteNote(id);
    }
}
