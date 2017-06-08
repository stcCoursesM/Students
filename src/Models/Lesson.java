package Models;

import java.util.Date;
import java.util.List;

/**
 * Created on 08/06/2017.
 */
public class Lesson {

    private Long lessonId;
    private String lessonName;
    private Integer auditorium;
    private Date startTime;
    private Date endTime;
    private String description;
    private String subject;
    private String lector;
    private List<Group> groups;


    public Long getLessonId() {
        return lessonId;
    }

    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public Integer getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Integer auditorium) {
        this.auditorium = auditorium;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLector() {
        return lector;
    }

    public void setLector(String lector) {
        this.lector = lector;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Lesson)) return false;
        if (this.lessonId != ((Lesson)obj).getLessonId()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return (int) (21+lessonId*42);
    }
}
