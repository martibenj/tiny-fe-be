import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { DummyAPI } from './common/class/DummyAPI';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  value = 'default Value';

  constructor(private http: HttpClient) {
  }

  ngOnInit() {
    this.http.get<DummyAPI>('http://localhost:8080/api/hello')
      .subscribe(pDummy => {
        if (pDummy) {
          this.value = pDummy.value;
        }
      });
  }
}
