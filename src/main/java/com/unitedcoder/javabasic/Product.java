package com.unitedcoder.javabasic;

public class Product {
    private boolean status;
    private String productName;
    private String manufacturer;
    private String condition;
    private String productCode;
    private boolean autoGenerateCode;
    private double weight;
    private String dimensionUnit;
    private double width;
    private double height;
    private double depth;
    private boolean includeFeaturedProduct;
    private boolean includeLatestProduct;
    private boolean availableForPurchase;
    private String listDate;
    private boolean useStockLevel;
    private int stockLevel;
    private int stockWarning;
    private String upcCode;
    private String eanCode;
    private String janCode;
    private String isbnCode;
    private String gtinCode;
    private String mpnCode;
    private String googleCategory;

    public Product() {
    }

    public Product(boolean status) {
        this.status = status;
    }


    public Product(boolean status, String productName, String manufacturer, String condition, String productCode, boolean autoGenerateCode, double weight, String dimensionUnit, double width, double height, double depth, boolean includeFeaturedProduct, boolean includeLatestProduct, boolean availableForPurchase, String listDate, boolean useStockLevel, int stockLevel, int stockWarning, String upcCode, String eanCode, String janCode, String isbnCode, String gtinCode, String mpnCode, String googleCategory) {
        this.status = status;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.condition = condition;
        this.productCode = productCode;
        this.autoGenerateCode = autoGenerateCode;
        this.weight = weight;
        this.dimensionUnit = dimensionUnit;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.includeFeaturedProduct = includeFeaturedProduct;
        this.includeLatestProduct = includeLatestProduct;
        this.availableForPurchase = availableForPurchase;
        this.listDate = listDate;
        this.useStockLevel = useStockLevel;
        this.stockLevel = stockLevel;
        this.stockWarning = stockWarning;
        this.upcCode = upcCode;
        this.eanCode = eanCode;
        this.janCode = janCode;
        this.isbnCode = isbnCode;
        this.gtinCode = gtinCode;
        this.mpnCode = mpnCode;
        this.googleCategory = googleCategory;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public boolean isAutoGenerateCode() {
        return autoGenerateCode;
    }

    public void setAutoGenerateCode(boolean autoGenerateCode) {
        this.autoGenerateCode = autoGenerateCode;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDimensionUnit() {
        return dimensionUnit;
    }

    public void setDimensionUnit(String dimensionUnit) {
        this.dimensionUnit = dimensionUnit;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public boolean isIncludeFeaturedProduct() {
        return includeFeaturedProduct;
    }

    public void setIncludeFeaturedProduct(boolean includeFeaturedProduct) {
        this.includeFeaturedProduct = includeFeaturedProduct;
    }

    public boolean isIncludeLatestProduct() {
        return includeLatestProduct;
    }

    public void setIncludeLatestProduct(boolean includeLatestProduct) {
        this.includeLatestProduct = includeLatestProduct;
    }

    public boolean isAvailableForPurchase() {
        return availableForPurchase;
    }

    public void setAvailableForPurchase(boolean availableForPurchase) {
        this.availableForPurchase = availableForPurchase;
    }

    public String getListDate() {
        return listDate;
    }

    public void setListDate(String listDate) {
        this.listDate = listDate;
    }

    public boolean isUseStockLevel() {
        return useStockLevel;
    }

    public void setUseStockLevel(boolean useStockLevel) {
        this.useStockLevel = useStockLevel;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public int getStockWarning() {
        return stockWarning;
    }

    public void setStockWarning(int stockWarning) {
        this.stockWarning = stockWarning;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    public String getEanCode() {
        return eanCode;
    }

    public void setEanCode(String eanCode) {
        this.eanCode = eanCode;
    }

    public String getJanCode() {
        return janCode;
    }

    public void setJanCode(String janCode) {
        this.janCode = janCode;
    }

    public String getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
    }

    public String getGtinCode() {
        return gtinCode;
    }

    public void setGtinCode(String gtinCode) {
        this.gtinCode = gtinCode;
    }

    public String getMpnCode() {
        return mpnCode;
    }

    public void setMpnCode(String mpnCode) {
        this.mpnCode = mpnCode;
    }

    public String getGoogleCategory() {
        return googleCategory;
    }

    public void setGoogleCategory(String googleCategory) {
        this.googleCategory = googleCategory;
    }
}
