package com.rss.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rss.pojo.Feed;
import com.rss.pojo.FeedMessage;
import com.rss.service.RSSFeedParser;

public class RssReaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RssReaderServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<FeedMessage> urlsToSend = new ArrayList<FeedMessage>();
		String url = request.getParameter("urlname");

		RSSFeedParser parser = new RSSFeedParser(url);
		Feed feed = parser.readFeed();
		System.out.println(feed);
		for (FeedMessage message : feed.getMessages()) {
			urlsToSend.add(message);
		}
		
		ArrayList<FeedMessage> headingNewsUrl = new ArrayList<FeedMessage>();
		headingNewsUrl.add(urlsToSend.get(40));
		headingNewsUrl.add(urlsToSend.get(11));
		headingNewsUrl.add(urlsToSend.get(18));
		
		request.setAttribute("urls",urlsToSend);
		request.setAttribute("testurls",headingNewsUrl);
		
		request.getRequestDispatcher("/views/rss.jsp")
		.forward(request, response);

	}

}