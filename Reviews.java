package com.example.carbooking;

import javax.persistence.Entity;

@Entity
public class Reviews {
    int booking_id;
    private String review_text;
    private int stars;
    private int attachments;

    public Reviews(int booking_id, String review_text, int stars, int attachments) {
        this.booking_id = booking_id;
        this.review_text = review_text;
        this.stars = stars;
        this.attachments = attachments;
    }

    public String getReview_text() {
        return review_text;
    }

    public void setReview_text(String review_text) {
        this.review_text = review_text;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getAttachments() {
        return attachments;
    }

    public void setAttachments(int attachments) {
        this.attachments = attachments;
    }
}
