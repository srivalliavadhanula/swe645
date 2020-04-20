import { Component, OnInit, Output ,EventEmitter} from '@angular/core';

import {DataServiceService} from '../data-service.service';


@Component({
  selector: 'app-survey-forms-list',
  templateUrl: './survey-forms-list.component.html',
  styleUrls: ['./survey-forms-list.component.css']
})
export class SurveyFormsListComponent implements OnInit {

  constructor(private dataService: DataServiceService) { }

  @Output() displayPageName = new EventEmitter<String>();

  ngOnInit(): void {
    window.scrollTo(0, 0);
    this.getRecords();
  }

  recordList: any;


  getRecords():void{
    this.dataService.getSurveyRecords().subscribe((records) => {console.log(this.recordList = records)});
  }

  backToHomePage(){
    this.displayPageName.emit("homePage");
  }

}
