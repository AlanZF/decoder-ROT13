import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DecoderComponent } from './components/decoder/decoder/decoder.component';

const routes: Routes = [
  { path: "decoder", component: DecoderComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
