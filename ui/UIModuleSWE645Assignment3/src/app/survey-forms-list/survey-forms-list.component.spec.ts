import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SurveyFormsListComponent } from './survey-forms-list.component';

describe('SurveyFormsListComponent', () => {
  let component: SurveyFormsListComponent;
  let fixture: ComponentFixture<SurveyFormsListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SurveyFormsListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SurveyFormsListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
