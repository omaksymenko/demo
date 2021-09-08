import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  childName = "nanan";

  constructor() { }

  ngOnInit(): void {
  }

  callChild(number: any): void {
    console.log('child value ', number);
  }

}
