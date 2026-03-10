package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	@FXML
	private MenuItem menuItemDepartamento;
	@FXML
	private MenuItem menuItemVendedor;
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onmenuItemDepartamentoAction() {
		System.out.println("onmenuItemDepartamentoAction");
	}
	@FXML
	public void onmenuItemVendedorAction() {
		System.out.println("onmenuItemVendedorAction");
	}
	@FXML
	public void onmenuItemAboutAction() {
		System.out.println("onmenuItemAboutAction");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
