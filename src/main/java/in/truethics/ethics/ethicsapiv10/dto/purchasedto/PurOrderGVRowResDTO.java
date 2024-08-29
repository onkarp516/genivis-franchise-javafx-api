package in.truethics.ethics.ethicsapiv10.dto.purchasedto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class PurOrderGVRowResDTO {
    @SerializedName("sgst")
    @Expose
    private Double sgst;
    @SerializedName("level_c_id")
    @Expose
    private String levelCId;
    @SerializedName("costing")
    @Expose
    private Double costing;
    @SerializedName("gst")
    @Expose
    private Double gst;
    @SerializedName("dis_amt")
    @Expose
    private Double disAmt;
    @SerializedName("total_cgst")
    @Expose
    private Double totalCgst;
    @SerializedName("invoice_dis_amt")
    @Expose
    private Double invoiceDisAmt;
    @SerializedName("mrp")
    @Expose
    private Double mrp;
    @SerializedName("is_batch")
    @Expose
    private Boolean isBatch;
    @SerializedName("product_id")
    @Expose
    private Long productId;
    @SerializedName("row_dis_amt")
    @Expose
    private Double rowDisAmt;
    @SerializedName("grossAmt1")
    @Expose
    private Double grossAmt1;
    @SerializedName("pack_name")
    @Expose
    private String packName;
    @SerializedName("min_discount")
    @Expose
    private Double minDiscount;
    @SerializedName("total_sgst")
    @Expose
    private Double totalSgst;
    @SerializedName("dis_amt_cal")
    @Expose
    private Double disAmtCal;
    @SerializedName("product_name")
    @Expose
    private String productName;
    @SerializedName("gross_amt")
    @Expose
    private Double grossAmt;
    @SerializedName("min_margin")
    @Expose
    private Double minMargin;
    @SerializedName("serialNo")
    @Expose
    private List<Object> serialNo = new ArrayList<Object>();
    @SerializedName("unit_name")
    @Expose
    private String unitName;
    @SerializedName("free_qty")
    @Expose
    private Double freeQty;
    @SerializedName("base_amt")
    @Expose
    private Double baseAmt;
    @SerializedName("dis_per_cal")
    @Expose
    private Integer disPerCal;
    @SerializedName("qty")
    @Expose
    private Integer qty;
    @SerializedName("b_rate")
    @Expose
    private Double bRate;
    @SerializedName("level_b_id")
    @Expose
    private String levelBId;
    @SerializedName("purchase_rate")
    @Expose
    private Double purchaseRate;
    @SerializedName("manufacturing_date")
    @Expose
    private String manufacturingDate;
    @SerializedName("product_code")
    @Expose
    private String productCode;
    @SerializedName("min_rate_c")
    @Expose
    private Double minRateC;
    @SerializedName("min_rate_b")
    @Expose
    private Double minRateB;
    @SerializedName("igst")
    @Expose
    private Double igst;
    @SerializedName("final_amt")
    @Expose
    private Double finalAmt;
    @SerializedName("total_amt")
    @Expose
    private Double totalAmt;
    @SerializedName("b_detailsId")
    @Expose
    private Long bDetailsId;
    @SerializedName("min_rate_a")
    @Expose
    private Double minRateA;
    @SerializedName("rate")
    @Expose
    private Double rate;
    @SerializedName("dis_per2")
    @Expose
    private Double disPer2;
    @SerializedName("unitId")
    @Expose
    private Long unitId;
    @SerializedName("max_discount")
    @Expose
    private Double maxDiscount;
    @SerializedName("level_a_id")
    @Expose
    private String levelAId;
    @SerializedName("unit_conv")
    @Expose
    private Integer unitConv;
    @SerializedName("sales_rate")
    @Expose
    private Double salesRate;
    @SerializedName("batch_no")
    @Expose
    private String batchNo;
    @SerializedName("cgst")
    @Expose
    private Double cgst;
    @SerializedName("details_id")
    @Expose
    private Double detailsId;
    @SerializedName("dis_per")
    @Expose
    private Double disPer;
    @SerializedName("costingWithTax")
    @Expose
    private Double costingWithTax;
    @SerializedName("is_expired")
    @Expose
    private Boolean isExpired;
    @SerializedName("total_igst")
    @Expose
    private Double totalIgst;
    @SerializedName("add_chg_amt")
    @Expose
    private Double addChgAmt;
    @SerializedName("b_expiry")
    @Expose
    private String bExpiry;

    public Double getSgst() {
        return sgst;
    }

    public void setSgst(Double sgst) {
        this.sgst = sgst;
    }

    public String getLevelCId() {
        return levelCId;
    }

    public void setLevelCId(String levelCId) {
        this.levelCId = levelCId;
    }

    public Double getCosting() {
        return costing;
    }

    public void setCosting(Double costing) {
        this.costing = costing;
    }

    public Double getGst() {
        return gst;
    }

    public void setGst(Double gst) {
        this.gst = gst;
    }

    public Double getDisAmt() {
        return disAmt;
    }

    public void setDisAmt(Double disAmt) {
        this.disAmt = disAmt;
    }

    public Double getTotalCgst() {
        return totalCgst;
    }

    public void setTotalCgst(Double totalCgst) {
        this.totalCgst = totalCgst;
    }

    public Double getInvoiceDisAmt() {
        return invoiceDisAmt;
    }

    public void setInvoiceDisAmt(Double invoiceDisAmt) {
        this.invoiceDisAmt = invoiceDisAmt;
    }

    public Boolean getBatch() {
        return isBatch;
    }

    public void setBatch(Boolean batch) {
        isBatch = batch;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Double getRowDisAmt() {
        return rowDisAmt;
    }

    public void setRowDisAmt(Double rowDisAmt) {
        this.rowDisAmt = rowDisAmt;
    }

    public Double getGrossAmt1() {
        return grossAmt1;
    }

    public void setGrossAmt1(Double grossAmt1) {
        this.grossAmt1 = grossAmt1;
    }

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName;
    }

    public Double getMinDiscount() {
        return minDiscount;
    }

    public void setMinDiscount(Double minDiscount) {
        this.minDiscount = minDiscount;
    }

    public Double getTotalSgst() {
        return totalSgst;
    }

    public void setTotalSgst(Double totalSgst) {
        this.totalSgst = totalSgst;
    }

    public Double getDisAmtCal() {
        return disAmtCal;
    }

    public void setDisAmtCal(Double disAmtCal) {
        this.disAmtCal = disAmtCal;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getGrossAmt() {
        return grossAmt;
    }

    public void setGrossAmt(Double grossAmt) {
        this.grossAmt = grossAmt;
    }

    public Double getMinMargin() {
        return minMargin;
    }

    public void setMinMargin(Double minMargin) {
        this.minMargin = minMargin;
    }

    public List<Object> getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(List<Object> serialNo) {
        this.serialNo = serialNo;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Double getFreeQty() {
        return freeQty;
    }

    public void setFreeQty(Double freeQty) {
        this.freeQty = freeQty;
    }

    public Double getBaseAmt() {
        return baseAmt;
    }

    public void setBaseAmt(Double baseAmt) {
        this.baseAmt = baseAmt;
    }

    public Integer getDisPerCal() {
        return disPerCal;
    }

    public void setDisPerCal(Integer disPerCal) {
        this.disPerCal = disPerCal;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getbRate() {
        return bRate;
    }

    public void setbRate(Double bRate) {
        this.bRate = bRate;
    }

    public String getLevelBId() {
        return levelBId;
    }

    public void setLevelBId(String levelBId) {
        this.levelBId = levelBId;
    }

    public Double getPurchaseRate() {
        return purchaseRate;
    }

    public void setPurchaseRate(Double purchaseRate) {
        this.purchaseRate = purchaseRate;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Double getMinRateC() {
        return minRateC;
    }

    public void setMinRateC(Double minRateC) {
        this.minRateC = minRateC;
    }

    public Double getMinRateB() {
        return minRateB;
    }

    public void setMinRateB(Double minRateB) {
        this.minRateB = minRateB;
    }

    public Double getIgst() {
        return igst;
    }

    public void setIgst(Double igst) {
        this.igst = igst;
    }

    public Double getFinalAmt() {
        return finalAmt;
    }

    public void setFinalAmt(Double finalAmt) {
        this.finalAmt = finalAmt;
    }

    public Double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(Double totalAmt) {
        this.totalAmt = totalAmt;
    }

    public Long getbDetailsId() {
        return bDetailsId;
    }

    public void setbDetailsId(Long bDetailsId) {
        this.bDetailsId = bDetailsId;
    }

    public Double getMinRateA() {
        return minRateA;
    }

    public void setMinRateA(Double minRateA) {
        this.minRateA = minRateA;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getDisPer2() {
        return disPer2;
    }

    public void setDisPer2(Double disPer2) {
        this.disPer2 = disPer2;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public Double getMaxDiscount() {
        return maxDiscount;
    }

    public void setMaxDiscount(Double maxDiscount) {
        this.maxDiscount = maxDiscount;
    }

    public String getLevelAId() {
        return levelAId;
    }

    public void setLevelAId(String levelAId) {
        this.levelAId = levelAId;
    }

    public Integer getUnitConv() {
        return unitConv;
    }

    public void setUnitConv(Integer unitConv) {
        this.unitConv = unitConv;
    }

    public Double getSalesRate() {
        return salesRate;
    }

    public void setSalesRate(Double salesRate) {
        this.salesRate = salesRate;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Double getCgst() {
        return cgst;
    }

    public void setCgst(Double cgst) {
        this.cgst = cgst;
    }

    public Double getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Double detailsId) {
        this.detailsId = detailsId;
    }

    public Double getDisPer() {
        return disPer;
    }

    public void setDisPer(Double disPer) {
        this.disPer = disPer;
    }

    public Double getCostingWithTax() {
        return costingWithTax;
    }

    public void setCostingWithTax(Double costingWithTax) {
        this.costingWithTax = costingWithTax;
    }

    public Boolean getExpired() {
        return isExpired;
    }

    public void setExpired(Boolean expired) {
        isExpired = expired;
    }

    public Double getTotalIgst() {
        return totalIgst;
    }

    public void setTotalIgst(Double totalIgst) {
        this.totalIgst = totalIgst;
    }

    public Double getAddChgAmt() {
        return addChgAmt;
    }

    public void setAddChgAmt(Double addChgAmt) {
        this.addChgAmt = addChgAmt;
    }

    public String getbExpiry() {
        return bExpiry;
    }

    public void setbExpiry(String bExpiry) {
        this.bExpiry = bExpiry;
    }

    public Double getMrp() {
        return mrp;
    }

    public void setMrp(Double mrp) {
        this.mrp = mrp;
    }

    @Override
    public String toString() {
        return "PurOrderGVRowResDTO{" +
                "sgst=" + sgst +
                ", levelCId='" + levelCId + '\'' +
                ", costing=" + costing +
                ", gst=" + gst +
                ", disAmt=" + disAmt +
                ", totalCgst=" + totalCgst +
                ", invoiceDisAmt=" + invoiceDisAmt +
                ", mrp=" + mrp +
                ", isBatch=" + isBatch +
                ", productId=" + productId +
                ", rowDisAmt=" + rowDisAmt +
                ", grossAmt1=" + grossAmt1 +
                ", packName='" + packName + '\'' +
                ", minDiscount=" + minDiscount +
                ", totalSgst=" + totalSgst +
                ", disAmtCal=" + disAmtCal +
                ", productName='" + productName + '\'' +
                ", grossAmt=" + grossAmt +
                ", minMargin=" + minMargin +
                ", serialNo=" + serialNo +
                ", unitName='" + unitName + '\'' +
                ", freeQty=" + freeQty +
                ", baseAmt=" + baseAmt +
                ", disPerCal=" + disPerCal +
                ", qty=" + qty +
                ", bRate=" + bRate +
                ", levelBId='" + levelBId + '\'' +
                ", purchaseRate=" + purchaseRate +
                ", manufacturingDate='" + manufacturingDate + '\'' +
                ", productCode='" + productCode + '\'' +
                ", minRateC=" + minRateC +
                ", minRateB=" + minRateB +
                ", igst=" + igst +
                ", finalAmt=" + finalAmt +
                ", totalAmt=" + totalAmt +
                ", bDetailsId=" + bDetailsId +
                ", minRateA=" + minRateA +
                ", rate=" + rate +
                ", disPer2=" + disPer2 +
                ", unitId=" + unitId +
                ", maxDiscount=" + maxDiscount +
                ", levelAId='" + levelAId + '\'' +
                ", unitConv=" + unitConv +
                ", salesRate=" + salesRate +
                ", batchNo='" + batchNo + '\'' +
                ", cgst=" + cgst +
                ", detailsId=" + detailsId +
                ", disPer=" + disPer +
                ", costingWithTax=" + costingWithTax +
                ", isExpired=" + isExpired +
                ", totalIgst=" + totalIgst +
                ", addChgAmt=" + addChgAmt +
                ", bExpiry='" + bExpiry + '\'' +
                '}';
    }
}

