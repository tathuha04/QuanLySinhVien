package model;

/**
 *
 * @author ha
 */
public class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private double gpa;
    
    public SinhVien(String maSinhVien, String hoTen, String lop, double gpa) {
        this.maSV = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.gpa = gpa;
    }
    
    public String getMaSV() { return maSV; }
    public void setMaSV(String maSV) { this.maSV = maSV; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public String getLop() { return lop; }
    public void setLop(String lop) { this.lop = lop; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

}
