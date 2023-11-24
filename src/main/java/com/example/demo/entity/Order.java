package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "computerId")
	private Integer computerId;
	
	@Column(name = "ten")
	private String ten;
	
	@Column(name = "gia")
	private float gia;
	
	@Column(name = "soluong")
	private int soluong = 1;
	

	@Column(name = "username")
	private String username;
	
	@Column(name = "ngaymua")
	private Date ngaymua;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int id, Integer computerId, String ten, float gia, int soluong, String username, Date ngaymua) {
		super();
		this.id = id;
		this.computerId = computerId;
		this.ten = ten;
		this.gia = gia;
		this.soluong = soluong;
		this.username = username;
		this.ngaymua = ngaymua;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getComputerId() {
		return computerId;
	}

	public void setComputerId(Integer computerId) {
		this.computerId = computerId;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getNgaymua() {
		return ngaymua;
	}

	public void setNgaymua(Date ngaymua) {
		this.ngaymua = ngaymua;
	}
	

	
	
}
