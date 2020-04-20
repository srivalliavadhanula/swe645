import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  showHomePage = true;
  showStudentSurveyForm = false;
  showStudentSurveyRecords = false;

  displayHomePage(){
    this.showHomePage = true;
    this.showStudentSurveyForm = false;
    this.showStudentSurveyRecords = false;
  }

  displayStudentSurveyForm(){
    this.showHomePage = false;
    this.showStudentSurveyForm = true;
    this.showStudentSurveyRecords = false;
  }

  displayStudentSurveyRecords(){
    this.showHomePage = false;
    this.showStudentSurveyForm = false;
    this.showStudentSurveyRecords = true;
  }

  displayPageOnEvent(pageName: String){
    console.log(pageName)
     if(pageName == 'surveyForm'){
      this.displayStudentSurveyForm();
     }else if(pageName == 'surveyFormList'){
      this.displayStudentSurveyRecords();
     }else{
       this.displayHomePage();
     }
  }

}


