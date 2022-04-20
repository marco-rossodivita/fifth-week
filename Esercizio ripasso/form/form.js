/**
 * Controlla se i dati sono stati correttamente inseriti, ovvero che i campi non siano vuoti.
 * @returns 
 */
function control(){
    
    let nome = document.getElementById("nome").value;
    let matricola = document.getElementById("matricola").value;

    if(nome === ""){
        alert("Inserire nome.");
        return false;
    }

    if(matricola === ""){
        alert("Inserire matricola");
    }

    if(!(nome === "" || matricola === "")){
    alert("Dati inseriti correttamente");
    return true;
    }
}


/**
 * 
 * @returns 
 */
function controlName(){ 
    
    let nome = document.getElementById("nome").value;
    let regName = /\S+[A-Za-z-à-ú.\s_-]+$/;

    if(!regName.test(nome)){
        alert("NOT VALID: Inserire nome valido");
    }

}

/**
 * 
 * @returns 
 */
function controlMat(){ 
    
    let matricola = document.getElementById("matricola").value;
    

    if(matricola)

    if(isNaN(matricola)){
        alert("NOT VALID: Inserire matricola valida");
    }

    if(!(matricola > 0 || matricola < 2000)){
        alert("NOT VALID: Inserire matricola valida");
    }

    
}

 