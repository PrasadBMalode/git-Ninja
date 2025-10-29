package com.xworkz.book.external;

import com.xworkz.book.bridge.*;
import com.xworkz.book.internal.*;

public class BookRunner {
    public static void main(String[] args) {
        Author author = new AuthorImpl();
        BookCategory bookCategory=new BookCategory('A',98767890);
        author.category(bookCategory);
        BookDetails bookDetails=new BookDetails(550,true);
        author.details(bookDetails);
        BookInfo bookInfo=new BookInfo(5.2f,"Karna v sharma");
        author.info(bookInfo);
        BookSales bookSales=new BookSales(5678.234,15000);
        author.sales(bookSales);
        BookStore bookStore=new BookStore(10000.345,true);
        author.store(bookStore);
        System.out.println("--------------------------------");


        BookDetail bookDetail= (BookDetail) new BookDetailImpl();
        BookCategory name=new BookCategory('C',98767890);
        bookDetail.category(name);
        BookDetails value=new BookDetails(950,false);
        bookDetail.details(value);
        BookInfo num=new BookInfo(2.2f,"Navya kumari");
        bookDetail.info(num);
        BookSales number=new BookSales(200.234,5000);
        bookDetail.sales(number);
        BookStore income=new BookStore(2500.345,false);
        bookDetail.store(income);
        System.out.println("--------------------------------");


        BookPrice bookPrice= (BookPrice) new BookPriceImpl();
        BookCategory category=new BookCategory('A',98767890);
        bookPrice.category(category);
        BookDetails details=new BookDetails(550,true);
        bookPrice.details(details);
        BookInfo info=new BookInfo(5.2f,"Karna v sharma");
        bookPrice.info(info);
        BookSales sales=new BookSales(5678.234,15000);
        bookPrice.sales(sales);
        BookStore store=new BookStore(10000.345,true);
        bookPrice.store(store);
        System.out.println("--------------------------------");


        BookReview bookReview= (BookReview) new BookReviewImpl();
        BookCategory names=new BookCategory('A',1234321);
        bookReview.category(names);
        BookDetails detail=new BookDetails(550,false);
        bookReview.details(detail);
        BookInfo infoNum=new BookInfo(1.2f,"sharma");
        bookReview.info(infoNum);
        BookSales sale=new BookSales(678.234,30000);
        bookReview.sales(sale);
        BookStore storeNumber=new BookStore(60000.345,true);
        bookReview.store(storeNumber);
        System.out.println("--------------------------------");

        Publisher publisher= (Publisher) new PublisherImpl();
        BookCategory publisherName=new BookCategory('A',1234321);
        publisher.category(publisherName);
        BookDetails detailOfBook=new BookDetails(550,false);
        publisher.details(detailOfBook);
        BookInfo infoOfLibrary=new BookInfo(1.2f,"sharma");
        publisher.info(infoOfLibrary);
        BookSales saleInMarket=new BookSales(678.234,30000);
        publisher.sales(saleInMarket);
        BookStore storeIncome=new BookStore(60000.345,true);
        publisher.store(storeIncome);

    }
    }

