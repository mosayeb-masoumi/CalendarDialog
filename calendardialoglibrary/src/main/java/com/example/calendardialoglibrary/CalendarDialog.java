package com.example.calendardialoglibrary;

import android.graphics.drawable.Drawable;

public class CalendarDialog {

    private int min_year;
    private int max_year;
    private String title;
    private int titleTextColor;
    private int titleTextSize;
    private int buttonRegisterBackgroundColor;
    private int buttonRegisterTextColor;
    private int buttonRegisterTextSize;
    private int buttonSetTodayBackgroundColor;
    private int buttonSetTodayTextColor;
    private int buttonSetTodayTextSize;
    private int headerBackgroundColor;
    private int dialogBackgroundColor;
    private int dateBackgroundColor;
    private Boolean closeIconVisibility;
    private Drawable headerBackgroundDrawable;
    private Drawable buttonRegisterBackgroundDrawable;
    private Drawable buttonSetTodayBackgroundDrawable;
    private Drawable dialogBackgroundDrawable;
    private Drawable closeIconBackgroundDrawable;
    private Drawable dateBackgroundDrawable;

    public CalendarDialog(Builder builder) {
        this.min_year = builder.min_year;
        this.max_year = builder.max_year;
        this.title = builder.title;
        this.titleTextColor = builder.titleTextColor;
        this.titleTextSize =builder.titleTextSize;
        this.closeIconVisibility = builder.closeIconVisibility;
        this.headerBackgroundColor = builder.headerBackgroundColor;
        this.buttonRegisterBackgroundColor = builder.buttonRegisterBackgroundColor;
        this.buttonRegisterTextColor = builder.buttonRegisterTextColor;
        this.buttonRegisterTextSize = builder.buttonRegisterTextSize;
        this.buttonSetTodayBackgroundColor = builder.buttonSetTodayBackgroundColor;
        this.buttonSetTodayTextColor = builder.buttonSetTodayTextColor;
        this.buttonSetTodayTextSize = builder.buttonSetTodayTextSize;
        this.headerBackgroundDrawable = builder.headerBackgroundDrawable;
        this.buttonRegisterBackgroundDrawable = builder.buttonRegisterBackgroundDrawable;
        this.buttonSetTodayBackgroundDrawable = builder.buttonSetTodayBackgroundDrawable;
        this.dialogBackgroundDrawable = builder.dialogBackgroundDrawable;
        this.closeIconBackgroundDrawable = builder.closeIconBackgroundDrawable;
        this.dialogBackgroundColor = builder.dialogBackgroundColor;
        this.dateBackgroundColor = builder.dateBackgroundColor;
        this.dateBackgroundDrawable = builder.dateBackgroundDrawable;
    }

    //getter
    public int getMin_year() {
        return min_year;
    }

    public int getMax_year() {
        return max_year;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getCloseIconVisibility() {
        return closeIconVisibility;
    }

    public int getHeaderBackgroundColor() {
        return headerBackgroundColor;
    }

    public int getButtonRegisterBackgroundColor() {
        return buttonRegisterBackgroundColor;
    }

    public int getButtonSetTodayBackgroundColor() {
        return buttonSetTodayBackgroundColor;
    }

    public Drawable getHeaderBackgroundDrawable() {
        return headerBackgroundDrawable;
    }

    public Drawable getButtonRegisterBackgroundDrawable() {
        return buttonRegisterBackgroundDrawable;
    }

    public Drawable getButtonSetTodayBackgroundDrawable() {
        return buttonSetTodayBackgroundDrawable;
    }

    public Drawable getDialogBackgroundDrawable() {
        return dialogBackgroundDrawable;
    }

    public int getTitleTextColor() {
        return titleTextColor;
    }

    public int getTitleTextSize() {
        return titleTextSize;
    }

    public int getButtonRegisterTextColor() {
        return buttonRegisterTextColor;
    }

    public int getButtonRegisterTextSize() {
        return buttonRegisterTextSize;
    }

    public int getButtonSetTodayTextColor() {
        return buttonSetTodayTextColor;
    }

    public int getButtonSetTodayTextSize() {
        return buttonSetTodayTextSize;
    }

    public Drawable getCloseIconBackgroundDrawable() {
        return closeIconBackgroundDrawable;
    }

    public int getDialogBackgroundColor() {
        return dialogBackgroundColor;
    }

    public int getDateBackgroundColor() {
        return dateBackgroundColor;
    }

    public Drawable getDateBackgroundDrawable() {
        return dateBackgroundDrawable;
    }

    public static class Builder {

        private int min_year;
        private int max_year;
        private String title;
        private int titleTextColor;
        private int titleTextSize;
        private Boolean closeIconVisibility;
        private int headerBackgroundColor;
        private int buttonRegisterBackgroundColor;
        private int buttonRegisterTextColor;
        private int buttonRegisterTextSize;
        private int buttonSetTodayBackgroundColor;
        private int buttonSetTodayTextColor;
        private int buttonSetTodayTextSize;
        private int dialogBackgroundColor;
        private int dateBackgroundColor;
        private Drawable headerBackgroundDrawable;
        private Drawable buttonRegisterBackgroundDrawable;
        private Drawable buttonSetTodayBackgroundDrawable;
        private Drawable dialogBackgroundDrawable;
        private Drawable closeIconBackgroundDrawable;
        private Drawable dateBackgroundDrawable;

        public Builder setMin_year(final int min_year) {
            this.min_year = min_year;
            return this;
        }

        public Builder setMax_year(final int max_year) {
            this.max_year = max_year;
            return this;
        }

        public Builder setTitle(final String title) {
            this.title = title;
            return this;
        }

        public Builder setTitleTextColor(final int titleTextColor) {
            this.titleTextColor = titleTextColor;
            return this;
        }
        public Builder setTitleTextSize(final int titleTextSize) {
            this.titleTextSize = titleTextSize;
            return this;
        }

        public Builder setCloseIconVisibility(final Boolean closeIconVisibility) {
            this.closeIconVisibility = closeIconVisibility;
            return this;
        }

        public Builder setHeaderBackgroundColor(final int headerBackgroundColor) {
            this.headerBackgroundColor = headerBackgroundColor;
            return this;
        }

        public Builder setButtonRegisterTextColor(final int buttonRegisterTextColor) {
            this.buttonRegisterTextColor = buttonRegisterTextColor;
            return this;
        }
        public Builder setButtonRegisterBackgroundColor(final int buttonRegisterBackgroundColor) {
            this.buttonRegisterBackgroundColor = buttonRegisterBackgroundColor;
            return this;
        }
        public Builder setButtonRegisterTextSize(final int buttonRegisterTextSize) {
            this.buttonRegisterTextSize = buttonRegisterTextSize;
            return this;
        }

        public Builder setButtonSetTodayBackgroundColor(final int buttonSetTodayBackgroundColor) {
            this.buttonSetTodayBackgroundColor = buttonSetTodayBackgroundColor;
            return this;
        }

        public Builder setButtonSetTodayTextColor(final int buttonSetTodayTextColor) {
            this.buttonSetTodayTextColor = buttonSetTodayTextColor;
            return this;
        }
        public Builder setButtonSetTodayTextSize(final int buttonSetTodayTextSize) {
            this.buttonSetTodayTextSize = buttonSetTodayTextSize;
            return this;
        }

        public Builder setDialogBackgroundColor(final int dialogBackgroundColor) {
            this.dialogBackgroundColor = dialogBackgroundColor;
            return this;
        }

        public Builder setDateBackgroundColor(final int dateBackgroundColor) {
            this.dateBackgroundColor = dateBackgroundColor;
            return this;
        }

        public Builder setHeaderBackgroundDrawable(final Drawable headerBackgroundDrawable) {
            this.headerBackgroundDrawable = headerBackgroundDrawable;
            return this;
        }

        public Builder setButtonRegisterBackgroundDrawable(final Drawable buttonRegisterBackgroundDrawable) {
            this.buttonRegisterBackgroundDrawable = buttonRegisterBackgroundDrawable;
            return this;
        }

        public Builder setButtonSetTodayBackgroundDrawable(final Drawable buttonSetTodayBackgroundDrawable) {
            this.buttonSetTodayBackgroundDrawable = buttonSetTodayBackgroundDrawable;
            return this;
        }

        public Builder setDialogBackgroundDrawable(final Drawable dialogBackgroundDrawable) {
            this.dialogBackgroundDrawable = dialogBackgroundDrawable;
            return this;
        }

        public Builder setCloseIconBackgroundDrawable(final Drawable closeIconBackgroundDrawable) {
            this.closeIconBackgroundDrawable = closeIconBackgroundDrawable;
            return this;
        }

        public Builder setDateBackgroundDrawable(final Drawable dateBackgroundDrawable) {
            this.dateBackgroundDrawable = dateBackgroundDrawable;
            return this;
        }

        public CalendarDialog build() {
            return new CalendarDialog(this);
        }
    }
}
