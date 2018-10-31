import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { RegisterClinicianPage } from './register-clinician';

@NgModule({
  declarations: [
    RegisterClinicianPage,
  ],
  imports: [
    IonicPageModule.forChild(RegisterClinicianPage),
  ],
})
export class RegisterClinicianPageModule {}
