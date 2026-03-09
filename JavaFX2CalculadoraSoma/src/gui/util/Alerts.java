package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerts {
	public static void showAlerts(String title, String header, String content, AlertType type) {
		Alert alert = new Alert(type);
		alert.setTitle(title);
		alert.setHeaderText(header);
		alert.setContentText(content);
		alert.show();
		// AlertType: muda o icone que aparece na janela (WARNING triangulo amarelo, ERROR quadrado vermelho, etc.)
	}
}
