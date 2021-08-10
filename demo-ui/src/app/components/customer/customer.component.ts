import { Component, OnInit } from '@angular/core';
import {CustomerService} from "../../services/CustomerService";
import {ActivatedRoute} from "@angular/router";
import * as _ from 'lodash';


@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  id: undefined;
  firstName: undefined;
  middleName: undefined;
  lastName: undefined;
  constructor(private customerService: CustomerService,
              private route: ActivatedRoute) { }

  ngOnInit(): void {
    console.log('this.route.snapshot.params', this.route.snapshot.params);
    if(!_.isEmpty(this.route.snapshot.params)) {
      this.getCustomerById(this.route.snapshot.params.id);
    }
  }

  getCustomerById(id: any): void {
    this.customerService.getCustomerById(id)
      .subscribe(data => {
        console.log('data', data);
        this.id = data.id;
        this.firstName = data.firstName;
        this.middleName = data.middleName;
        this.lastName = data.lastName;
      }, error => {
        console.error('error', error);
      });
  }

}
