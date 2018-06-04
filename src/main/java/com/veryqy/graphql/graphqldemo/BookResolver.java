package com.veryqy.graphql.graphqldemo;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
class BookResolver implements GraphQLResolver<Book> /* This class is a resolver for the Book "Data Class" */ {

    public Author author(Book book) {
        Author a=  new Author();
        a.setId(1);
        a.setName("1");
        return a;
    }

}