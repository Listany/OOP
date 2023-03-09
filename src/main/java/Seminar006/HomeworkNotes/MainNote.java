public class MainNote {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationClass("notes.txt");
        Repository repository = new RepositoryClass(fileOperation, new MapperClass());
        NotesController controller = new NotesController(repository);
        ViewNote viewNote = new ViewNote(controller);
        viewNote.run();

    }

}
