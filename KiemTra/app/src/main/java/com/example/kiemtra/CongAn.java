package com.example.kiemtra;

public class CongAn {
    private int hinh;
    private String ten;
    private String capbat;
    private String diachi;
    private String sosao;

    public CongAn(int hinh, String ten, String capbat, String diachi, String sosao) {
        this.hinh = hinh;
        this.ten = ten;
        this.capbat = capbat;
        this.diachi = diachi;
        this.sosao = sosao;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCapbat() {
        return capbat;
    }

    public void setCapbat(String capbat) {
        this.capbat = capbat;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSosao() {
        return sosao;
    }

    public void setSosao(String sosao) {
        this.sosao = sosao;
    }
}
