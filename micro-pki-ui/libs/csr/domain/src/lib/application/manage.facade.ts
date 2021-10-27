import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

import { Csr } from '../entities/csr';
import { CsrDataService } from '../infrastructure/csr.data.service';


@Injectable({ providedIn: 'root' })
export class ManageFacade {

    private csrListSubject = new BehaviorSubject<Csr[]>([]); 
    csrList$ = this.csrListSubject.asObservable();

    constructor(private csrDataService: CsrDataService) {
    }

    load(): void {
        this.csrDataService.load().subscribe(
            csrList => {
                this.csrListSubject.next(csrList)
            },
            err => {
                console.error('err', err);
            }
        );
    }

}
