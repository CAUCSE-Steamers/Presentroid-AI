package controller;

import javafx.fxml.*;
import javafx.scene.control.*;
import resource.*;

/**
 * Created by user on 2016-01-19.
 */
public class ResourceController {
    @FXML
    private TableView<Data> dataTable;
    @FXML
    private TableColumn<Data, String> nameColumn;
    @FXML
    private Label nameLabel;
    @FXML
    private Label directoryLabel;
    @FXML
    private Label xLabel;
    @FXML
    private Label yLabel;
    @FXML
    private Label script;

    public ResourceController(){

    }

    @FXML
    private void initialize(){
        nameColumn.setCellValueFactory(cellData->cellData.getValue().getNameProperty());
    }

}
