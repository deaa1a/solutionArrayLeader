package com.example.arrayleader.dto;


public class RequestDTO {
    private int[] A;
    private int M;
    private int K;

    public RequestDTO(int[] A,int M,int K){
        this.A = A;
        this.M = M;
        this.K = K;
    }

    public int[] getA() {
        return A;
    }

    public int getM() {
        return M;
    }

    public int getK() {
        return K;
    }
}


