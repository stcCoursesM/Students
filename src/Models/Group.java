package Models;

import java.util.HashSet;

/**
 * Created on 08/06/2017.
 */
public class Group {

    public HashSet<Student> getStudents() {
        return students;
    }

    public void setStudents(HashSet<Student> students) {
        this.students = students;
    }

    @Override
    public int hashCode() {
        return (int) (21+groupId*42);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Group)) return false;
        if (this.groupId != ((Group)obj).getGroupId()) return false;
        return true;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    private Long groupId;
    private HashSet<Student> students;



}
