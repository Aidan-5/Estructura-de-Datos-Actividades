const List = require('./List');

class ArrayList extends List {

constructor(capacidadInicial = 10) {
    super();
    this.elementos = new Array(capacidadInicial);
    this.tamanio = 0;
    this.capacidad = capacidadInicial;
}

// O(1) amortizado
add(element) {
    if (this.tamanio === this.capacidad) {
        this._redimensionar();
    }
    this.elementos[this.tamanio] = element;
    this.tamanio++;
}

// Inserción en posición — O(n)
insert(index, element) {
    if (index < 0 || index > this.tamanio) {
        throw new RangeError("Índice fuera de rango");
    }

    if (this.tamanio === this.capacidad) {
        this._redimensionar();
    }

    // Mover a la derecha
    for (let i = this.tamanio; i > index; i--) {
        this.elementos[i] = this.elementos[i - 1];
    }

    this.elementos[index] = element;
    this.tamanio++;
}

// O(n)
remove(index) {
    if (index < 0 || index >= this.tamanio) {
        throw new RangeError("Índice fuera de rango");
    }

    const eliminado = this.elementos[index];

    // Recorrer a la izquierda
    for (let i = index; i < this.tamanio - 1; i++) {
        this.elementos[i] = this.elementos[i + 1];
    }

    this.tamanio--;
    this.elementos[this.tamanio] = undefined;

    return eliminado;
}

// O(1)
get(index) {
    if (index < 0 || index >= this.tamanio) {
        throw new RangeError("Índice fuera de rango");
    }
    return this.elementos[index];
}

size() {
    return this.tamanio;
}

isEmpty() {
    return this.tamanio === 0;
}

clear() {
    this.elementos = new Array(this.capacidad);
    this.tamanio = 0;
}

// Duplicar capacidad
_redimensionar() {
    this.capacidad *= 2;
    const nuevoArreglo = new Array(this.capacidad);

    for (let i = 0; i < this.tamanio; i++) {
        nuevoArreglo[i] = this.elementos[i];
    }

    this.elementos = nuevoArreglo;
}

// Iterador
[Symbol.iterator]() {
    let index = 0;
    const elementos = this.elementos;
    const tamanio = this.tamanio;

    return {
        next() {
            if (index < tamanio) {
                return { value: elementos[index++], done: false };
            }
            return { value: undefined, done: true };
        }
    };
}

// Representación tipo lista
toString() {
    if (this.tamanio === 0) return "[]";

    let resultado = "[";

    for (let i = 0; i < this.tamanio; i++) {
        resultado += this.elementos[i];
        if (i < this.tamanio - 1) resultado += ",";
    }

    resultado += "]";
    return resultado;
}

}

module.exports = ArrayList;