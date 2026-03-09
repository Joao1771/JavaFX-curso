package gui;

import java.util.Locale;

import gui.util.Alerts;
//import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
//import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	@FXML
	private Button btSoma;
	@FXML
	private TextField txtnumero1;
	@FXML
	private TextField txtnumero2;
	@FXML
	private Label lblResultado;
	
	@FXML
	public void onBtSomaAction() {
		try {
		Locale.setDefault(Locale.US);
		double n1 = Double.parseDouble(txtnumero1.getText());
		double n2 = Double.parseDouble(txtnumero2.getText());
		double soma = n1 + n2;
		lblResultado.setText(String.format("%.2f", soma));
		}catch(NumberFormatException e) {
			Alerts.showAlerts("ERRO", "Calculadora de somar javafx", "Verifique os numeros digitados", AlertType.ERROR);
		}
	}
}
