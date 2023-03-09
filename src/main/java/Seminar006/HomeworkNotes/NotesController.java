import java.util.List;

public class NotesController {

    private Repository repository;

    public NotesController(Repository repository) {
        this.repository = repository;
    }

    public void saveNotes (Note note) throws Exception{
        repository.CreateNote(note);
    }

    public Note readNote (String noteId) throws Exception{
        List<Note> notes = repository.getAllNotes();
        for (Note item : notes
             ) {
            if(item.getId().equals(noteId)){
                return item;
            }
        }
        throw new Exception("Note not found");
    }

    public List<Note> readNotesList(){
        List<Note> notes = repository.getAllNotes();
        return notes;
    }

    public void deleteNote(String noteId){
        repository.deleteNoteFromRepository(noteId);
    }

    public void updateNote(Note note){
        repository.updateNoteInList(note);
    }
}
