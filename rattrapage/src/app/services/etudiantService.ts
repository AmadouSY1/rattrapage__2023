import { HttpClient } from "@angular/common/http";
import { Etudiant } from "../model/etudiant";
import { environment } from "src/environments/environment.development";
import { Observable } from "rxjs";
import { Injectable } from "@angular/core";

@Injectable({
  providedIn: 'root'
})

export class ClasseService{

  etudiants: Etudiant[] =[];
  private url =`${environment.API}/etudiants`

  constructor(private http:HttpClient){}

  getAllClasse():Observable<Etudiant[]>{
      return this.http.get<Etudiant[]>(this.url);
  }





}
