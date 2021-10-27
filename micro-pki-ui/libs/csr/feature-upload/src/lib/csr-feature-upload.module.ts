import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CsrDomainModule } from '@micro-pki-ui/csr/domain';
import { UploadComponent } from './upload.component';

@NgModule({
  imports: [CommonModule, CsrDomainModule],
  declarations: [
    UploadComponent
  ],
  exports: [
    UploadComponent
  ],
})
export class CsrFeatureUploadModule {}
