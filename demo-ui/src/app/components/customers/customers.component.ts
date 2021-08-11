import { Component, OnInit } from '@angular/core';
import {CustomersService} from "../../services/CustomersService";

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit {
  customers: any;
  constructor(private customersService: CustomersService) {
  }

  ngOnInit(): void {
    this.getCustomers();
  }

  getCustomers() : void {
    this.customersService.getCustomers()
      .subscribe(data => {
        this.customers = data;
        },
        error => console.error('error', error));
  }

}
