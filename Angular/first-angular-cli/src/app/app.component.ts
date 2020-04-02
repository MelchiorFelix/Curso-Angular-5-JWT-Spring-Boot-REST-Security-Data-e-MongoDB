import { User } from './user';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Tasks';
  upperText:string = 'display uppercase text';
  lowerText:string = 'Display lowcerase text';
  dateValue: Date = new Date();
  money: number = 562;
  percentValue:number = 0.5;
  isAdmin2: boolean = true;
  profile:number = 5;
  user:  User = {
    name: 'John',
    age: 36
  }
  
}
