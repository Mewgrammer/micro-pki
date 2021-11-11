import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CsrPageComponent } from './csr-page.component';

describe('CsrComponent', () => {
  let component: CsrPageComponent;
  let fixture: ComponentFixture<CsrPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CsrPageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CsrPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
