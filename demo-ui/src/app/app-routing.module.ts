import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CustomersComponent} from "./components/customers/customers.component";
import {CustomerComponent} from "./components/customer/customer.component";

const routes: Routes = [
{path: '', redirectTo: 'customers', pathMatch: 'full'},
  {path: 'customers', component: CustomersComponent},
  {path: 'customer/:id', component: CustomerComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }