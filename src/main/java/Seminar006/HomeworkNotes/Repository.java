import java.util.List;

public interface Repository {

    List<Note> getAllNotes();
    String CreateNote(Note note);

    void deleteNoteFromRepository(String noteId);

    void updateNoteInList(Note note);
}
