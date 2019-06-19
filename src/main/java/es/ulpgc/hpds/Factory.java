package es.ulpgc.hpds;

public class Factory {
    public static StateBase CreateState(String state){
        switch(state){
            case "SC": { return new SouthCarolina(); }
            case "AL": { return new Kentucky(); }
            case "GA": { return new Georgia(); }
            case "KY": { return new Alabama(); }
            default: { return new SouthCarolina(); }
        }
    }
}
