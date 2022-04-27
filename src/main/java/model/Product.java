package model;

public class Product {
	
	private int id;
	private String productNameString;
	private String productReferenceString;
	
	
	
	public Product() {
		
	}

	public Product(int id, String productNameString, String productReferenceString) {
		super();
		this.id = id;
		this.productNameString = productNameString;
		this.productReferenceString = productReferenceString;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductNameString() {
		return productNameString;
	}
	public void setProductNameString(String productNameString) {
		this.productNameString = productNameString;
	}
	public String getProductReferenceString() {
		return productReferenceString;
	}
	public void setProductReferenceString(String productReferenceString) {
		this.productReferenceString = productReferenceString;
	}
	
	

}
