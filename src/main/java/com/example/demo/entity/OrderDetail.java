package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int ID;
	
	@Column(name = "soluong")
	private int soluong;
	
	@Column(name = "gia")
	private float gia;
	
	@ManyToOne
	@JoinColumn(name = "OrderID")
	Order order;
	
	@ManyToOne
	@JoinColumn(name = "ComputerID")
	Computer computer;

	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	

	public OrderDetail(int soluong, float gia, Order order, Computer computer) {
		super();
		this.soluong = soluong;
		this.gia = gia;
		this.order = order;
		this.computer = computer;
	}

	public OrderDetail(int iD, int soluong, float gia, Order order, Computer computer) {
		super();
		ID = iD;
		this.soluong = soluong;
		this.gia = gia;
		this.order = order;
		this.computer = computer;
	}

	public OrderDetail(int iD, int soluong, Order order, Computer computer) {
		super();
		ID = iD;
		this.soluong = soluong;
		this.order = order;
		this.computer = computer;
	}

	public OrderDetail(int soluong, Order order, Computer computer) {
		super();
		this.soluong = soluong;
		this.order = order;
		this.computer = computer;
	}
	
	
}
