public class Kucing extends Hewan {
    protected Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara(){
        System.out.println(nama + ": Meong!");
    }
}
