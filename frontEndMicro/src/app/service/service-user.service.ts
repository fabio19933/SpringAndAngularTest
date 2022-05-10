import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../model/user.model';

@Injectable({
  providedIn: 'root'
})
export class ServiceUser{

  constructor(private httpclient:HttpClient) { }
  ngOnInit(): void {
  }
  getList(){
   return this.httpclient.get<any>("http://localhost:8080/api/getListUser");
   //todo uncomment when nginx is configured
   //return this.httpclient.get<any>("http://firstMicroservice:8080/api/getListUser");
  }
  saveUser(user:User){
    return this.httpclient.post("http://localhost:8081/api/saveUser", user);
    //todo uncomment when nginx is configured
   // return this.httpclient.post("http://secondMicroservice:8081/api/saveUser", user);
   }
}
