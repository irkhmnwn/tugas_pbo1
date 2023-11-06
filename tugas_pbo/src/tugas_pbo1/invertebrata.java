package tugas_pbo1;



public class invertebrata extends binatang {
    
    private String nama;
    private String makanan;
    
    protected String bertekstur() {
        return "Memiliki tubuh yang bertekstur lunak & fleksibel";
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMakanan() {
        return makanan;
    }
    
    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }
}
