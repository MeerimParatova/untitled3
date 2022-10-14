public class Gruppa {
 private  int massiv [];
 private String emneniokuu;
 private int data;
 

    public Gruppa(int[] massiv, String emneniokuu, int data) {
        this.massiv = massiv;
        this.emneniokuu = emneniokuu;
        this.data = data;
    }

    public int[] getMassiv() {
        return massiv;
    }

    public void setMassiv(int[] massiv) {
        this.massiv = massiv;
    }

    public String getEmneniokuu() {
        return emneniokuu;
    }

    public void setEmneniokuu(String emneniokuu) {
        this.emneniokuu = emneniokuu;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
