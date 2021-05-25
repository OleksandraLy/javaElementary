package javaElementary.homework2;

public class Book implements Comparable<Book>{

    private String title;
    private String coverColor;
    private int pages;
    private int year;
    private int illustrations;

    @Override
    public int compareTo(Book o) {
        int tmp = o.year - this.year;
        if (tmp ==0) {
            return 0;
        } else
            return tmp;
    }
    @Override
    public int compareTo(Book o) {
        return coverColor.compareTo(o.getCoverColor());
    }
    // в рядках 12 і 20 підкреслює червоним, підкажіть, будь ласка, що не так з кодом?

    public Book(String title, String coverColor, int pages, int year, int illustrations){
        this.title = title;
        this.coverColor = coverColor;
        this.pages = pages;
        this.year = year;
        this.illustrations = illustrations;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIllustrations() {
        return illustrations;
    }

    public void setIllustrations(int illustrations) {
        this.illustrations = illustrations;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", coverColor='" + coverColor + '\'' +
                ", pages=" + pages +
                ", year=" + year +
                ", illustrations=" + illustrations +
                '}';
    }
    public int compareTo(Book o) {
        return title.compareTo(o.getTitle());
    }
}
