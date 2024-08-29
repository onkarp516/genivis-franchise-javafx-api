SET FOREIGN_KEY_CHECKS=0;

CREATE TABLE tranx_sales_comp_prescription_details_tbl (
  id BIGINT AUTO_INCREMENT NOT NULL,
   branch_id BIGINT NULL,
   outlet_id BIGINT NULL,
   sales_invoice_id BIGINT NULL,
   product_id BIGINT NULL,
   packing_master_id BIGINT NULL,
   unit_id BIGINT NULL,
   qty DOUBLE NULL,
   no_of_time DOUBLE NULL,
   no_of_days DOUBLE NULL,
   total_qty DOUBLE NULL,
   status BIT(1) NULL,
   created_at datetime NULL,
   created_by BIGINT NULL,
   updated_at datetime NULL,
   updated_by BIGINT NULL,
   CONSTRAINT pk_tranx_sales_comp_prescription_details_tbl PRIMARY KEY (id)
);
SET FOREIGN_KEY_CHECKS=1;