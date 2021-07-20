package creationalDesingPatterns.builderPattern;

import creationalDesingPatterns.builderPattern.builders.GraphicCardBuilder;
import creationalDesingPatterns.builderPattern.model.GraphicCard;

public class Client {
    public static void main(String[] args) {
        GraphicCardBuilder builder = new GraphicCardBuilder();
        Director director = new Director(builder);

        director.builRTX3080();
        GraphicCard rtx3080 = builder.getProduct();

        director.builRX6900();
        GraphicCard rx6900 = builder.getProduct();

        System.out.println(rtx3080.toString());
        System.out.println(rx6900.toString());
    }
}
