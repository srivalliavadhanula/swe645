import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';

import { AppComponent } from './app.component';
import { HomePageComponent } from './home-page/home-page.component';
import { SurveyFormsListComponent } from './survey-forms-list/survey-forms-list.component';
import { HttpClientModule }    from '@angular/common/http';
import { SubmitSurveyComponent } from './submit-survey/submit-survey.component';

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    SurveyFormsListComponent,
    SubmitSurveyComponent
  ],
  imports: [
    BrowserModule, 
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
