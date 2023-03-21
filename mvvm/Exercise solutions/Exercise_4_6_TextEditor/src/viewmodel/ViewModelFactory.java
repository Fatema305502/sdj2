package viewmodel;

import model.ModelFactory;
import viewmodel.piechart.PieChartViewModel;
import viewmodel.text.TextViewModel;

public class ViewModelFactory {

    private PieChartViewModel pieChartViewModel;
    private TextViewModel textViewModel;
    public ViewModelFactory(ModelFactory modelFactory) {
        pieChartViewModel = new PieChartViewModel(modelFactory.getDataModel());
        textViewModel = new TextViewModel(modelFactory.getDataModel());
    }

    public PieChartViewModel getPieChartViewModel() {
        return pieChartViewModel;
    }

    public TextViewModel getTextViewModel() {
        return textViewModel;
    }
}
