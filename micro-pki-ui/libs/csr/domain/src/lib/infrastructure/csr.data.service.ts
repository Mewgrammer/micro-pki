import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { Csr } from '../entities/csr';
import type { CsrUpload } from '../entities/csr-upload';

@Injectable({providedIn: 'root'})
export class CsrDataService {

  constructor(private http: HttpClient) {
  }

  load(): Observable<Csr[]> {

    return of([
      {id: "", csr: 'Lorem ipsum', comment: 'Lorem ipsum dolor sit amet'},
      {id: "2", csr: 'At vero eos', comment: 'At vero eos et accusam et justo duo dolores'},
      {id: "3", csr: 'Duis autem', comment: 'Duis autem vel eum iriure dolor in hendrerit'},
    ]);
  }

  push(csr: CsrUpload): Observable<Csr> {
    const url = 'http://localhost:5001/api/v1/csr';
    return this.http.post<Csr>(url, csr);
  }
}
