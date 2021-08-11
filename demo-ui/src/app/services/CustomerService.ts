import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

const baseUrl = 'http://localhost:8080/api';

@Injectable({providedIn: 'root'})
export class CustomerService {
  constructor(private httpClient: HttpClient) {
  }

  getCustomerById(id: any): Observable<any> {
    return this.httpClient.get(`${baseUrl}/customers/${id}`);
  }

  editCustomer(customer: any): Observable<any> {
    return this.httpClient.put(`${baseUrl}/customer`, customer);
  }
}
