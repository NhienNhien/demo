package com.example.demo.entity;

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
	private Integer ID;
	
	@Column(name = "ngay")
	private String ngay;
	
	@Column(name = "diachiNH")
	private String diachiNH;
	
	@Column(name = "sdtNH")
	private String sdtNH;
	
	@Column(name = "gia")
	private float gia;
	
	@Column(name = "mota")
	private String mota;
	
	@ManyToOne
	@JoinColumn(name = "UserID")
	User user;
	
	@OneToMany(mappedBy = "order")
	List<OrderDetail> orderDetails;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Order(Integer iD, String ngay, String diachiNH, String sdtNH, float gia, String mota, User user,
			List<OrderDetail> orderDetails) {
		super();
		ID = iD;
		this.ngay = ngay;
		this.diachiNH = diachiNH;
		this.sdtNH = sdtNH;
		this.gia = gia;
		this.mota = mota;
		this.user = user;
		this.orderDetails = orderDetails;
	}

	

	public Order(String ngay, String diachiNH, String sdtNH, float gia, String mota, User user,
			List<OrderDetail> orderDetails) {
		super();
		this.ngay = ngay;
		this.diachiNH = diachiNH;
		this.sdtNH = sdtNH;
		this.gia = gia;
		this.mota = mota;
		this.user = user;
		this.orderDetails = orderDetails;
	}



	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNgay() {
		return ngay;
	}

	public void setNgay(String ngay) {
		this.ngay = ngay;
	}

	public String getDiachiNH() {
		return diachiNH;
	}

	public void setDiachiNH(String diachiNH) {
		this.diachiNH = diachiNH;
	}

	public String getSdtNH() {
		return sdtNH;
	}

	public void setSdtNH(String sdtNH) {
		this.sdtNH = sdtNH;
	}

	

	public float getGia() {
		return gia;
	}



	public void setGia(float gia) {
		this.gia = gia;
	}



	public void setID(Integer iD) {
		ID = iD;
	}



	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	
}
