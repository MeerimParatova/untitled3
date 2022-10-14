public class Student {
    private int tuulgankunu;
    private String fio;
    private String elpochta;

    public Student(int tuulgankunu, String fio, String elpochta) {
        this.tuulgankunu = tuulgankunu;
        this.fio = fio;
        this.elpochta = elpochta;
    }

    public int getTuulgankunu() {
        return tuulgankunu;
    }

    public void setTuulgankunu(int tuulgankunu) {
        this.tuulgankunu = tuulgankunu;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getElpochta() {
        return elpochta;
    }

    public void setElpochta(String elpochta) {
        this.elpochta = elpochta;
    }

    @Override
    public String toString() {
        return "Student{" +
                "tuulgankunu=" + tuulgankunu +
                ", fio='" + fio + '\'' +
                ", elpochta='" + elpochta + '\'' +
                '}';
    }
}
