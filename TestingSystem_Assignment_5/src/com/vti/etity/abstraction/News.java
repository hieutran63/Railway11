package com.vti.etity.abstraction;

public class News implements INews{
	int id;
	String title;
	String publishDate;
	String author;
	String content;
	float averageRate;
	
	int[] rate;
	
	int COUNT = 0;
	
	public News(int id, String title, String publishDate, String author,
				String content, float averageRate, int[] rate) {
		super();
		this.id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
		this.averageRate = averageRate;
		
		this.rate = rate;
		COUNT++;
	}
	
	public int[] getRate() {
		return rate;
	}



	public void setRate(int[] rate) {
		this.rate = rate;
	}


	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getPublishDate() {
		return publishDate;
	}
	
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public float getAverageRate() {
		return averageRate;
	}
	

	@Override
	public void display() {
		System.out.println("News [title=" + title + ", publishDate=" + publishDate + ", "
				+ "author=" + author + "]");	
	}

	@Override
	public float calculate() {
		averageRate = (float)((rate[0] + rate[1] + rate[2])/ 3);
			return averageRate;
	}
	
//	@Override
//	public float Calculate() {
//		int[] rates = new int[] {0,1,2};
//		averageRate = (float)((rate[0] + rate[1] + rate[2])/ 3);
//		return averageRate;
//		
//	}
}

