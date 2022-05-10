import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/model/user.model';
import { ServiceUser } from 'src/app/service/service-user.service';


@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {

  users:User[] = []
  constructor(
    private serviceUser:ServiceUser
    ) { }

  ngOnInit(): void {
    this.serviceUser.getList().subscribe(user=>{
      this.users = user
    });
    
  }

}
