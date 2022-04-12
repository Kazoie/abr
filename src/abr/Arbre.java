package abr;

class Arbre  
{
  int contenu;
  Arbre filsG, filsD;
  
  Arbre(Arbre g, int c, Arbre d)  {
    this.filsG = g; 
    this.contenu = c; 
    this.filsD = d;
  }
}