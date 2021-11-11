import { Component, OnInit } from '@angular/core';
import { Csr, UploadFacade } from '@micro-pki-ui/csr/domain';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import type { CsrUpload } from '../../../domain/src/lib/entities/csr-upload';
import { base64regex } from '../../../domain/src/lib/util/encoding.utils';

@Component({
  selector: 'csr-upload',
  templateUrl: './upload.component.html',
  styleUrls: ['./upload.component.scss']
})
export class UploadComponent implements OnInit {

  readonly uploadForm = new FormGroup({
    comment: new FormControl(''),
    csr: new FormControl('', [Validators.required, Validators.pattern(base64regex)]),
  });

  constructor(private uploadFacade: UploadFacade) {
  }

  ngOnInit() {
  }

  public uploadCsr(): void {
    const csr: CsrUpload = {
      comment: this.uploadForm.get('comment')?.value,
      csr: this.uploadForm.get('csr')?.value
    };
    this.uploadFacade.push(csr).subscribe((createdCsr) => {
      console.log('csr uploaded !', createdCsr);
    });
  }
}

