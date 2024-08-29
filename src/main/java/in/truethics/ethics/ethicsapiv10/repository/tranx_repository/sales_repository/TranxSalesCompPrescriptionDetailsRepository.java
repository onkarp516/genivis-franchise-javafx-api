package in.truethics.ethics.ethicsapiv10.repository.tranx_repository.sales_repository;


import in.truethics.ethics.ethicsapiv10.model.tranx.sales.TranxSalesCompPrescriptionDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TranxSalesCompPrescriptionDetailsRepository extends JpaRepository<TranxSalesCompPrescriptionDetails, Long> {
    List<TranxSalesCompPrescriptionDetails> findBySalesInvoiceIdAndStatus(Long id, boolean b);

    TranxSalesCompPrescriptionDetails findByIdAndStatus(long detailsId, boolean b);
}

