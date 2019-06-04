package com.baiyun.pojo;

import java.util.Date;

public class Book {
	/**
	 * ���
	 */
	private long id;
	/**
	 * ����
	 */
	private String title;
	/**
	 * �۸�
	 */
	private double price;
	/**
	 * ��������
	 */
	private Date publishDate;

	public Book(int id, String title, double price, Date publishDate) {
		this.setId(id);
		this.title = title;
		this.price = price;
		this.publishDate = publishDate;
	}

	public Book() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
