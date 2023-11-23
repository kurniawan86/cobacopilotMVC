package Node;

public class NodeBuku {
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahunTerbit;
    private int stok;
    private NodeBuku next;

    public NodeBuku(String judul, String pengarang, String penerbit, int tahunTerbit, int stok) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.stok = stok;
        this.next = null;
    }

    public NodeBuku(String judul, String pengarang, String penerbit, int tahunTerbit, int stok, NodeBuku next) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.stok = stok;
        this.next = next;
    }

    public NodeBuku(String judul, String pengarang, int tahunTerbit, int stok) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.stok = stok;
        this.next = null;
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

    public String getPenerbit() {
        return this.penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
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
        return "Judul: " + this.judul + "\n" +
               "Pengarang: " + this.pengarang + "\n" +
               "Penerbit: " + this.penerbit + "\n" +
               "Tahun Terbit: " + this.tahunTerbit + "\n" +
               "Stok: " + this.stok + "\n";
    }
}
