import { Component, OnInit} from '@angular/core';
import { ListFacade } from '@micro-pki-ui/certificate/domain';

@Component({
  selector: 'certificate-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss']
})
export class ListComponent implements OnInit {
    
    
    certificateList$ = this.listFacade.certificateList$;


    constructor(private listFacade: ListFacade) {
    }

    
    ngOnInit() {
        this.load();
    }

    load(): void {
        this.listFacade.load();
    }

}

