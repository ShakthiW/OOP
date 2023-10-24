public class Page {
    private int pageNo;
    private String pageText;

    public Page(int pageNo, String pageText) {
        this.pageNo = pageNo;
        this.pageText = pageText;
    }

    public int getPageNo() {
        return pageNo;
    }

    public String getPageText() {
        return pageText;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageNo=" + pageNo +
                ", pageText='" + pageText + '\'' +
                '}';
    }
}
