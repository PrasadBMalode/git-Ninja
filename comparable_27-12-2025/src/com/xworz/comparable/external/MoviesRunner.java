package com.xworz.comparable.external;

import com.xworz.comparable.dto.MoviesDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoviesRunner {
    public static void main(String[] args) {

        MoviesDto moviesDto1 = new MoviesDto(6, "KGF");
        MoviesDto moviesDto2 = new MoviesDto(8, "KGF2");
        MoviesDto moviesDto3 = new MoviesDto(5, "Kantara");
        MoviesDto moviesDto4 = new MoviesDto(5, "Intersteller");

        List<MoviesDto> list = new ArrayList<>();
        list.add(moviesDto1);
        list.add(moviesDto2);
        list.add(moviesDto3);
        list.add(moviesDto4);

        Collections.sort(list);

        list.forEach(System.out::println);
    }
}