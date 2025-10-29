package com.xworkz.book.internal;

public class BookCategory {
    public  char categoryCode;
    public long libraryId;

    public BookCategory(char a, int i) {
    }

    public BookCategory(char categoryCode, long libraryId) {
        this.categoryCode = categoryCode;
        this.libraryId = libraryId;
    }
}
