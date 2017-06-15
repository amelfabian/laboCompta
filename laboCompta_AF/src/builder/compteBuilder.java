package builder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import be.steformations.model.CompteGeneral;


public class compteBuilder {

	public HashMap<String, CompteGeneral> listComptes;
	public void save() {
		try {
			FileOutputStream fichier = new FileOutputStream("compte.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fichier);
			oos.writeObject(this.listComptes);
			oos.flush();
			oos.close();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void load(){
		try {
			FileInputStream fichier = new FileInputStream("compte.ser");
			ObjectInputStream ois = new ObjectInputStream(fichier);
			this.listComptes =  (HashMap<String, CompteGeneral>) ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
