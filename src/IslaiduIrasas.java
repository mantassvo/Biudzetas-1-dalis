import java.time.LocalDate;
import java.time.LocalDateTime;

public class IslaiduIrasas {
    private float suma;
    private LocalDateTime data;
    private String kategorija;
    private String atsiskaitymoBudas;
    private String papildomaInfo;

    public IslaiduIrasas(float suma, LocalDateTime data, String kategorija, String atsiskaitymoBudas, String papildomaInfo) {
        this.suma = suma;
        this.data = data;
        this.kategorija = kategorija;
        this.atsiskaitymoBudas = atsiskaitymoBudas;
        this.papildomaInfo = papildomaInfo;
    }
    public IslaiduIrasas(){

    }

    public float getSuma() {
        return suma;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getKategorija() {
        return kategorija;
    }

    public String getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }
}
