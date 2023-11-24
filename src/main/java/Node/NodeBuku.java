package Node;

public class NodeBuku {

    private int kode;
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    private int stok;
    private NodeBuku next;

    public NodeBuku(int kode, String judul, String pengarang, int tahunTerbit, int stok) {
        this.kode = kode;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.stok = stok;
    }

    public String getJudul() {
        return this.judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return this.pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahunTerbit() {
        return this.tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getStok() {
        return this.stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public NodeBuku getNext() {
        return this.next;
    }

    public void setNext(NodeBuku next) {
        this.next = next;
    }

    public String toString() {
        return "kode: " + this.kode + "\n" +
               "Judul: " + this.judul + "\n" +
               "Pengarang: " + this.pengarang + "\n" +
               "Tahun Terbit: " + this.tahunTerbit + "\n" +
               "Stok: " + this.stok + "\n";
    }

    public Object getKode() {
        return this.kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }
}
