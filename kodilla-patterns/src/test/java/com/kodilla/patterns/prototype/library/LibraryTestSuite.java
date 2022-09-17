package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {



    @Test
    void testGetBooks(){
        //Given
        Library libraryMain = new Library("Biblioteka 1");
        Book book1 = new Book("Title1","Jan", LocalDate.of(2022,3,12));
        Book book2 = new Book("Title2","Jan", LocalDate.of(2020,2,22));
        Book book3 = new Book("Title3","Jan", LocalDate.of(2024,5,2));
        Book book4 = new Book("Title4","Jan", LocalDate.of(2019,8,21));
        libraryMain.getBooks().add(book1);
        libraryMain.getBooks().add(book2);
        libraryMain.getBooks().add(book3);

        Library libraryCloned = null;
        try {
            libraryCloned = libraryMain.shallowCopy();
            libraryCloned.setName("Biblioteka 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library libraryClonedDeep = null;
        try {
            libraryClonedDeep = libraryMain.deepCopy();
            libraryClonedDeep.setName("Biblioteka 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        libraryClonedDeep.getBooks().add(book4);
        libraryClonedDeep.getBooks().remove(book1);
        libraryClonedDeep.getBooks().remove(book2);
        //Then

        Assertions.assertEquals(3,libraryMain.getBooks().size());
        Assertions.assertEquals("Biblioteka 1", libraryMain.getName());
        Assertions.assertEquals(3,libraryCloned.getBooks().size());
        Assertions.assertEquals("Biblioteka 2", libraryCloned.getName());
        Assertions.assertEquals(2,libraryClonedDeep.getBooks().size());
        Assertions.assertEquals("Biblioteka 3", libraryClonedDeep.getName());
    }
}
