package com.zack.notepad_springboot_rest.dao;

import com.zack.notepad_springboot_rest.model.Note;

import java.util.List;

public interface NoteDao {
    Note addNote(Note note);
    Note getNoteById(int id);
    List<Note> getAllNote();
    int updateNote(int id, Note note);
    int deleteNote(int id);
}
