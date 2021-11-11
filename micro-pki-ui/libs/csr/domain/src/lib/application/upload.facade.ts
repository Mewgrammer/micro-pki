import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { Csr } from '../entities/csr';
import { CsrDataService } from '../infrastructure/csr.data.service';
import type { CsrUpload } from '../entities/csr-upload';


@Injectable({ providedIn: 'root' })
export class UploadFacade {

    constructor(private csrDataService: CsrDataService) {
    }

    push(csr: CsrUpload): Observable<Csr> {
      return this.csrDataService.push(csr);
    }
}
