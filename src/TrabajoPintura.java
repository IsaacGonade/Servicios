public class TrabajoPintura {
    double Superficie;

    double PrecioPintura;

    public TrabajoPintura(double superficie, double precioPintura) {
        Superficie = superficie;
        PrecioPintura = precioPintura;
    }

    public double getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(double superficie) {
        Superficie = superficie;
    }

    public double getPrecioPintura() {
        return PrecioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        PrecioPintura = precioPintura;
    }

    public double costeMaterial(double coste_material){
        coste_material = (this.Superficie/7.8)*this.PrecioPintura;
        return(coste_material);
    }

    public  double costeManoObra(double coste_mano_obra){
        coste_mano_obra = (this.Superficie/10)*9.5;
        return(coste_mano_obra);
    }

    public  double costeTotal(double coste_total, double coste_material, double coste_mano_obra){
        coste_total = coste_material + coste_mano_obra;
        if (Superficie > 50) {
            return(coste_total);
        } else {
            return (coste_total + (coste_total * 0.15));
        }
    }

    @Override
    public String detalleServicio() {
        String cadena = "";

        cadena += "TRABAJO DE PINTURA\n";
        cadena += "Cliente: "+this.Cliente+"\n";
        cadena += "Fecha de Inicio: "+this.FechaInicio+"\n";
        cadena += "------------------\n";
        cadena += "Pintor: "+this.Trabajador+"\n";
        cadena += "Coste Material: "+coste_material+"\n";
        cadena += "Coste Mano Obra: "+coste_mano_obra+"\n";
        cadena += "Coste Adicional: "+costeAdicional+"\n";
        cadena += "TOTAL: "+coste_total+"\n";
        cadena += "------------------\n";
        return cadena;
    }
}
