import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { UserDataService } from 'src/app/user-data.service';

@Component({
  selector: 'app-admission',
  templateUrl: './admission.component.html',
  styleUrls: ['./admission.component.scss']
})
export class AdmissionComponent implements OnInit {
  back: string = "/assets/admission.jpg";

  constructor(private userDataService: UserDataService, private http: HttpClient) { }

  ngOnInit(): void {

  }

  public OnSubmit(UserId: any) {
    this.http.get(`http://localhost:8080/student/${UserId}`).subscribe((data) => {
       console.log(data);
      this.userDataService.setUserId(UserId);
      this.userDataService.setUserDetails(data);
    });
  }

  public postMethod(data: any) {

    if(!data.name || !data.dob || !data.age || !data.gender || !data.f_name || !data.email || !data.address || !data.phone_no)
    {
      console.log("Provide valid data");
    }
    else{
      this.http.post(`http://localhost:8080/student`, data).subscribe((data) => {
        console.log('Data saved');
        window.location.reload();
        console.log(data);
      });
    }
    
  }

  inputValue:String='';
  getValue()
  {
    console.log('Input Value',this.inputValue);
  }
}


