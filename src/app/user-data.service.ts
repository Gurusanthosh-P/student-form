import { Injectable } from '@angular/core';
import{HttpClient}from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class UserDataService {
  
  constructor(private http:HttpClient) { }


  private UserId:any;
  private UserDetails:any;

  setUserId(id:any)
  {
    this.UserId=id
  }

  getUserId():any
  {
      return this.UserId
  }

  setUserDetails(details:any)
  {
    this.UserDetails=details
  }

  getUserDetails():any{
    return this.UserDetails
  }
}
