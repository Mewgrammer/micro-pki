import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { CsrFeatureUploadModule } from '@micro-pki-ui/csr/feature-upload';
import { HttpClientModule } from '@angular/common/http';
import { CsrFeatureListModule } from '@micro-pki-ui/csr/feature-list';
import { CsrFeatureManageModule } from '@micro-pki-ui/csr/feature-manage';
import { CertificateFeatureListModule } from '@micro-pki-ui/certificate/feature-list';
import { CertificateFeatureSearchModule } from '@micro-pki-ui/certificate/feature-search';
import { CertificateFeatureManageModule } from '@micro-pki-ui/certificate/feature-manage';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FlexLayoutModule } from '@angular/flex-layout';
import { MatSidenavModule } from '@angular/material/sidenav';

@NgModule({
  declarations: [AppComponent],
  imports: [
    MatSidenavModule,
    FlexLayoutModule,
    BrowserModule,
    CsrFeatureUploadModule,
    HttpClientModule,
    CsrFeatureListModule,
    CsrFeatureManageModule,
    CertificateFeatureListModule,
    CertificateFeatureSearchModule,
    CertificateFeatureManageModule,
    BrowserAnimationsModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
