package command;

import model.Store;

public class ReadProductsToBinaryFileCommand implements Command<Integer> {

	private Store store;
	private String fileName;
	
	
	
	public ReadProductsToBinaryFileCommand(Store store, String fileName) {
		this.store = store;
		this.fileName = fileName;
	}



	@Override
	public Integer execute() {
		return store.readProductsFromBinaryFile(fileName);
		
	}

}
