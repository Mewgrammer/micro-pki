import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CsrDomainModule } from '@micro-pki-ui/csr/domain';
import { ManageComponent } from './manage.component';

@NgModule({
  imports: [CommonModule, CsrDomainModule],
  declarations: [
    ManageComponent
  ],
  exports: [
    ManageComponent
  ],
})
export class CsrFeatureManageModule {}
