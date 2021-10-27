import { Component, OnInit} from '@angular/core';
import { UploadFacade } from '@micro-pki-ui/csr/domain';

@Component({
  selector: 'csr-upload',
  templateUrl: './upload.component.html',
  styleUrls: ['./upload.component.scss']
})
export class UploadComponent implements OnInit {
    
    
    csrList$ = this.uploadFacade.csrList$;


    constructor(private uploadFacade: UploadFacade) {
    }

    
    ngOnInit() {
        this.load();
    }

    load(): void {
        this.uploadFacade.load();
    }

}

