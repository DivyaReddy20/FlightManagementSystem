import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ScheduleflightsComponent } from './scheduleflights.component';

describe('ScheduleflightsComponent', () => {
  let component: ScheduleflightsComponent;
  let fixture: ComponentFixture<ScheduleflightsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ScheduleflightsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ScheduleflightsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
