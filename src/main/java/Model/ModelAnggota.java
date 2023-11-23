package Model;

import Node.NodeAnggota;

import java.util.ArrayList;

public class ModelAnggota {
    ArrayList<NodeAnggota> listAnggota;

    public ModelAnggota(){
        listAnggota = new ArrayList<>();
    }

    public void addAnggota(NodeAnggota anggota){
        listAnggota.add(anggota);
    }

    public void updateAnggota(int index, NodeAnggota anggota){
        listAnggota.set(index, anggota);
    }

    public ArrayList<NodeAnggota> getListAnggota(){
        return listAnggota;
    }

    public NodeAnggota getAnggota(int index){
        return listAnggota.get(index);
    }

    public void deleteAnggota(int index){
        listAnggota.remove(index);
    }
}
