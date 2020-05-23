package com.rk;

public class MainProgram {
    public static void main(String[] args) {
        new Mahasiswa("Riko", "897493", "Tata Boga");
        new Mahasiswa("Rahmat", "234324", "Teknik Mesin");
    }
}


class Mahasiswa {
    String Nama;
    String NIM;
    String Jurusan;

    Mahasiswa(String inputNama, String inputNIM, String inputJurusan) {
        this.Nama = inputNama;
        this.NIM = inputNIM;
        this.Jurusan = inputJurusan;

        System.out.println("Nama      : " + Nama);
        System.out.println("NIM       : " + NIM);
        System.out.println("Jurusan   : " + Nama);
        System.out.println();
    }
}

