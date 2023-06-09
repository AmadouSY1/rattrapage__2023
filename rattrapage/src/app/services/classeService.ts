import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Classe } from "../model/classe";
import { environment } from "src/environments/environment.development";
import { Injectable } from "@angular/core";

@Injectable({
  providedIn: 'root'
})

export class ClasseService{

  classes: Classe[] =[];
  private url =`${environment.API}/classes`

  constructor(private http:HttpClient){}

  getAllClasse():Observable<Classe[]>{
      return this.http.get<Classe[]>(this.url);
  }





}

