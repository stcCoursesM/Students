package Models;

/**
 * Created on 08/06/2017.
 */
public class Journal {

    private Long journalNoteId;
    private Long studentId;
    private Long lessonId;
    private boolean wasPresent;

    public Long getJournalNoteId() {
        return journalNoteId;
    }

    public void setJournalNoteId(Long journalNoteId) {
        this.journalNoteId = journalNoteId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getLessonId() {
        return lessonId;
    }

    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }

    public boolean isWasPresent() {
        return wasPresent;
    }

    public void setWasPresent(boolean wasPresent) {
        this.wasPresent = wasPresent;
    }

    @Override
    public int hashCode() {
        return (int) (21+journalNoteId*42);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Journal)) return false;
        if (this.lessonId != ((Journal)obj).getJournalNoteId()) return false;
        return true;
    }
}
