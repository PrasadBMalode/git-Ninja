package com.xworkz.comparator.outer;

import com.xworkz.comparator.dto.MoviesDto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MoviesRunner {
    public static void main(String[] args) {

        MoviesDto moviesDto1=new MoviesDto(6,"KGF");
        MoviesDto moviesDto2=new MoviesDto(8,"KGF2");
        MoviesDto moviesDto3=new MoviesDto(5,"Kantara");
        MoviesDto moviesDto4=new MoviesDto(5,"Intersteller");

        List<MoviesDto> list=new ArrayList<>();
        list.add(moviesDto1);
        list.add(moviesDto2);
        list.add(moviesDto3);
        list.add(moviesDto4);

        Comparator<MoviesDto> comparator=(a,b)->a.getMovieName().compareTo(b.getMovieName());

        list.sort(comparator);
        list.forEach(n-> System.out.println(n));

    }
}
