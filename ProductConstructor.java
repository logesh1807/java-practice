
public class ProductConstructor {
private long id;
private String productName;
private String supplierName;
public ProductConstructor(long id,String productName,String supplierName) {
	super();
	id = id;
	productName = productName;
	supplierName = supplierName;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getSupplierName() {
	return supplierName;
}
public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
}

}
