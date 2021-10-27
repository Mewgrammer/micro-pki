import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CertificateDomainModule } from '@micro-pki-ui/certificate/domain';
import { ListComponent } from './list.component';

@NgModule({
  imports: [CommonModule, CertificateDomainModule],
  declarations: [
    ListComponent
  ],
  exports: [
    ListComponent
  ],
})
export class CertificateFeatureListModule {}
