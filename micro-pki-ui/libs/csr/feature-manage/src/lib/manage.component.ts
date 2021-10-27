import { Component, OnInit} from '@angular/core';
import { ManageFacade } from '@micro-pki-ui/csr/domain';

@Component({
  selector: 'csr-manage',
  templateUrl: './manage.component.html',
  styleUrls: ['./manage.component.scss']
})
export class ManageComponent implements OnInit {
    
    
    csrList$ = this.manageFacade.csrList$;


    constructor(private manageFacade: ManageFacade) {
    }

    
    ngOnInit() {
        this.load();
    }

    load(): void {
        this.manageFacade.load();
    }

}

