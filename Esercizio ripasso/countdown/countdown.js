
//2022
const annoCorrente = new Date().getFullYear();

const getNewYear = () => {

    //Ritorna il timestamp della data – il numero di millisecondi trascorsi dal 1 Gennaio 1970 in UTC+0.
    return new Date(`Jan 01, ${annoCorrente + 1} 00:00:00`).getTime(); 
    
}


// Con il setInterval vado continuamente a chiamare la funzione senza interruzione, finchè non richiamo clearInterval()
let x = setInterval(function() {

  let ora = new Date().getTime();

  // Differenza tra l'anno di interesse e l'anno corrente
  let differenza = getNewYear() - ora;

  // Calcolo (conversione) dei giorni, ore, minuti e secondi 
  let giorni = Math.floor(differenza / (1000 * 60 * 60 * 24));
  let ore = Math.floor((differenza % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
  let minuti = Math.floor((differenza % (1000 * 60 * 60)) / (1000 * 60));
  let secondi = Math.floor((differenza % (1000 * 60)) / 1000);

  document.getElementById("countdown").innerHTML = "Al 2023 mancano: " + giorni + "d " + ore + "h "
  + minuti + "m " + secondi + "s ";

  
  // devo usare il clearInterval()

}, 1000);


