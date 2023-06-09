import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Inscription } from 'src/app/model/inscription';
import { InscriptionService } from 'src/app/services/InscriptionService';

@Component({
  selector: 'app-inscriptions',
  templateUrl: './inscriptions.component.html',
  styleUrls: ['./inscriptions.component.css']
})
export class InscriptionsComponent {
  inscriptions: Inscription[]= [];


  constructor(
    private inscriptionService: InscriptionService,
    private router:Router ){}

  ngOnInit(): void{
    this.inscriptionService.getAllInscription().subscribe(data=>this.inscriptions=data);
  }
  onLoadView(inscription:Inscription){
    this.router.navigateByUrl("/inscriptions/${liste}");
  }




}


