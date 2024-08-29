ALTER TABLE sales_payment_type_tbl
ADD COLUMN counter_sale_id BIGINT NULL;


ALTER TABLE tranx_counter_sales_tbl
ADD COLUMN balance DOUBLE NULL;