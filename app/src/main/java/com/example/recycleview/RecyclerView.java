package com.example.recycleview;

public class RecyclerView {
    private String nama;
    private String info;
    private int logo;

    public RecyclerView(String nama, String info, int logo) {
        this.nama = nama;
        this.info = info;
        this.logo = logo;
    }

    public String getName() {
        return nama;
    }

    public String getInfo() {
        return info;
    }

    public int getLogo() {
        return logo;
    }
}

