class BrowserHistory {

    WebPage home;
    int previousPages, futurePages;

    public BrowserHistory(String homepage) {
        home = new WebPage(homepage);
        previousPages = 0; 
        futurePages = 0; 
    }
    
    public void visit(String url) {
        WebPage newHome = new WebPage(url);
        home.next = newHome;
        newHome.prev = home; 
        home = newHome; 
        previousPages++;
        futurePages = 0; 
    }
    
    public String back(int steps) {
        int stepsToBack = steps <= previousPages ? steps : previousPages;  
        for (int i = 0; i < stepsToBack; i++) {
            home = home.prev;
            previousPages--;
            futurePages++; 
        }
        return home.name; 
    }
    
    public String forward(int steps) {
        int stepsToForward = steps <= futurePages ? steps : futurePages ;  
        for (int i = 0; i < stepsToForward; i++) {
            home = home.next;
            previousPages++;
            futurePages--; 
        }
        return home.name; 
    }
}

class WebPage {
    WebPage next;
    WebPage prev;
    String name;

    public WebPage (String name) {
        this.name = name; 
        this.next = null; 
        this.prev = null; 
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */