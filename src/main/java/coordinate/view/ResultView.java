package coordinate.view;

import coordinate.model.Figure;

public class ResultView {

    public static void report(Figure figure){
        System.out.println(figure.reportArea());
    }
}
