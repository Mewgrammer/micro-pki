import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

import { Certificate } from '../entities/certificate';
import { CertificateDataService } from '../infrastructure/certificate.data.service';


@Injectable({ providedIn: 'root' })
export class ManageFacade {

    private certificateListSubject = new BehaviorSubject<Certificate[]>([]); 
    certificateList$ = this.certificateListSubject.asObservable();

    constructor(private certificateDataService: CertificateDataService) {
    }

    load(): void {
        this.certificateDataService.load().subscribe(
            certificateList => {
                this.certificateListSubject.next(certificateList)
            },
            err => {
                console.error('err', err);
            }
        );
    }

}
