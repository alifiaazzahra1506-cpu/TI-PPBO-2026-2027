public class Akun {
    protected String username;
    protected double saldo;

    // constructor superclass
    public Akun(String username, double saldo) {
        this.username = username;
        this.saldo = saldo;

    }
}
  // Subclass AkunPremium
  class AkunPremium extends Akun {
      private double batasKredit;

      public AkunPremium(String username, double saldo, double batasKredit) {
          super(username, saldo);
          this.batasKredit = batasKredit;
      }

      public void cekLimit() {
          System.out.println("Username: " + username);
          System.out.println("Saldo Saat Ini: " + saldo);
          System.out.println("Batas Kredit: " + batasKredit);
          System.out.println("Total Dana Tersedia: " + (saldo + batasKredit));
      }
  }