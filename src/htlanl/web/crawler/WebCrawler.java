package htlanl.web.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;

public class WebCrawler {

	private HashSet<String> links;
	private static final int MAX_DEPTH = 2;

    public WebCrawler() {
        links = new HashSet<>();
    }

    public void getPageLinks(String url, int depth) {
        if ((!links.contains(url) && (depth < MAX_DEPTH))) {
            System.out.println("Depth: " + depth + " [" + url + "]");
            try {
                links.add(url);
                Document document = Jsoup.connect(url).get();
                Elements pageLinks = document.select("a[href]");
                depth++;
                for (Element page : pageLinks) {
                    getPageLinks(page.attr("abs:href"), depth);
                }
            } catch (IOException e) {
                System.err.println("'" + url + "' caused an error: " + e.getMessage());
                //e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        new WebCrawler().getPageLinks("https://www.goudham.me/", 0);
    }
    
}
