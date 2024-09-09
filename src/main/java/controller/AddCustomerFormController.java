package controller;

import DB.DB_Connection;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import model.Customer;

import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

public class AddCustomerFormController implements Initializable {

    @FXML
    private JFXButton btnAdd;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnSearch;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private JFXComboBox<String> cmbTitle;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtContact;

    @FXML
    private JFXTextField txtID;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtSalary;

    @FXML
    private DatePicker dpDOB;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> title=FXCollections.observableArrayList();
        title.add("MR.");
        title.add("MISS.");
        title.add("MRS.");
        cmbTitle.setItems(title);
    }

    @FXML
    void btnAddOnAction(ActionEvent event) {

        Customer customer = new Customer(
                txtID.getText(),
                cmbTitle.getValue()+txtName.getText(),
                txtAddress.getText(),
                Double.parseDouble(txtSalary.getText()),
                txtContact.getText(),
                dpDOB.getValue());

        System.out.println(customer);

        List<Customer> customerList =DB_Connection.getInstance().getConnection();

        customerList.add(customer);

        txtID.setText(null);
        cmbTitle.setValue(null);
        txtName.setText(null);
        txtAddress.setText(null);
        txtSalary.setText(null);
        txtContact.setText(null);
        dpDOB.setValue(null);


    }
}

