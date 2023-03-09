public class Note {

    public String id = "";

    public String header;

    public String text;

    public Note(String header, String text) {
        this.header = header;
        this.text = text;
    }

    public Note(String id, String header, String text){
        this.id = id;
        this.header = header;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public String getHeader() {
        return header;
    }

    public String getText() {
        return text;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "id=" + id +
                ", header='" + header + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
