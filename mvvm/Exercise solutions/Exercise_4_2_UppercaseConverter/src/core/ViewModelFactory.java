package Core;

import ViewModel.UppercaseViewModel;

public class ViewModelFactory {

    private UppercaseViewModel viewModel;
    ModelFactory modelFactory;

    public ViewModelFactory(ModelFactory modelFactory) {
        this.modelFactory = modelFactory;
    }

    public UppercaseViewModel getUppercaseViewModel() {
        if (viewModel == null) {
            viewModel = new UppercaseViewModel(modelFactory.getModel());
        }
        return viewModel;
    }
}
