import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CancelTicketsComponent } from './cancel-tickets.component';

describe('CancelTicketsComponent', () => {
  let component: CancelTicketsComponent;
  let fixture: ComponentFixture<CancelTicketsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CancelTicketsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CancelTicketsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
