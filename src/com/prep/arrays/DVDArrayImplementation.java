package com.prep.arrays;

public class DVDArrayImplementation {

    public static void main(String[] args) {
        DVDArray[] dvdCollection = new DVDArray[4];
        dvdCollection[0] = new DVDArray("Avengers","Joss",2012);
        dvdCollection[1] = new DVDArray("Thor","Joss",2010);
        dvdCollection[2] = new DVDArray("Captain America - First Avenger","Joss",2006);
        dvdCollection[3] = new DVDArray("The Incredible","Brad Bird",2004);
        dvdCollection[3] = new DVDArray("The Pursuit of Happyness","Will Smith",2006);


        for (DVDArray dvd:dvdCollection) {
            System.out.println(dvd.dvdName);
        }
    }

    public static class DVDArray {
        public String dvdName;
        public String directorName;
        public int releaseYear;

        public DVDArray(String dvdName, String directorName, int releaseYear) {
            this.dvdName = dvdName;
            this.directorName = directorName;
            this.releaseYear = releaseYear;
        }

        @Override
        public String toString() {
            return "DVDArray{" +
                    "dvdName='" + dvdName + '\'' +
                    ", directorName='" + directorName + '\'' +
                    ", releaseYear=" + releaseYear +
                    '}';
        }
    }
}
