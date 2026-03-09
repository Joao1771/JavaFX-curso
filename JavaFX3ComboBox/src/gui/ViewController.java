package gui;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.List;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Pessoa;

public class ViewController implements Initializable{
	
	@FXML
	private ComboBox<Pessoa> comboBoxPessoa;// comboBox = caixa com varias opcoes
	@FXML
	private Button btAll;
	
	private ObservableList<Pessoa> obsList;// o que aparece ao clicar
	
	@FXML
	private void onComboBoxPessoaAction() {
		//pega o item selecionado do combo box
		Pessoa pessoa = comboBoxPessoa.getSelectionModel().getSelectedItem();
		System.out.println(pessoa);
	}
	
	@FXML
	private void onBtAllAction() {
		//pega todos os itens do combo box
		for(Pessoa pessoa : comboBoxPessoa.getItems()) {
			System.out.println(pessoa);
		}
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {// initialize = ao abrir o programa
		List<Pessoa> lista = new ArrayList<>();//ArrayList = lista do java com funcoes add, get, set, remove size, etc
		lista.add(new Pessoa(1, "maria", "maria@gmail.com"));
		lista.add(new Pessoa(2, "alex", "alex@gmail.com"));
		lista.add(new Pessoa(3, "bob", "bob@gmail.com"));
		
		obsList = FXCollections.observableArrayList(lista);
		comboBoxPessoa.setItems(obsList);
		
		Callback<ListView<Pessoa>, ListCell<Pessoa>> factory = lv -> new ListCell<Pessoa>() {
			@Override
			protected void updateItem(Pessoa item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "": item.getNome());
		};
	};
	comboBoxPessoa.setCellFactory(factory);
	comboBoxPessoa.setButtonCell(factory.call(null));
	};
};
