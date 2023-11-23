package Node;

public class NodeAnggota {
    String nama;
    String alamat;
    String noTelp;

    public NodeAnggota(String nama, String alamat, String noTelp){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public String getNoTelp(){
        return noTelp;
    }

    public void setNama(String nama){
        this.nama = nama;
    }


}
