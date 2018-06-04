package com.veryqy.graphql.graphqldemo;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    public Query() {

    }

    public List<Book> books() {
        Book book1=new Book();
        book1.setAuthorId(1);
        book1.setId(1);
        book1.setName("书1");
        Book book2=new Book();
        book2.setAuthorId(1);
        book2.setId(2);
        book2.setName("书2");

        ArrayList<Book> books=new ArrayList<>();
        books.add(book1);
        books.add(book2);
        return books;
    }

}