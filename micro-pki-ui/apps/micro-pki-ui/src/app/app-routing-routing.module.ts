import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CsrPageComponent } from './pages/csr/csr-page.component';

const routes: Routes = [
  {
    path: 'csr',
    component: CsrPageComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingRoutingModule {
}
