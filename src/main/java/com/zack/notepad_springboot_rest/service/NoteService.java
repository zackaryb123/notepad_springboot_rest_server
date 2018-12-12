package com.zack.notepad_springboot_rest.service;

import com.zack.notepad_springboot_rest.model.Note;

import java.util.List;

public interface NoteService {
    Note addNote(Note note);

    Note getNoteById(int id);

    List<Note> getAllNote();

    int deleteNote(int id);

    int updateNote(int id, Note note);
}
