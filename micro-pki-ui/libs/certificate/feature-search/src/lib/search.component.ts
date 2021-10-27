import { Component, OnInit} from '@angular/core';
import { SearchFacade } from '@micro-pki-ui/certificate/domain';

@Component({
  selector: 'certificate-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit {
    
    
    certificateList$ = this.searchFacade.certificateList$;


    constructor(private searchFacade: SearchFacade) {
    }

    
    ngOnInit() {
        this.load();
    }

    load(): void {
        this.searchFacade.load();
    }

}

