package ar.edu.unlp.info.oo2.accesobd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess{
	
	private DatabaseRealAccess bd;
	private Cliente clien;
	
	public DatabaseProxy (Cliente cliente) {
		
		this.clien = cliente;
		this.bd = new DatabaseRealAccess();
	}
	
	
	public Collection<String> getSearchResults(String queryString){
		
		if (this.autenticacion()) {
			return this.bd.getSearchResults(queryString);
		}
		return new ArrayList<String>();
	}
	
	public int insertNewRow(List<String> rowData) {
		
		if (!(this.autenticacion())) {
			return 0;
		}
		return this.bd.insertNewRow(rowData);
	}
	
	private boolean autenticacion() {
		 
		if (clien.getAuteticacion()) {
			return true;
		}
		return false;
	}
	
	
}
