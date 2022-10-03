import javax.swing.JOptionPane;

class Balok {
    // Deklarasi Atribute
    double panjang;
    double lebar;
    double tinggi;
}

public class VolumeBalok {
     // Deklarasi method utama
    public static void main(String[] args)
    {
        double volume;
        // Instan objek dari class balok
        Balok bl = new Balok();
        
        bl.panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang Balok"));
        bl.lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar Balok"));
        bl.tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi Balok"));
        
        // Hitung
        volume = bl.panjang * bl.lebar * bl.tinggi;
        System.out.println("Volume Balok = "+ volume +" cm3");
    }
}