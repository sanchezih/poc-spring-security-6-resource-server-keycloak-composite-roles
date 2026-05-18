package com.github.sanchezih.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/customers/read")
    @PreAuthorize("hasRole('customer_read')")
    public String readCustomers() {
        return "Customer API - READ access granted";
    }

    @GetMapping("/customers/write")
    @PreAuthorize("hasRole('customer_write')")
    public String writeCustomers() {
        return "Customer API - WRITE access granted";
    }

    @GetMapping("/customers/delete")
    @PreAuthorize("hasRole('customer_delete')")
    public String deleteCustomers() {
        return "Customer API - DELETE access granted";
    }

    @GetMapping("/customers/manager")
    @PreAuthorize("hasRole('customer_manager')")
    public String managerCustomers() {
        return "Customer API - MANAGER access granted";
    }

    @GetMapping("/customers/admin")
    @PreAuthorize("hasRole('customer_admin')")
    public String adminCustomers() {
        return "Customer API - ADMIN access granted";
    }

    @GetMapping("/customers/super")
    @PreAuthorize("hasRole('super_admin')")
    public String superCustomers() {
        return "Customer API - SUPER ADMIN access granted";
    }
}