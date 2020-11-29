package belajar.spring.domain;

import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM2;

import java.util.Date;

public class Person {
    private Integer id;
    private String nama;
    private Date tanggalLahir;
    private Address alamat;

    public Address getAlamat() {
        return alamat;
    }

    public void setAlamat(Address alamat) {
        this.alamat = alamat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
}
