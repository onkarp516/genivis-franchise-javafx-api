package in.truethics.ethics.ethicsapiv10.controller.tranx.purchase;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import in.truethics.ethics.ethicsapiv10.service.tranx_service.purchase.TranxPurOrderService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class TranxPurOrderController {
    @Autowired
    private TranxPurOrderService tranxPurOrderService;

    /* creating purchase order */
    @PostMapping(path = "/create_po_invoices")
    public ResponseEntity<?> createPOInvoice(HttpServletRequest request) {
        return ResponseEntity.ok(tranxPurOrderService.insertPOInvoice(request));
    }

    @PostMapping(path = "/po_to_so_invoices")
    public ResponseEntity<?> createPotoSoInvoice(HttpServletRequest request) {
        return ResponseEntity.ok(tranxPurOrderService.insertPoToSoInvoice(request));
    }

    @PostMapping(path = "/validate_purchase_order")
    public ResponseEntity<?> validatePurchaseOrder(HttpServletRequest request) throws Exception {
        return ResponseEntity.ok(tranxPurOrderService.validatePurchaseOrder(request));
    }

    /***** Validate duplicate Purchase  Invoices  while update *****/
    @PostMapping(path = "/validate_purchase_order_update")
    public ResponseEntity<?> validateOrderNoUpdateNo(HttpServletRequest request) throws Exception {
        return ResponseEntity.ok(tranxPurOrderService.validateOrderNoUpdateNo(request));
    }

    /*edit purchase order */
    @PostMapping(path = "/edit_pur_order")
    public ResponseEntity<?> editPOInvoice(HttpServletRequest request) {
        return ResponseEntity.ok(tranxPurOrderService.editPOInvoice(request));
    }

    /* List of Purchase orders :outlet wise */
//    @PostMapping(path = "/list_po_invoice")
//    public Object poInvoiceList(HttpServletRequest request) {
//        JsonObject result = tranxPurOrderService.poInvoiceList(request);
//        return result.toString();
//    }
    @PostMapping(path = "/list_po_invoice")
    public Object poInvoiceList(@RequestBody Map<String, String> request, HttpServletRequest req) {

        return tranxPurOrderService.poInvoiceList(request, req);
    }

    /* Count po invoices */
    @GetMapping(path = "/get_last_po_invoice_record")
    public Object purchaseLastRecord(HttpServletRequest request) {
        JsonObject result = tranxPurOrderService.poLastRecord(request);
        return result.toString();
    }

    /***** Delete Purchase Order ****/

    @PostMapping(path = "/delete_purchase_order")
    public Object purchaseOrderDelete(HttpServletRequest request) {
        JsonObject object = tranxPurOrderService.purchaseOrderDelete(request);
        return object.toString();
    }

    /***** get pending orders against sundry creditors ****/
    @PostMapping(path = "/po_pending_order")
    public Object poPendingOrder(HttpServletRequest request) {
        JsonObject result = tranxPurOrderService.poPendingOrder(request);
        return result.toString();
    }

    /***** get product details against multiple pending orders ****/
    @PostMapping(path = "/po_pending_product_order")
    public Object poPendingProductOrder(HttpServletRequest request) {
        JsonObject result = tranxPurOrderService.poPendingProductOrder(request);
        return result.toString();
    }

    /* Conversion to Purchase Order to challan or invoice */
    @PostMapping(path = "/get_po_invoices_with_ids")
    public Object getPOInvoiceWithIds(HttpServletRequest request) {
        JsonObject result = tranxPurOrderService.getPOInvoiceWithIds(request);
        return result.toString();
    }

    @GetMapping(path = "/get_po")
    public ResponseEntity<?> getAllPo() {
        return ResponseEntity.ok(tranxPurOrderService.getAllPo());
    }

    /* get Purchase order by id for Edit */
    @PostMapping(path = "/get_purchase_order_by_id")
    public Object getPurchaseOrderById(HttpServletRequest request) {
        JsonObject result = tranxPurOrderService.getPurchaseOrderById(request);
        return result.toString();
    }

    /*** getProduct By Id for Edit Transactions : new Architecture (multi brand,category,flavour,package,and units)****/
    @PostMapping(path = "/get_purchase_order_by_id_new")
    public Object getPurchaseOrderByIdNew(HttpServletRequest request) {
        JsonObject result = tranxPurOrderService.getPurchaseOrderByIdNew(request);
        return result.toString();
    }

    /* validating for same sundry creditors while converting order into challan or invoices,throw exception if
       two different creditors selected for convertions  */
    @PostMapping(path = "/get_po_invoice_ids")
    public Object getPOInvoiceIds(HttpServletRequest request) {
        JsonObject result = tranxPurOrderService.getPOInvoiceIds(request);
        return result.toString();
    }

    @PostMapping(path = "/get_pur_order_product_fpu_by_id")
    public Object getProductEditByIdByFPU(HttpServletRequest request) {
        JsonObject result = tranxPurOrderService.getProductEditByIdByFPU(request);
        return result.toString();
    }

    /****** if multiple order ids are aavailable for conversions *******/
    @PostMapping(path = "/get_pur_order_product_fpu_by_ids")
    public Object getProductEditByIdsByFPU(HttpServletRequest request) {
        JsonObject result = tranxPurOrderService.getProductEditByIdsByFPU(request);
        return result.toString();
    }

    @PostMapping(path = "/get_order_supplierlist_by_productid")
    public Object getOrderSupplierListByProductId(HttpServletRequest request) {
        return tranxPurOrderService.getOrderSupplierListByProductId(request).toString();
    }

    @PostMapping(path = "/purchase_print_order")
    public Object purchasePrintOrder(HttpServletRequest request) {
        JsonObject result = tranxPurOrderService.purchasePrintOrder(request);
        return result.toString();
    }


    @PostMapping(path = "/mobile/v1/create_po_invoices")
    public ResponseEntity<?> MobileV1createPOInvoice(HttpServletRequest request) {
        return ResponseEntity.ok(tranxPurOrderService.insertPOInvoice(request));
    }

    @PostMapping(path = "/mobile/v1/fr-po-list")
    public Object FrPoInvoiceList(@RequestBody String req, HttpServletRequest request) {
//        @RequestBody Map<String, String> request,
        return tranxPurOrderService.FrPoInvoiceList(req, request);
    }

    @GetMapping(path = "/mobile/v1/fr-get-po-ledger-details")
    public String FrPurchaseOrderLedgerDetails(HttpServletRequest request) {
        JSONObject result = tranxPurOrderService.FrPoLedgerDetails(request);
        return result.toString();
    }

    @PostMapping(path = "/mobile/v1/fr-create-po-invoices")
    public ResponseEntity<?> FrCreatePOInvoice(HttpServletRequest request) {
        return ResponseEntity.ok(tranxPurOrderService.insertPOInvoice(request));
    }

    @GetMapping(path = "/get_all_pur_orders")
    public Object getAllSalesOrders(HttpServletRequest request) throws Exception {
        JsonObject output = new JsonObject();
        JsonArray result = tranxPurOrderService.getAllPurchaseOrders(request);
        if (result.size() > 0) {
            output.addProperty("message", "success");
            output.addProperty("responseStatus", HttpStatus.OK.value());
            output.add("data", result);
        } else {
            output.addProperty("message", "No data found");
            output.addProperty("responseStatus", "" + HttpStatus.NOT_FOUND);
        }

        return output.toString();
    }

    @PostMapping(path = "/update_pur_order")
    public void update_pur_order(HttpServletRequest request) {
        tranxPurOrderService.updatePurOrder(request);
    }

}
