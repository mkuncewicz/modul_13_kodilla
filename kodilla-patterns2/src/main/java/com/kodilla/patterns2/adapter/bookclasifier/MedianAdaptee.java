package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;

import java.util.*;

public class MedianAdaptee implements BookStatistics {

    @Override
    public int averagePublicationYear(Map<BookSignature, BookB> books) {
        return 0;
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, BookB> books) {

        List<BookB> list = new ArrayList<>();

        for(BookB book : books.values()){
            list.add(book);
        }

        Collections.sort(list, Comparator.comparing(BookB::getYearOfPublication));

        int index = books.size()/2;

        if(list.size() % 2 == 0){
            return (list.get(index).getYearOfPublication() + list.get(index-1).getYearOfPublication()) / 2;
        }else{
        return list.get(index).getYearOfPublication();
    }
    }
}
