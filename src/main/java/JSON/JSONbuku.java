package JSON;

import Node.NodeBuku;
import Node.NodeJSONbuku;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class JSONbuku {
    private String fileName;
    private NodeJSONbuku nodeJSONbuku;
    public JSONbuku(){
        this.fileName = "buku.json";
    }

    public void createJSON() {
       File file = new File(fileName);
       if (!file.exists()){
           JSONObject buku_Detail = new JSONObject();
           buku_Detail.put(nodeJSONbuku.judul, "");
           buku_Detail.put(nodeJSONbuku.pengarang, "");
           buku_Detail.put(nodeJSONbuku.tahunTerbit, 0);
           buku_Detail.put(nodeJSONbuku.stok, 0);
           JSONArray books = new JSONArray();
           books.add(buku_Detail);
           FileWriter newfile = null;
             try {
                newfile = new FileWriter(fileName);
                newfile.write(books.toJSONString());
                newfile.flush();
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
       }
    }
    public void saveJSON(ArrayList<NodeBuku> listBuku) {
        JSONArray books = new JSONArray();
        for (int i = 0; i < listBuku.size(); i++) {
            JSONObject buku_Detail = new JSONObject();
            buku_Detail.put(nodeJSONbuku.judul, listBuku.get(i).getJudul());
            buku_Detail.put(nodeJSONbuku.pengarang, listBuku.get(i).getPengarang());
            buku_Detail.put(nodeJSONbuku.tahunTerbit, listBuku.get(i).getPengarang());
            buku_Detail.put(nodeJSONbuku.stok, listBuku.get(i).getStok());
            books.add(buku_Detail);
        }
        FileWriter newfile = null;
        try {
            newfile = new FileWriter(fileName);
            newfile.write(books.toJSONString());
            newfile.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<NodeBuku> loadJSON() {
        ArrayList<NodeBuku> listBuku = new ArrayList<>();
        JSONParser parser = new JSONParser();
        try {
            JSONArray a = (JSONArray) parser.parse(new FileReader(fileName));
            for (int i = 1; i < a.size(); i++) {
                JSONObject buku_Detail = (JSONObject) a.get(i);
                String judul = buku_Detail.get(nodeJSONbuku.judul).toString();
                String pengarang = buku_Detail.get(nodeJSONbuku.pengarang).toString();
                int tahunTerbit = Integer.parseInt(buku_Detail.get(nodeJSONbuku.tahunTerbit).toString());
                int stok = Integer.parseInt(buku_Detail.get(nodeJSONbuku.stok).toString());
                NodeBuku buku = new NodeBuku(judul, pengarang, tahunTerbit, stok);
                listBuku.add(buku);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return listBuku;
    }
}
