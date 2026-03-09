package gui.util;

import javafx.scene.control.TextField;

public class Constraints { // constraints = limitacoes
	
	//limita o que pode ser escrito no textfield
	public static void setTextFieldInteger(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue)->{
			if(newValue != null && !newValue.matches("\\d*")) { // eh digito
				txt.setText(oldValue);
			}
		});
	}
	
	//limita o tanto de coisas que podem ser escritas
	public static void setTextMaxLength(TextField txt, int max) {
		txt.textProperty().addListener((obs, oldValue, newValue)->{
			if(newValue != null && newValue.length() > max) { 
				txt.setText(oldValue);
			}
		});
	}
	
	//limita o que pode ser escrito no textfield
		public static void setTextFieldDouble(TextField txt) {
			txt.textProperty().addListener((obs, oldValue, newValue)->{
				if(newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) { // eh double
					txt.setText(oldValue);
				}
			});
		}
}
