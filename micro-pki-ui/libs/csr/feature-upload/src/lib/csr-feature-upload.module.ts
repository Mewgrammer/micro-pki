import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CsrDomainModule } from '@micro-pki-ui/csr/domain';
import { UploadComponent } from './upload.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { FlexModule } from '@angular/flex-layout';

@NgModule({
  imports: [CommonModule, CsrDomainModule, ReactiveFormsModule, MatFormFieldModule, MatInputModule, MatButtonModule, FlexModule],
  declarations: [
    UploadComponent
  ],
  exports: [
    UploadComponent
  ],
})
export class CsrFeatureUploadModule {}
