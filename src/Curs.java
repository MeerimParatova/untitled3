public class Curs {
    private String nameCurs;
    private int nomer;
    private String nameTeacher;

    public Curs(String nameCurs, int nomer, String nameTeacher) {
        this.nameCurs = nameCurs;
        this.nomer = nomer;
        this.nameTeacher = nameTeacher;
    }

    public String getNameCurs() {
        return nameCurs;
    }

    public void setNameCurs(String nameCurs) {
        this.nameCurs = nameCurs;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }
}
