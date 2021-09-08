import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
  @Output() increaseValueEvent = new EventEmitter();
  value: number;
  @Input() name: string;

  constructor() {
    this.name = '';
    this.value = 0;
  }

  ngOnInit(): void {
  }

  increaseValue() {
    this.value += 1;
    this.increaseValueEvent.emit(this.value);
    console.log('emmitted ' + this.value);
  }

}
