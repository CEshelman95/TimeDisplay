import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-display-time',
  templateUrl: './display-time.component.html',
  styleUrls: ['./display-time.component.css']
})
export class DisplayTimeComponent implements OnInit {

  constructor() { }

  time: 'Time Displayed';

  ngOnInit(): void {
  }

  displayTime() {
    
  }

}
