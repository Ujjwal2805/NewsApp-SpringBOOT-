package com.newsapp.controller;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class ApiCall {
	
	//API Call to get leagues of the different games
	public String newsGlance() throws IOException, InterruptedException
	{
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://bing-news-search1.p.rapidapi.com/news/trendingtopics?textFormat=Raw&safeSearch=Off"))
				.header("X-BingApis-SDK", "true")
				.header("X-RapidAPI-Host", "bing-news-search1.p.rapidapi.com")
				.header("X-RapidAPI-Key", "f77ef69cc2msh92a9db8cda2a20fp177683jsndf22e7dd64ea")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		
		return response.body();
	}
	
	
	//API Call to get News of the different games
	public String news() throws IOException, InterruptedException
	{
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://bing-news-search1.p.rapidapi.com/news?safeSearch=Off&textFormat=Raw"))
				.header("X-BingApis-SDK", "true")
				.header("X-RapidAPI-Host", "bing-news-search1.p.rapidapi.com")
				.header("X-RapidAPI-Key", "f77ef69cc2msh92a9db8cda2a20fp177683jsndf22e7dd64ea")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		
	
		
		return response.body();
	}
	
	
	
	//API Call to get live matches of the different games
	public String srch(String str) throws IOException, InterruptedException
	{
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://bing-news-search1.p.rapidapi.com/news/search?q=%3CREQUIRED%3E&freshness=Day&textFormat=Raw&safeSearch=Off"))
				.header("X-BingApis-SDK", "true")
				.header("X-RapidAPI-Host", "bing-news-search1.p.rapidapi.com")
				.header("X-RapidAPI-Key", "f77ef69cc2msh92a9db8cda2a20fp177683jsndf22e7dd64ea")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		return response.body();
	}
}
