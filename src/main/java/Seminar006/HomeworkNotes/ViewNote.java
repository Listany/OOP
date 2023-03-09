import java.util.List;
import java.util.Scanner;

public class ViewNote {

    private NotesController notesController;

    public ViewNote(NotesController notesController) {
        this.notesController = notesController;
    }

    public void run(){
        Commands com = Commands.NONE;

        while (true){
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());
                if(com == Commands.EXIT) return;
                switch (com){
                    case CREATE:
                        caseCreateNote();
                        break;
                    case READ:
                        caseReadNote();
                        break;
                    case LIST:
                        caseReadListNotes();
                        break;
                    case DELETE:
                        caseDeleteNote();
                        break;
                    case UPDATE:
                        caseUpdateNote();
                        break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        }
    }

    private void caseUpdateNote() {
        String id = prompt("Введите ID записки для обновления: ");
        try {
            Note note = notesController.readNote(id);
            if (note == null){
                System.out.println("Записка с ID " + id + "не найдена");
                return;
            }

            System.out.println("Старое название : " + note.getHeader());
            String header = prompt("Введите новое название : ");
            note.setHeader(header);

            System.out.println("Старый текст : " + note.getText());
            String text = prompt("Введите новый текст записки : ");
            note.setText(text);
            notesController.updateNote(note);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    private void caseDeleteNote() {
        String id = prompt("Введите ID записки для удаления: ");
        notesController.deleteNote(id);
        System.out.println("Была удалена записка с ID " + id);
    }

    private void caseReadListNotes() {
        List<Note> notes = notesController.readNotesList();
        for (Note item : notes
             ) {
            System.out.println(item);
        }
    }

    private void caseReadNote() {
        String id = prompt("Введите ID записки: ");
        try {
            Note note = notesController.readNote(id);
            System.out.println(note);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private void caseCreateNote() throws Exception{
        String header = prompt("Введите название записки: ");
        String text = prompt("Введите текст записки: ");
        notesController.saveNotes(new Note(header, text));
        return;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
