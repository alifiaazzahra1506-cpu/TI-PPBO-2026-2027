public class Waktu {
    private int jam;
    private int menit;
    private int detik;

    public int getJam() {
        return jam;
    }
    public void setJam(int jam) {
        if (jam >= 0 && jam <= 23) {
            this.jam = jam;
        }else{
            System.out.println("Penolakan: jam harus 0-23.");
        }
    }
    public int getMenit() {
        return menit;
    }
    public void setMenit(int menit) {
        if (menit >= 0 && menit <= 59) {
            this.menit = menit;
        }else{
            System.out.println("Penolakan: menit harus 0-59.");
        }
    }
    public int getDetik() {
        return detik;
    }
    public void setDetik(int detik) {
        if (detik >= 0 && detik <= 59) {
            this.detik = detik;
        }else{
            System.out.println("Penolakan: detik harus 0-59.");
        }
    }
}
