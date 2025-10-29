package com.xworkz.book.bridge;

import com.xworkz.book.internal.*;

public class AuthorImpl implements Author{
    @Override
    public BookCategory category(BookCategory bookCategory) {
        System.out.println("Book category :"+bookCategory.categoryCode+ ","+ "library id:"+bookCategory.libraryId);
        return bookCategory;
    }

    @Override
    public BookDetails details(BookDetails bookDetails) {
        System.out.println("book is available :"+bookDetails.isAvailable+ ","+ "Book id:"+bookDetails.bookId);
        return bookDetails;
    }

    @Override
    public BookInfo info(BookInfo bookInfo) {
        System.out.println("Book info :"+bookInfo.authorName+ ","+ "book discount:"+bookInfo.discount);
        return bookInfo;
    }

    @Override
    public BookStore store(BookStore bookStore) {
        System.out.println("book store :"+bookStore.isOpen+ ","+ ":"+bookStore.annualIncome);
        return bookStore;
    }

    @Override
    public BookSales sales(BookSales bookSales) {
        System.out.println("Book sales :"+bookSales.profitEarned+ ","+ ":"+bookSales.totalBooksSold);
        return bookSales;
    }
}
