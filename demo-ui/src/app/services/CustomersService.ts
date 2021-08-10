import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Injectable} from "@angular/core";

@Injectable({
  providedIn: 'root',
})
export class CustomersService {
  constructor(private http: HttpClient) {
    console.log('uiui')
  }

  getCustomers(): Observable<any> {
    return this.http.get('http://localhost:8080/api/customers');
  }
}
