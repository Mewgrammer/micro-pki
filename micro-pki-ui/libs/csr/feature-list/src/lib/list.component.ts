import { Component, OnInit} from '@angular/core';
import { ListFacade } from '@micro-pki-ui/csr/domain';

@Component({
  selector: 'csr-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss']
})
export class ListComponent implements OnInit {
    
    
    csrList$ = this.listFacade.csrList$;


    constructor(private listFacade: ListFacade) {
    }

    
    ngOnInit() {
        this.load();
    }

    load(): void {
        this.listFacade.load();
    }

}

