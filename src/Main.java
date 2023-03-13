// Plik: bank.java
// Przykład demonstruje podstawy składni obiektowej w Javie // Kompilacja programu: javac Bank.java
// Uruchomienie programu: java BankApp //=========================================================
import java.io.*;
class BankAccount { //definicja klasy BankAccount
    private double balance;                   // saldo konta
    public BankAccount(double openingBalance) { //konstruktor
        balance = openingBalance; // inicjowanie konta
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public void display() {
        // dokonuje wpłaty
// dokonuje wypłaty
// wypisuje saldo
        System.out.println("saldo=" + balance);
    }
} // koniec klasy BankAccount //==========================================================
class BankApp {
    public static void main(String[] args) throws IOException {

        BankAccount ba1 = new BankAccount(100.00);
            // tworzymy obiekt o referencji ba1 (konto)
        int op; double n; float m;
        System.out.print("Przed transakcjami, ");
        ba1.display();      // wypisujemy saldo
        do {
            menu();
            System.out.print("Wybierz cos: ");
            op = getInt();
            switch (op) {
                case 1: // wplata
                {
                    System.out.print("Podaj kwote(double): ");
                    n = getDouble();
                    ba1.deposit(n);
                    System.out.print("Po transakcji: ");
                    ba1.display();
                    break; }
                case 2: // wyplata
                {
                    System.out.print("Podaj kwote: ");
                    n = getDouble();
                    ba1.withdraw(n); System.out.print("Po transakcji: ");
                    ba1.display();
                    break; }
                case 0: // koniec
                {
                    System.out.println("Koniec transakcji "); System.out.print("Aktualny stan: "); ba1.display();
                    break;
                }
                default: System.out.println("Zla opcja !!!"); } // koniec switch
        }while (op != 0) ;
    }  // koniec main()
//--------------------------------------------------------
    public static void menu(){
    System.out.println("\n_____________________________"); System.out.println(" Operacje "); System.out.println("_______________________________"); System.out.println(" 1. Wplata "); System.out.println(" 2. Wyplata "); System.out.println(" 0. Koniec programu ");
    System.out.println("===============================");
    }
    //-------------------------------------------------------- p
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        return line;
    }
//--------------------------------------------------------
        public static int getInt() throws IOException {
              String s = getString();
              int lnum = Integer.parseInt(s);
              return lnum;
              } //--------------------------------------------------------
        public static double getDouble() throws IOException {
              String s = getString();
              double adoub = Double.valueOf(s);
              return adoub;
              } //--------------------------------------------------------
        public static float getFloat() throws IOException {
              String s = getString();
              float aflo = Float.valueOf(s);
              return aflo;
              }
} // koniec klasy BankApp
