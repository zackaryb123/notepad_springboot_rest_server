package com.zack.notepad_springboot_rest.dao;

import com.zack.notepad_springboot_rest.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NoteDaoImpl implements NoteDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

//    @Autowired
//    HibernateTemplate hibernateTemplate;

    @Override
    public Note addNote(Note note) {
        jdbcTemplate.execute("INSERT INTO NOTE VALUES ("+
                note.getId()+",'"+
                note.getTitle()+"','"+
                note.getNote()+"','"+
                note.getDate()+"','"+
                note.getStatus()+"')");
        return note;
    }

    @Override
    public Note getNoteById(int id) {
//        jdbcTemplate.execute("SELECT * FROM NOTE WHERE ID = " + id);
//        return id;
        return jdbcTemplate.queryForObject("SELECT * FROM NOTE WHERE ID = " + id, Note.class);
    }

    @Override
    public List<Note> getAllNote() {
        List<Note> list = jdbcTemplate.query("SELECT * FROM NOTE",(rs, rowNum) -> {
            Note n = new Note();
            n.setId(rs.getInt(1));
            n.setTitle(rs.getString(2));
            n.setNote(rs.getString(3));
            n.setDate(rs.getString(4));
            n.setStatus(rs.getString(5));
            return n;
        });
        System.out.println(list.toString());
        return list;
    }


    @Override
    public int updateNote(int id, Note note) {
        return jdbcTemplate.update("UPDATE NOTE SET TITLE = ?, NOTE = ?, STATUS = ? WHERE ID = ?", note);
    }

    @Override
    public int deleteNote(int id) {
        return jdbcTemplate.update("DELETE FROM NOTE WHERE ID = "+ id);
    }
}
