import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CertificateDomainModule } from '@micro-pki-ui/certificate/domain';
import { SearchComponent } from './search.component';

@NgModule({
  imports: [CommonModule, CertificateDomainModule],
  declarations: [
    SearchComponent
  ],
  exports: [
    SearchComponent
  ],
})
export class CertificateFeatureSearchModule {}
