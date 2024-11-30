class carta{
    valor
    imagen
    constructor(representacion){
        this.imagen=`./images/${representacion}.png`
        this.valor= representacion.substring(0,representacion.length-1);

        switch (this.valor) {
            case "J":
                this.valor = 10;
                break;
            case "Q":
                this.valor = 10;
                break;
            case "K":
                this.valor = 10;
                break;
            default:
                this.valor = Number(this.valor);
                break;
        }

    }
}