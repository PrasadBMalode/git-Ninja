package com.xworkz.book.bridge;

import com.xworkz.book.internal.*;

public interface BookPrice {
    BookCategory category(BookCategory bookCategory);
    boolean details(BookDetails bookDetails);
    BookInfo info(BookInfo bookInfo);
    boolean store(BookStore bookStore);
    BookSales sales(BookSales bookSales);
}
