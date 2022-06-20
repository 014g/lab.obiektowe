package com.company;

public abstract class Zwierze implements Ply , La {

        @Override
        public void lec() {
            System.out.println("leci");
        }
        @Override
        public void wyladuj() {
            System.out.println("ląduje");
        }
        @Override
        public void plyn() {
            System.out.println("płynie");
        }
        @Override
        public void wynurz() {
            System.out.println("wynurza się");
        }
        @Override
        public void zanurz() {
            System.out.println("zanurza się");
        }
}
