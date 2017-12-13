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
        this.diceBackgroud.setArcHeight(25);
        this.diceBackgroud.setArcWidth(25);
        this.diceBackgroud.setFill(Paint.valueOf("WHITE"));
        this.diceBackgroud.setHeight(80);
        this.diceBackgroud.setWidth(80);
        this.diceBackgroud.setStroke(Paint.valueOf("BLACK"));
        this.getChildren().add(diceBackgroud);
        for(int i =0; i<6; i++) {
            Circle c = new Circle();
            c.setRadius(9);
            c.setFill(Paint.valueOf("BLACK"));
            c.setCenterX(40);
            c.setCenterY(40);
            dotList.add(c);
            this.getChildren().add(c);
        }
        this.setOnMouseClicked(event -> setSelected(!this.isSelected));
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
            c.setCenterX(40);
            c.setCenterY(40);
        }
    }
    private void makeTwoDots(){
        for(Circle c : dotList) {
            c.setCenterX(20);
            c.setCenterY(20);
        }
        dotList.get(5).setCenterY(60);
        dotList.get(5).setCenterX(60);
    }
    private void makeThreeDots(){
        dotList.get(0).setCenterY(20);
        dotList.get(0).setCenterX(20);
        dotList.get(1).setCenterY(20);
        dotList.get(1).setCenterX(20);
        dotList.get(2).setCenterY(20);
        dotList.get(2).setCenterX(20);
        dotList.get(3).setCenterY(20);
        dotList.get(3).setCenterX(20);
        dotList.get(4).setCenterY(40);
        dotList.get(4).setCenterX(40);
        dotList.get(5).setCenterY(60);
        dotList.get(5).setCenterX(60);
    }

    private void makeFourDots(){
        dotList.get(0).setCenterY(20);
        dotList.get(0).setCenterX(20);
        dotList.get(1).setCenterY(20);
        dotList.get(1).setCenterX(20);
        dotList.get(2).setCenterY(20);
        dotList.get(2).setCenterX(60);
        dotList.get(3).setCenterY(60);
        dotList.get(3).setCenterX(20);
        dotList.get(4).setCenterY(60);
        dotList.get(4).setCenterX(60);
        dotList.get(5).setCenterY(60);
        dotList.get(5).setCenterX(60);
    }

    private void makeFiveDots(){
        dotList.get(0).setCenterY(20);
        dotList.get(0).setCenterX(20);
        dotList.get(1).setCenterY(40);
        dotList.get(1).setCenterX(40);
        dotList.get(2).setCenterY(20);
        dotList.get(2).setCenterX(60);
        dotList.get(3).setCenterY(60);
        dotList.get(3).setCenterX(20);
        dotList.get(4).setCenterY(60);
        dotList.get(4).setCenterX(60);
        dotList.get(5).setCenterY(60);
        dotList.get(5).setCenterX(60);
    }

    private void makeSixDots(){
        dotList.get(0).setCenterY(20);
        dotList.get(0).setCenterX(20);
        dotList.get(1).setCenterY(40);
        dotList.get(1).setCenterX(20);
        dotList.get(2).setCenterY(20);
        dotList.get(2).setCenterX(60);
        dotList.get(3).setCenterY(60);
        dotList.get(3).setCenterX(20);
        dotList.get(4).setCenterY(40);
        dotList.get(4).setCenterX(60);
        dotList.get(5).setCenterY(60);
        dotList.get(5).setCenterX(60);
    }
}
