package edu.estatuas;

public class Carrera {

        private String tarjetaCredito;
        private String origen;
        private String destino;
        private double distancia;
        private int TiempoEsperado;

        Carrera(String tarjetaCredito) {
                this.tarjetaCredito = tarjetaCredito;
        }


        public void setDestino(String destino) {
                this.destino = destino;
        }

        public void setDistancia(double distancia) {
                this.distancia = distancia;
        }

        public void setOrigen(String origen) {
                this.origen = origen;
        }

        public void setTiempoEsperado(int TiempoEsperado) {
                this.TiempoEsperado = TiempoEsperado;
        }

        public String getOrigen() {
                return this.origen;
        }

        public String getDestino() {
                return this.destino;
        }

        public double getDistancia() {
                return this.distancia;
        }

        public int getTiempoEsperado() {
                return this.TiempoEsperado;
        }

        public String getTarjetaCredito() {
                return this.tarjetaCredito;
        }
}

