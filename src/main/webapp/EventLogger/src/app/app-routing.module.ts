import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EventListComponent } from './components/event-list/event-list.component';
import { DisplayTimeComponent } from './components/display-time/display-time.component';
import { SubmitEventComponent } from './components/submit-event/submit-event.component';


const routes: Routes = [
  { path: 'list', component: EventListComponent },
  { path: 'time', component: DisplayTimeComponent },
  { path: 'submit', component: SubmitEventComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
