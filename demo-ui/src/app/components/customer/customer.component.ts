import {Component, OnInit} from '@angular/core';
import {CustomerService} from "../../services/CustomerService";
import {ActivatedRoute} from "@angular/router";
import * as _ from "lodash";


@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  customer = {
    id: undefined,
    firstName: undefined,
    middleName: undefined,
    lastName: undefined
  };

  constructor(private customerService: CustomerService,
              private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.getCustomerById(this.route.snapshot.params.id);
  }

  getCustomerById(id: any): void {
    if(!_.isEmpty(id)) {
      this.customerService.getCustomerById(id)
        .subscribe(data => {
          this.customer = data;
        }, error => {
          console.error('error', error);
        });
    }
  }

  editCustomer(): void {
    this.customerService.editCustomer(this.customer)
      .subscribe(data => {
        this.customer = data;
      });
  }

}
