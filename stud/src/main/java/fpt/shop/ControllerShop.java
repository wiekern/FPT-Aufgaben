package fpt.shop;

import fpt.shop.ModelShop;
import fpt.shop.ViewShop;
import javafx.collections.ListChangeListener;

public class ControllerShop {
	private ViewShop vShop;
	private ModelShop mShop;
	
	public ControllerShop() {
		super();
	}
	
	public void link(ModelShop model, ViewShop view) {
		this.vShop = view;
		this.mShop = model;
	
		mShop.addListener(new ListChangeListener() {
			@Override
			public void onChanged(Change c) {
				vShop.getWarenShowList().refresh();
			}
			
		});
	
		vShop.getWarenShowList().setItems((mShop.getDelegate()));
		vShop.setWarenListCellFactory();
		vShop.clickWaren();
		vShop.setBtnActionAddProduct();
		vShop.setBtnActionDeleteProduct();
		vShop.setBtnActionLoadStrategy();
		vShop.setBtnActionStoreStrategy();
	}
}
