import java.util.ArrayList;
import java.util.List;

public class RepositoryClass implements Repository{

    private FileOperation fileOperation;

    private Mapper mapper;

    public RepositoryClass(FileOperation fileOperation, Mapper mapper) {
        this.fileOperation = fileOperation;
        this.mapper = mapper;
    }


    @Override
    public List<Note> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String item : lines
             ) {
            notes.add(mapper.map(item));
        }
        return notes;
    }

    @Override
    public String CreateNote(Note note) {
        List<Note> notes = getAllNotes();
        int max = 0;
        for (Note item : notes
             ) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setId(id);
        notes.add(note);
        saveReposytory(notes);
        return id;
    }

    private void saveReposytory(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note item : notes
             ) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);

    }

    @Override
    public void deleteNoteFromRepository(String noteId) {
        List<Note> notes = getAllNotes();
        Note foundNotes = findNoteInList(noteId, notes);
        if (foundNotes != null){
            notes.remove(foundNotes);
        }
        saveReposytory(notes);
    }

    private Note findNoteInList(String noteId, List<Note> notes) {
        Note foundNotes = null;
        for (Note item : notes
             ) {
            {
                if (item.getId().equals(noteId)){
                    foundNotes = item;
                }
            }
        }
        return foundNotes;
    }

    @Override
    public void updateNoteInList(Note note) {
        List<Note> notes = getAllNotes();
        Note foundNotes = findNoteInList(note.getId(), notes);
        if (foundNotes != null){
            foundNotes.setId(note.getId());
            foundNotes.setHeader(note.getHeader());
            foundNotes.setText(note.getText());
            saveReposytory(notes);
        }
    }
}
