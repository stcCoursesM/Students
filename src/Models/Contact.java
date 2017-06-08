package Models;

/**
 * Created on 08/06/2017.
 */
public class Contact {

    // private Long StudentId;
    private String value;
    private ContactType type;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ContactType getType() {
        return type;
    }

    public void setType(ContactType type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return (21+value.hashCode()*41)+(21+type.hashCode()*41);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Contact)) return false;
        if (this.value != ((Contact)obj).getValue()) return false;
        if (this.type != ((Contact)obj).getType()) return false;
        return true;
    }
}
