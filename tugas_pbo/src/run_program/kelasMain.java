package run_program;

import tugas_pbo1.subclassTekstur;
import tugas_pbo1.invertebrata;



public class kelasMain {

public static void main(String[] args) {
        
        invertebrata ubur2 = new invertebrata();
        ubur2.setNama("Ubur-ubur");
        ubur2.setAlat_nafas("kulit");
        ubur2.setAlat_reproduksi("ndak tau");
        ubur2.setAlat_gerak("otot");
        ubur2.setHabitat("air");
        ubur2.setBerkembang_biak("abadi");
        ubur2.setMakanan("Plankton");
        System.out.println("Nama makhluk hidup "+ubur2.getNama());
        System.out.println("Bernafas dengan "+ubur2.getAlat_nafas());
        System.out.println("Bereproduksi dengan "+ubur2.getAlat_reproduksi());
        System.out.println("Bergerak menggunakan "+ubur2.getAlat_gerak());
        System.out.println("Habitatnya berada di "+ubur2.getHabitat());
        System.out.println("Berkembang biak dengan cara "+ubur2.getBerkembang_biak());
        System.out.println("Makan "+ubur2.getMakanan());
        
        subclassTekstur sub = new subclassTekstur();
        String bertekstur = sub.aksesTekstur();
        System.out.println(bertekstur);
        

    }
}
