import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EventListComponent } from './components/event-list/event-list.component';
import { DisplayTimeComponent } from './components/display-time/display-time.component';
import { SubmitEventComponent } from './components/submit-event/submit-event.component';

@NgModule({
  declarations: [
    AppComponent,
    EventListComponent,
    DisplayTimeComponent,
    SubmitEventComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
