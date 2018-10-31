import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { AllPatientsPage } from '../all-patients/all-patients';

/**
 * Generated class for the RegisterClinicianPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-register-clinician',
  templateUrl: 'register-clinician.html',
})
export class RegisterClinicianPage {

  email:string;
  password:string;
  constructor(public navCtrl: NavController, public navParams: NavParams) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad RegisterClinicianPage');
  }

  registerClinicianAndLogin(){
    this.navCtrl.push(AllPatientsPage);
  }
}
