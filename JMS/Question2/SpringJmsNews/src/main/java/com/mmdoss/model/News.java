package com.mmdoss.model;

import java.io.Serializable;

public class News implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int newsId;
	private String title;
	private String category;
	public News() {
		
	}
	public News(int newsId, String title, String category) {
		super();
		this.newsId = newsId;
		this.title = title;
		this.category = category;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return String.format("News [newsId=%s, title=%s, category=%s]", newsId, title, category);
	}
	

	
}