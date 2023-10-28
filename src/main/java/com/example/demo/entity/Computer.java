package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "computers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int ID;
	
	@Column(name = "ten", nullable = false)
	private String ten;
	
	@Column(name = "cpu")
	private String cpu;
	
	@Column(name = "ram")
	private String ram;
	
	@Column(name = "ocung")
	private String ocung;
	
	@Column(name = "manhinh")
	private String manhinh;
	
	@Column(name = "hedieuhanh")
	private String hedieuhanh;
	
	@Column(name = "hangsanxuat")
	private String hangsanxuat;
	
	@Column(name = "dongia")
	private String dongia;
	
	@Column(name = "soluong")
	private String soluong;

	

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getOcung() {
		return ocung;
	}

	public void setOcung(String ocung) {
		this.ocung = ocung;
	}

	public String getManhinh() {
		return manhinh;
	}

	public void setManhinh(String manhinh) {
		this.manhinh = manhinh;
	}

	public String getHedieuhanh() {
		return hedieuhanh;
	}

	public void setHedieuhanh(String hedieuhanh) {
		this.hedieuhanh = hedieuhanh;
	}

	public String getHangsanxuat() {
		return hangsanxuat;
	}

	public void setHangsanxuat(String hangsanxuat) {
		this.hangsanxuat = hangsanxuat;
	}

	public String getDongia() {
		return dongia;
	}

	public void setDongia(String dongia) {
		this.dongia = dongia;
	}

	public String getSoluong() {
		return soluong;
	}

	public void setSoluong(String soluong) {
		this.soluong = soluong;
	}

	public Computer(String ten, String cpu, String ram, String ocung, String manhinh, String hedieuhanh,
			String hangsanxuat, String dongia, String soluong) {
		super();
		this.ten = ten;
		this.cpu = cpu;
		this.ram = ram;
		this.ocung = ocung;
		this.manhinh = manhinh;
		this.hedieuhanh = hedieuhanh;
		this.hangsanxuat = hangsanxuat;
		this.dongia = dongia;
		this.soluong = soluong;
	}

	public Computer(int iD, String ten, String cpu, String ram, String ocung, String manhinh, String hedieuhanh,
			String hangsanxuat, String dongia, String soluong) {
		super();
		ID = iD;
		this.ten = ten;
		this.cpu = cpu;
		this.ram = ram;
		this.ocung = ocung;
		this.manhinh = manhinh;
		this.hedieuhanh = hedieuhanh;
		this.hangsanxuat = hangsanxuat;
		this.dongia = dongia;
		this.soluong = soluong;
	}

	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
