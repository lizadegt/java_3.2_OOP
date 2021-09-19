package ru.netology.domain;

public class Image {
    private String imageUrl;
    private String headingImage;
    private String textImage;
    private String articleUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getHeadingImage() {
        return headingImage;
    }

    public void setHeadingImage(String headingImage) {
        this.headingImage = headingImage;
    }

    public String getTextImage() {
        return textImage;
    }

    public void setTextImage(String textImage) {
        this.textImage = textImage;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }
}
