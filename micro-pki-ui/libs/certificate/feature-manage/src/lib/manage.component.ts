import { Component, OnInit} from '@angular/core';
import { ManageFacade } from '@micro-pki-ui/certificate/domain';

@Component({
  selector: 'certificate-manage',
  templateUrl: './manage.component.html',
  styleUrls: ['./manage.component.scss']
})
export class ManageComponent implements OnInit {
    
    
    certificateList$ = this.manageFacade.certificateList$;


    constructor(private manageFacade: ManageFacade) {
    }

    
    ngOnInit() {
        this.load();
    }

    load(): void {
        this.manageFacade.load();
    }

}

