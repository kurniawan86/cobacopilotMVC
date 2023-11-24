package Model;
import JSON.JSONbuku;
import Node.NodeBuku;
import java.util.ArrayList;

public class ModelBuku {
    private ArrayList<NodeBuku> listBuku;
    private JSONbuku jsoNbuku;

    public ModelBuku() {
        this.listBuku = new ArrayList<>();
        System.out.println("size "+listBuku.size());
        jsoNbuku = new JSONbuku();
        jsoNbuku.createJSON();
        listBuku = jsoNbuku.loadJSON();
        System.out.println("size "+listBuku.size());

    }

    public void addBuku(String judul,String pengarang, int tahunTerbit, int stok) {
        int kode = listBuku.size() + 1;
        NodeBuku buku = new NodeBuku(kode, judul, pengarang, tahunTerbit, stok);
        this.listBuku.add(buku);
    }

    public void updateBuku(int index, NodeBuku buku) {
        this.listBuku.set(index, buku);
    }

    public ArrayList<NodeBuku> getListBuku() {
        return this.listBuku;
    }

    public NodeBuku getBuku(int index) {
        return this.listBuku.get(index);
    }

    public void deleteBuku(int index) {
        this.listBuku.remove(index);
    }

    public void commitJSON(){
        jsoNbuku.saveJSON(listBuku);
    }
}
