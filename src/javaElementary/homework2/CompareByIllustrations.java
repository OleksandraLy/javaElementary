package javaElementary.homework2;

import java.util.Comparator;

public class CompareByIllustrations implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getIllustrations()- o2.getIllustrations();
    }
}
