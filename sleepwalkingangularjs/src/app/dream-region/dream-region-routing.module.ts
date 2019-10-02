import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DreamListComponent } from './dream-list/dream-list.component';

const routes: Routes = [
    {
        path: '', component: DreamListComponent, children: [{
            path: 'list', component: DreamListComponent
        }]
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class DreamRegionRoutingModule {

}
