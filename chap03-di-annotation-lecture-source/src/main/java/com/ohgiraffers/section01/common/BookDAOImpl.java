package com.ohgiraffers.section01.common;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookDAOImpl implements BookDAO {
    private Map<Integer, BookDTO> bookList;

    public BookDAOImpl() {
        bookList = new HashMap<>();
        bookList.put(1, new BookDTO(1, 123445, "자바의 정석", "남궁성", "도우출판", new Date()));
        bookList.put(2, new BookDTO(2, 122995, "칭찬은 고래도 춤추게 한다.", "고래", "고래출판", new Date()));
    }

    @Override
    public List<BookDTO> findAllBook() {

        /* 설명. HashMap의 value들만 뽑아 ArrayList 형태로 반환 (Map -> List) */
        val bookList1 = bookList;
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO searchBookBySequence(int sequence) {
        return bookList.get(sequence);
    }

}
