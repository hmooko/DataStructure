public class Course {
    private String title;
    private String code;

    public Course(String title, String code) {
        this.title = title;
        this.code = code;
    }

    public String getTitle() { return title; }
    public String getCode() { return code; }

    @Override
    public String toString() {
        return title;
    }
}