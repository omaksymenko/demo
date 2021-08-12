import { Component, OnInit } from '@angular/core';
import {CustomerService} from "../../services/CustomerService";

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit {
  customers: any;
  constructor(private customerService: CustomerService) {
  }

  ngOnInit(): void {
    this.getCustomers();
  }

  getCustomers() : void {
    this.customerService.getCustomers()
      .subscribe(data => {
        this.customers = data;
        },
        error => console.error('error', error));
  }

  deleteCustomer(id: any): void {
    this.customerService.deleteCustomer(id)
      .subscribe(() => this.getCustomers());
  }
}
