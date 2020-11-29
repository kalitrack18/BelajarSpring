package belajar.spring.demo;

import belajar.spring.domain.Address;
import belajar.spring.domain.Person;

import java.util.Date;

public class DemoTanpaSpring {
    public static void main(String[] args) {
        Person jimi = new Person();
        jimi.setNama("Jimi Taufik Nuralia");
        jimi.setTanggalLahir(new Date());

        Address kantor = new Address();
        kantor.setJalan("Jl. Lintas Sumbawa Desa Nowa Kec. Woja");
        kantor.setKota("Dompu NTB");
        kantor.setKodePos("84251");

        jimi.setAlamat(kantor);

        System.out.println("Nama \t\t\t: " + jimi.getNama());
        System.out.println("Tanggal Lahir \t: " + jimi.getTanggalLahir());
        System.out.println("Alamat \t\t\t: " + jimi.getAlamat().getJalan());

    }
}
