import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'products-app';

  products: Observable<any>;

  constructor(private http: HttpClient) {
  }

  ngOnInit() {
    this.products = this.http.get('http://localhost:1234/api/products');
  }
}
