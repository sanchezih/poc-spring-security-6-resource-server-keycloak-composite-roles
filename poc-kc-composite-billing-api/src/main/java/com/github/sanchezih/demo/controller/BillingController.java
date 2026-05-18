package com.github.sanchezih.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingController {

    @GetMapping("/invoices/read")
    @PreAuthorize("hasRole('invoice_read')")
    public String readInvoices() {
        return "Billing API - READ access granted";
    }

    @GetMapping("/invoices/write")
    @PreAuthorize("hasRole('invoice_write')")
    public String writeInvoices() {
        return "Billing API - WRITE access granted";
    }

    @GetMapping("/invoices/approve")
    @PreAuthorize("hasRole('invoice_approve')")
    public String approveInvoices() {
        return "Billing API - APPROVE access granted";
    }

    @GetMapping("/invoices/operator")
    @PreAuthorize("hasRole('billing_operator')")
    public String operatorBilling() {
        return "Billing API - OPERATOR access granted";
    }

    @GetMapping("/invoices/admin")
    @PreAuthorize("hasRole('billing_admin')")
    public String adminBilling() {
        return "Billing API - ADMIN access granted";
    }

    @GetMapping("/invoices/super")
    @PreAuthorize("hasRole('super_admin')")
    public String superBilling() {
        return "Billing API - SUPER ADMIN access granted";
    }
}