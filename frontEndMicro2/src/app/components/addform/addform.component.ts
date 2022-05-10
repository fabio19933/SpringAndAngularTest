import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { User } from 'src/app/model/user.model';
import { ServiceUser } from 'src/app/service/service-user.service';

@Component({
  selector: 'app-addform',
  templateUrl: './addform.component.html',
  styleUrls: ['./addform.component.css']
})
export class AddformComponent implements OnInit {

  formgroup: FormGroup = new FormGroup({
    'name': new FormControl('test'),
    'surname': new FormControl(null)
  });
  constructor(private serviceUser:ServiceUser) { }

  ngOnInit(): void {
  }
  
  submit(){
    this.serviceUser.saveUser(
      new User(this.formgroup.value.name,this.formgroup.value.surname)
      )
      .subscribe({
        next: () => {alert("User saved")},
        error: () => {alert("error")}
      });
  }

}
