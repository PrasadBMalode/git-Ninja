package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.dto.SeriesDto;

public class SeriesDtoRunner {
    public static void main(String[] args) {
        SeriesDto seriesDto=new SeriesDto();

        seriesDto.setSeriesName("Bhay");
        String name=seriesDto.getSeriesName();
        System.out.println("Series name=="+name);

        seriesDto.setReleaseYear(2025);
        int year=seriesDto.getReleaseYear();
        System.out.println("Series release year=="+year);

        seriesDto.setSeriesAvailabalIn("MX-Player");
        String ott=seriesDto.getSeriesAvailabalIn();
        System.out.println("Series availabal in =="+ott);

        seriesDto.setRating(9.9f);
        float rating=seriesDto.getRating();
        System.out.println("Series rating=="+rating);
    }
}
