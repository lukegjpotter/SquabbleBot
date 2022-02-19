package com.lukegjpotter.selenium.squabblebot.operator.model;

public class AttemptResult {
    // Letters in Positions
    private String position1Letter, position2Letter, position3Letter, position4Letter, position5Letter;
    // Colours in Positions
    private String position1Colour, position2Colour, position3Colour, position4Colour, position5Colour;

    public AttemptResult(String position1Letter, String position2Letter, String position3Letter, String position4Letter, String position5Letter, String position1Colour, String position2Colour, String position3Colour, String position4Colour, String position5Colour) {
        this.position1Letter = position1Letter;
        this.position2Letter = position2Letter;
        this.position3Letter = position3Letter;
        this.position4Letter = position4Letter;
        this.position5Letter = position5Letter;
        this.position1Colour = position1Colour;
        this.position2Colour = position2Colour;
        this.position3Colour = position3Colour;
        this.position4Colour = position4Colour;
        this.position5Colour = position5Colour;
    }

    public String getPosition1Letter() {
        return position1Letter;
    }

    public void setPosition1Letter(String position1Letter) {
        this.position1Letter = position1Letter;
    }

    public String getPosition2Letter() {
        return position2Letter;
    }

    public void setPosition2Letter(String position2Letter) {
        this.position2Letter = position2Letter;
    }

    public String getPosition3Letter() {
        return position3Letter;
    }

    public void setPosition3Letter(String position3Letter) {
        this.position3Letter = position3Letter;
    }

    public String getPosition4Letter() {
        return position4Letter;
    }

    public void setPosition4Letter(String position4Letter) {
        this.position4Letter = position4Letter;
    }

    public String getPosition5Letter() {
        return position5Letter;
    }

    public void setPosition5Letter(String position5Letter) {
        this.position5Letter = position5Letter;
    }

    public String getPosition1Colour() {
        return position1Colour;
    }

    public void setPosition1Colour(String position1Colour) {
        this.position1Colour = position1Colour;
    }

    public String getPosition2Colour() {
        return position2Colour;
    }

    public void setPosition2Colour(String position2Colour) {
        this.position2Colour = position2Colour;
    }

    public String getPosition3Colour() {
        return position3Colour;
    }

    public void setPosition3Colour(String position3Colour) {
        this.position3Colour = position3Colour;
    }

    public String getPosition4Colour() {
        return position4Colour;
    }

    public void setPosition4Colour(String position4Colour) {
        this.position4Colour = position4Colour;
    }

    public String getPosition5Colour() {
        return position5Colour;
    }

    public void setPosition5Colour(String position5Colour) {
        this.position5Colour = position5Colour;
    }
}
