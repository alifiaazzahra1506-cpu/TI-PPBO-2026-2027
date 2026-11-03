public class Hewan {
    protected String nama;

    public void bersuara() {
        System.out.println("...");
    }
}

// Subclass Kucing mewarisi Hewan
class Kucing extends Hewan {
    // Mewarisi atribut nama dan method bersuara()
}

// Subclass Anjing mewarisi Hewan
class Anjing extends Hewan {
    // Mewarisi atribut nama dan method bersuara()
}
