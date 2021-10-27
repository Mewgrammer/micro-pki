import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CertificateDomainModule } from '@micro-pki-ui/certificate/domain';
import { ManageComponent } from './manage.component';

@NgModule({
  imports: [CommonModule, CertificateDomainModule],
  declarations: [
    ManageComponent
  ],
  exports: [
    ManageComponent
  ],
})
export class CertificateFeatureManageModule {}
