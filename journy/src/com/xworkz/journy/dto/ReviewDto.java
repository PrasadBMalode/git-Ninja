package com.xworkz.trip.dto;

public class ReviewDto {
    private String comments;
    private int reviewId;
    private double ratingScore;
    private float staffRating;
    private long number;
    private char grade;

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setRatingScore(double ratingScore) {
        this.ratingScore = ratingScore;
    }

    public double getRatingScore() {
        return ratingScore;
    }

    public void setStaffRating(float staffRating) {
        this.staffRating = staffRating;
    }

    public float getStaffRating() {
        return staffRating;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }
}

