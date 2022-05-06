import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RgbColorComponent } from './rgb-color.component';

describe('RgbColorComponent', () => {
  let component: RgbColorComponent;
  let fixture: ComponentFixture<RgbColorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RgbColorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RgbColorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
