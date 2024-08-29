package in.truethics.ethics.ethicsapiv10.model.tranx.sales;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tranx_sales_comp_prescription_details_tbl")
public class TranxSalesCompPrescriptionDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "branch_id")
    private Long branchId;
    @Column(name = "outlet_id")
    private Long outletId;
    @Column(name = "sales_invoice_id")
    private Long salesInvoiceId;
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "packing_master_id")
    private Long packingMasterId;
    @Column(name = "unit_id")
    private Long unitId;
    @Column(name = "qty")
    private Double qty;
    @Column(name = "no_of_time")
    private Double noOfTime;
    @Column(name = "no_of_days")
    private Double noOfDays;
    @Column(name = "total_qty")
    private Double totalQty;
    private Boolean status;
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "created_by")
    private Long createdBy;
    @UpdateTimestamp
    @Column(name = "updated_at",insertable = false)
    private LocalDateTime updatedAt;
    @Column(name = "updated_by")
    private Long updatedBy;
}
