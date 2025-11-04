package com.xworkz.trip.external;

import com.xworkz.trip.dto.ReviewDto;

public class ReviewRunner {
    public static void main(String[] args) {
        ReviewDto reviewDto=new ReviewDto();
        reviewDto.setReviewId(24);
        int review= reviewDto.getReviewId();
        System.out.println("review=="+review);

        reviewDto.setComments("good");
        String comment= reviewDto.getComments();
        System.out.println("comment=="+comment);

        reviewDto.setGrade('A');
        char grade= reviewDto.getGrade();
        System.out.println("grade=="+grade);

        reviewDto.setNumber(7658768);
        long number=reviewDto.getNumber();
        System.out.println("number=="+number);

        reviewDto.setStaffRating(45.4f);
        float rating=reviewDto.getStaffRating();
        System.out.println("ratings=="+rating);

        reviewDto.setRatingScore(456.33);
        double ratings=reviewDto.getRatingScore();
        System.out.println("rating score=="+ratings);
        }
    }

