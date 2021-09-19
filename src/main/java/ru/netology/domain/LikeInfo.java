package ru.netology.domain;

public class LikeInfo {
    private int count;
    private int amountLikes;
    private boolean canLike;
    private int userLikes;
    private int canPublish;

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getAmountLikes() {
        return amountLikes;
    }

    public void setAmountLikes(int amountLikes) {
        this.amountLikes = amountLikes;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }
}
