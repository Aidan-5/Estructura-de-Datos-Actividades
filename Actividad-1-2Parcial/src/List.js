class List {
    //añadir elementos al final de la lista
    add (element){
        throw new Error("Funcionalidad pendiente de implementacion");
    }

    // metdod insert, sirve para añadir un elemento en una poccion en espesifico o(1)=buqueda lineal
    insert(index, element){
        throw new Error("Funcionalidad pendiente de implementacion");
    }
    remove(index){
        throw new Error("Funcionalidad pendiente de implementacion");
    }

    //metodo get 0(1)
    get(index){
        throw new Error("Funcionalidad pendiente de implementacion");
    }

    size(){
        throw new Error("Funcionalidad pendiente de implementacion");
    }

    complejidad=0(1)
    isEmpty(){
        return this.size() === 0;
    }

    //metodo para limpiar
    clear(){
        throw new Error("Funcionalidad pendiente de implementacion");
    }

    [Symbol.iterator](){
        throw new Error("Funcionalidad pendiente de implementacion");
    }
}

module.exports = List;