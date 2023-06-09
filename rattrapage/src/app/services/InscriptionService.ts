import { Injectable } from "@angular/core";
import { Inscription } from "../model/inscription";
import { environment } from "src/environments/environment.development";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";

@Injectable({
  providedIn: 'root'
})

export class InscriptionService{

  inscriptions: Inscription[] =[];
  private url =`${environment.API}/inscriptions`

  constructor(private http:HttpClient){}

  getAllInscription():Observable<Inscription[]>{
      return this.http.get<Inscription[]>(this.url);
  }





}
