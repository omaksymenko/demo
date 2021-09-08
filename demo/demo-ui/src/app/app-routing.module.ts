import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CustomersComponent} from "./components/customers/customers.component";
import {CustomerComponent} from "./components/customer/customer.component";
import {ParentComponent} from "./parent/parent.component";
import {ChildComponent} from "./child/child.component";

const routes: Routes = [
{path: '', redirectTo: 'customers', pathMatch: 'full'},
  {path: 'customers', component: CustomersComponent},
  {path: 'customer' , component:CustomerComponent},
  {path: 'customer/:id', component: CustomerComponent},
  {path: 'parent', component: ParentComponent},
  {path: 'child', component: ChildComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
