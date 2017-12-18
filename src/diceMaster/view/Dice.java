package diceMaster.view;
import javafx.scene.Group;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.LinkedList;
import java.util.List;

public class Dice extends Group {
    private Rectangle diceBackgroud = new Rectangle();
    private List<Circle> dotList = new LinkedList<>();

    private boolean isSelected = false;
    private Integer numberOfDots = 1;

    public double getDiceScale() {
        return diceScale;
    }

    public void setDiceScale(double diceScale) {
        this.diceScale = diceScale;
        resizeDice();
    }

    private double diceScale = 1;

    public Integer getNumberOfDots() {
        return numberOfDots;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
        if(this.isSelected){
            this.diceBackgroud.setStyle(
                    "-fx-effect: innershadow( three-pass-box, #ff2220, 50, 0, 0, 0);" +
                            "-fx-background-insets: 100;");
        }
        else
            this.diceBackgroud.setStyle("");
    }

    public Dice(){
        this.diceBackgroud.setArcHeight(25*diceScale);
        this.diceBackgroud.setArcWidth(25*diceScale);
        this.diceBackgroud.setFill(Paint.valueOf("WHITE"));
        this.diceBackgroud.setHeight(80*diceScale);
        this.diceBackgroud.setWidth(80*diceScale);
        this.diceBackgroud.setStroke(Paint.valueOf("BLACK"));
        this.getChildren().add(diceBackgroud);
        for(int i =0; i<6; i++) {
            Circle c = new Circle();
            c.setRadius(9*diceScale);
            c.setFill(Paint.valueOf("BLACK"));
            c.setCenterX(40*diceScale);
            c.setCenterY(40*diceScale);
            dotList.add(c);
            this.getChildren().add(c);
        }
        this.setOnMouseClicked(event -> setSelected(!this.isSelected));
    }

    private void resizeDice(){
        this.diceBackgroud.setArcHeight(25*diceScale);
        this.diceBackgroud.setArcWidth(25*diceScale);
        this.diceBackgroud.setFill(Paint.valueOf("WHITE"));
        this.diceBackgroud.setHeight(80*diceScale);
        this.diceBackgroud.setWidth(80*diceScale);
        this.diceBackgroud.setStroke(Paint.valueOf("BLACK"));
        for(Circle c: dotList) {
            c.setRadius(9*diceScale);
            c.setFill(Paint.valueOf("BLACK"));
        }
        this.setNumberOfDots(this.numberOfDots);
    }



    public void setNumberOfDots(int number){
        numberOfDots = number;
        switch (number){
            case 1:
                makeOneDot();
                break;
            case 2:
                makeTwoDots();
                break;
            case 3:
                makeThreeDots();
                break;
            case 4:
                makeFourDots();
                break;
            case 5:
                makeFiveDots();
                break;
            case 6:
                makeSixDots();
                break;
            default:
                throw new IllegalArgumentException();
        }

    }

    private void makeOneDot(){
        for(Circle c : dotList) {
            c.setCenterX(40*diceScale);
            c.setCenterY(40*diceScale);
        }
    }
    private void makeTwoDots(){
        for(Circle c : dotList) {
            c.setCenterX(20*diceScale);
            c.setCenterY(20*diceScale);
        }
        dotList.get(5).setCenterY(60*diceScale);
        dotList.get(5).setCenterX(60*diceScale);
    }
    private void makeThreeDots(){
        dotList.get(0).setCenterY(20*diceScale);
        dotList.get(0).setCenterX(20*diceScale);
        dotList.get(1).setCenterY(20*diceScale);
        dotList.get(1).setCenterX(20*diceScale);
        dotList.get(2).setCenterY(20*diceScale);
        dotList.get(2).setCenterX(20*diceScale);
        dotList.get(3).setCenterY(20*diceScale);
        dotList.get(3).setCenterX(20*diceScale);
        dotList.get(4).setCenterY(40*diceScale);
        dotList.get(4).setCenterX(40*diceScale);
        dotList.get(5).setCenterY(60*diceScale);
        dotList.get(5).setCenterX(60*diceScale);
    }

    private void makeFourDots(){
        dotList.get(0).setCenterY(20*diceScale);
        dotList.get(0).setCenterX(20*diceScale);
        dotList.get(1).setCenterY(20*diceScale);
        dotList.get(1).setCenterX(20*diceScale);
        dotList.get(2).setCenterY(20*diceScale);
        dotList.get(2).setCenterX(60*diceScale);
        dotList.get(3).setCenterY(60*diceScale);
        dotList.get(3).setCenterX(20*diceScale);
        dotList.get(4).setCenterY(60*diceScale);
        dotList.get(4).setCenterX(60*diceScale);
        dotList.get(5).setCenterY(60*diceScale);
        dotList.get(5).setCenterX(60*diceScale);
    }

    private void makeFiveDots(){
        dotList.get(0).setCenterY(20*diceScale);
        dotList.get(0).setCenterX(20*diceScale);
        dotList.get(1).setCenterY(40*diceScale);
        dotList.get(1).setCenterX(40*diceScale);
        dotList.get(2).setCenterY(20*diceScale);
        dotList.get(2).setCenterX(60*diceScale);
        dotList.get(3).setCenterY(60*diceScale);
        dotList.get(3).setCenterX(20*diceScale);
        dotList.get(4).setCenterY(60*diceScale);
        dotList.get(4).setCenterX(60*diceScale);
        dotList.get(5).setCenterY(60*diceScale);
        dotList.get(5).setCenterX(60*diceScale);
    }

    private void makeSixDots(){
        dotList.get(0).setCenterY(20*diceScale);
        dotList.get(0).setCenterX(20*diceScale);
        dotList.get(1).setCenterY(40*diceScale);
        dotList.get(1).setCenterX(20*diceScale);
        dotList.get(2).setCenterY(20*diceScale);
        dotList.get(2).setCenterX(60*diceScale);
        dotList.get(3).setCenterY(60*diceScale);
        dotList.get(3).setCenterX(20*diceScale);
        dotList.get(4).setCenterY(40*diceScale);
        dotList.get(4).setCenterX(60*diceScale);
        dotList.get(5).setCenterY(60*diceScale);
        dotList.get(5).setCenterX(60*diceScale);
    }
}
