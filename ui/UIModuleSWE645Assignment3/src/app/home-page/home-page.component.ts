import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    window.scrollTo(0, 0);
  }


  @Output() displayPageName = new EventEmitter<String>();

  displayPage(pageName: String){
    console.log(pageName);
     this.displayPageName.emit(pageName);
  }

}
