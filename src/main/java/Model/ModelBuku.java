package Model;
import Node.NodeBuku;
import java.util.ArrayList;

public class ModelBuku {
    private ArrayList<NodeBuku> listBuku;

    public ModelBuku() {
        this.listBuku = new ArrayList<>();
    }

    public void addBuku(NodeBuku buku) {
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

    public void saveJSON() {

    }
    public void readfromJSON() {

    }
}
