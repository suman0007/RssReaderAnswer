package com.rss.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rss.model.Feed;
import com.rss.model.FeedMessage;
import com.rss.read.RSSFeedParser;

public class RssReaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RssReaderServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<String> urlsToSend = new ArrayList<String>();
		String url = request.getParameter("urlname");

		RSSFeedParser parser = new RSSFeedParser(url);
		Feed feed = parser.readFeed();
		System.out.println(feed);
		for (FeedMessage message : feed.getMessages()) {
			urlsToSend.add(message.getGuid());
		}

		request.setAttribute("urls",urlsToSend);
		request.getRequestDispatcher("/rss.jsp")
		.forward(request, response);

	}

}