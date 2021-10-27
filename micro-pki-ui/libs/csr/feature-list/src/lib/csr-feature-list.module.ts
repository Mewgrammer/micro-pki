import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CsrDomainModule } from '@micro-pki-ui/csr/domain';
import { ListComponent } from './list.component';

@NgModule({
  imports: [CommonModule, CsrDomainModule],
  declarations: [
    ListComponent
  ],
  exports: [
    ListComponent
  ],
})
export class CsrFeatureListModule {}
