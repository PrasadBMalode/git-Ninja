package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.dto.MovieDto;

public class MovieDtoRunner {
    public static void main(String[] args) {

        MovieDto movieDto=new MovieDto();

        movieDto.setMovieName("KGF");
        String name=movieDto.getMovieName();
        System.out.println("movie name=="+name);

        movieDto.setReleaseYear(2023);
        int year=movieDto.getReleaseYear();
        System.out.println("movie release year=="+year);

        movieDto.setRegistorNumber(897645364764l);
        long number=movieDto.getRegistorNumber();
        System.out.println("movie registration number=="+number);

        movieDto.setRating(9.9f);
        float rating=movieDto.getRating();
        System.out.println("movie rating=="+rating);
    }
}
