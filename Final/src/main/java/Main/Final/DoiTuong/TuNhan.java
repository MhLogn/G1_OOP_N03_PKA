package Main.Final.DoiTuong;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TuNhan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String HovaTen;
    private int Tuoi;
    private String Gioi_tinh;
    private String Dia_chi;
    private String Pham_toi;
    private String Muc_an;
    private String Ngay_vao_trai;
    private String Ngay_ra_trai;

    public TuNhan() {}

    @Override
    public String toString() {
        return "Tù Nhân: {Id: " + id +
                ", Họ và tên: " + HovaTen +
                ", Tuổi: " + Tuoi +
                ", Giới tính: " + Gioi_tinh +
                ", Địa chỉ: " + Dia_chi +
                ", Phạm tội: " + Pham_toi +
                ", Mức án: " + Muc_an +
                ", Ngày vào trại: " + Ngay_vao_trai +
                ", Ngày ra trại: " + Ngay_ra_trai + "}";
    }

    public TuNhan(String hovaTen, int tuoi, String gioi_tinh, String dia_chi, String pham_toi, String muc_an, String ngay_vao_trai, String ngay_ra_trai) {
        HovaTen = hovaTen;
        Tuoi = tuoi;
        Gioi_tinh = gioi_tinh;
        Dia_chi = dia_chi;
        Pham_toi = pham_toi;
        Muc_an = muc_an;
        Ngay_vao_trai = ngay_vao_trai;
        Ngay_ra_trai = ngay_ra_trai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHovaTen() {
        return HovaTen;
    }

    public void setHovaTen(String hovaTen) {
        HovaTen = hovaTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getGioi_tinh() {
        return Gioi_tinh;
    }

    public void setGioi_tinh(String gioi_tinh) {
        Gioi_tinh = gioi_tinh;
    }

    public String getDia_chi() {
        return Dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        Dia_chi = dia_chi;
    }

    public String getPham_toi() {
        return Pham_toi;
    }

    public void setPham_toi(String pham_toi) {
        Pham_toi = pham_toi;
    }

    public String getMuc_an() {
        return Muc_an;
    }

    public void setMuc_an(String muc_an) {
        Muc_an = muc_an;
    }

    public String getNgay_vao_trai() {
        return Ngay_vao_trai;
    }

    public void setNgay_vao_trai(String ngay_vao_trai) {
        Ngay_vao_trai = ngay_vao_trai;
    }

    public String getNgay_ra_trai() {
        return Ngay_ra_trai;
    }

    public void setNgay_ra_trai(String ngay_ra_trai) {
        Ngay_ra_trai = ngay_ra_trai;
    }
}
