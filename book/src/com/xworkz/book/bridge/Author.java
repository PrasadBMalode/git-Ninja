package com.xworkz.book.bridge;

import com.xworkz.book.internal.*;

public interface Author {
    BookCategory category(BookCategory bookCategory);
    BookDetails details(BookDetails bookDetails);
    BookInfo info(BookInfo bookInfo);
    BookStore store(BookStore bookStore);
    BookSales sales(BookSales bookSales);
}
