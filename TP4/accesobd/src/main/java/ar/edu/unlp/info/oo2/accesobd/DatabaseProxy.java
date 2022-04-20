package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess{
	
	private DatabaseAccess bd;
	
	
	public Collection<String> getSearchResults(String queryString){
		
		if (this.check()) {
			return this.bd.getSearchResults(queryString);
		}
		return new Collection<String>();
	}
	
	public int insertNewRow(List<String> rowData) {
		
		if (!(this.check())) {
			return 0;
		}
		return this.bd.insertNewRow(rowData);
	}
	
	private boolean check() {
		
		if () {
			
			return true;
		}
		return false;
	}
	
	
}
