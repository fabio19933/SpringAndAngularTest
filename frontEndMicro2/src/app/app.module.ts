import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { FirstPageComponent } from './components/first-page/first-page.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AddformComponent } from './components/addform/addform.component';
import { ReactiveFormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { ListUserComponent } from './components/list-user/list-user.component';
import { HttpClientModule } from '@angular/common/http';
const routes: Routes = [
  { path: 'addForm', component: AddformComponent },
  { path: 'listUser', component: ListUserComponent },
  { path: '', component: FirstPageComponent },
];
@NgModule({
  declarations: [
    AppComponent,
    FirstPageComponent,
    AddformComponent,
    ListUserComponent
  ],
  imports: [
    BrowserModule,
    NgbModule,
    ReactiveFormsModule,
    RouterModule.forRoot(routes),
    HttpClientModule
  ],
  exports: [RouterModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
