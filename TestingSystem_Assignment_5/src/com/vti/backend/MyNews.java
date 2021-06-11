package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.etity.abstraction.News;

public class MyNews {
	List<News> dsNews;
	Scanner scanner;
	
	public MyNews() {
		dsNews = new ArrayList<News>();
		scanner = new Scanner(System.in);
	}
	
	public void insertNews(){
		System.out.println("Mời bạn nhập title");
		String title = scanner.nextLine();
		System.out.println("Mời bạn nhập publishDate");
		String publishDate = scanner.nextLine();
		System.out.println("Mời bạn nhập author");
		String author = scanner.nextLine();
		System.out.println("Mời bạn nhập content");
		String content = scanner.nextLine();
		
		System.out.println("Nhập đánh giá 1: ");
		int rate1 = scanner.nextInt();
		System.out.println("Nhập đánh giá 2: ");
		int rate2 = scanner.nextInt();
		System.out.println("Nhập đánh giá 3: ");
		int rate3 = scanner.nextInt();
		int[] rates = {rate1, rate2, rate3};
		
		News news = new News(rate2, title, publishDate, author, content, rate3, rates);
		dsNews.add(news);
	}
	
	public void viewListNews() {
		for (News news : dsNews) {
			news.display();
		}
	}
	
	public void averageRate() {
		for (News news : dsNews) {
			System.out.println("Title: " + news.getTitle() + " " + "RateAVG: " + news.calculate() );
		}
	}
}
