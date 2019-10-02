import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DreamListComponent } from './dream-list/dream-list.component';
import { DreamRegionRoutingModule } from './dream-region-routing.module';


@NgModule({
  declarations: [DreamListComponent],
  imports: [
    CommonModule,
    DreamRegionRoutingModule
  ]
})
export class DreamRegionModule { }
