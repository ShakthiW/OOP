import java.util.Dictionary;

public class Book {

    private String iSBN;
    private Page page;

    public Book(String isBN,int no, String text) {
        this.iSBN = isBN;
        this.page = new Page(no,text);
    }

    public String getiSBN() {
        return iSBN;
    }

    public Page getPage() {
        return page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "iSBN='" + iSBN + '\'' +
                ", page=" + page +
                '}';
    }
}
