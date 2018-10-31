import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { RegisterClinicianPage } from '../register-clinician/register-clinician';
import { AllPatientsPage } from '../all-patients/all-patients';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  email:string;
  password:string;
  constructor(public navCtrl: NavController) {
  }

  registerClinician(){
    this.navCtrl.push(RegisterClinicianPage);
  }

  login(){
    console.log("Email: "+this.email)
    console.log("Password: "+this.password)
    this.navCtrl.push(AllPatientsPage);
  }

  
}