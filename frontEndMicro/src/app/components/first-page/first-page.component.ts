import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'first-page',
  templateUrl: './first-page.component.html',
  styleUrls: ['./first-page.component.css']
})
export class FirstPageComponent implements OnInit {
  test:any;

  constructor(private routing:Router) { }

  ngOnInit(): void {
  }

  insertNewUser(){
    this.routing.navigate(['addForm'])
  }

  listUsers(){
    this.routing.navigate(['listUser'])
  }

}
