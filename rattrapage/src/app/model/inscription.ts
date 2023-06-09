import { Classe } from "./classe";
import { Etudiant } from "./etudiant";

export interface Inscription {
  id: number;
  date:Date;
  etudiant:Etudiant;
  classe:Classe;
}
