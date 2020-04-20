import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import {DataServiceService} from '../data-service.service';

@Component({
  selector: 'app-submit-survey',
  templateUrl: './submit-survey.component.html',
  styleUrls: ['./submit-survey.component.css']
})
export class SubmitSurveyComponent implements OnInit {

  selectedArray: string[];

  constructor(private dataService: DataServiceService) { }

  submitData:any ={};

  ngOnInit(): void {
    window.scrollTo(0, 0);
  }

  @Output() displayPageName = new EventEmitter<String>();


  recommendationDropDown = ['Very Likely', 'Likely', 'Unlikely'];

  options = [
    {name:'Students', value:'1', checked:false},
    {name:'Location', value:'2', checked:false},
    {name:'Campus', value:'3', checked:false},
    {name:'Atmosphere', value:'4', checked:false},
    {name:'Dorm Rooms', value:'5', checked:false},
    {name:' Sports', value:'6', checked:false}

  ]

  radioOptions = [
    {name:'Friends', value:'1', selected:false},
    {name:'Television', value:'2', selected:false},
    {name:'Internet', value:'3', selected:false},
    {name:'Other', value:'4', selected:false}
  ]

  getSelectedOptions() { 
    this.selectedArray = this.options
              .filter(opt => opt.checked)
              .map(opt => opt.name)
    return this.selectedArray.toString();
  }

  getRadioButtonSelection() { 
    return this.radioOptions
    .filter(opt => opt.selected)
    .map(opt => opt.name)
  }

  displayPage(pageName: String){
    console.log(pageName);
     this.displayPageName.emit(pageName);
  }

  onSubmit(){
    this.submitData.mostLiked = this.getSelectedOptions();
    this.submitData.sourceOfInterest = this.getRadioButtonSelection().toString();
    this.dataService.addSurveyRecord(this.submitData).subscribe(
      (result) => {console.log(result)}
    );
  }

  onCancel(){
    this.displayPageName.emit("homePage");
  }

}
