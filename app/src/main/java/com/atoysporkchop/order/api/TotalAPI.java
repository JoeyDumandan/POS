package com.atoysporkchop.order.api;

import java.io.Serializable;

public class TotalAPI implements Serializable {

    private PorkchopAPI porkchopAPI;
    private TapaAPI tapaAPI;
    private TocinoAPI tocinoAPI;
    private FriedChickenAPI friedChickenAPI;
    private DaingNaBangusAPI daingNaBangusAPI;
    private PorkSisigAPI porkSisigAPI;
    private ChickenLongganisaAPI chickenLongganisaAPI;
    private GrilledSpareribsAPI grilledSpareribsAPI;
    private GarlicLongganisaAPI garlicLongganisaAPI;
    private SodaInCanAPI sodaInCanAPI;
    private BottledWaterAPI bottledWaterAPI;
    private JuiceInCanAPI juiceInCanAPI;
    private EggAPI eggAPI;
    private FriedRiceAPI friedRiceAPI;

    public PorkchopAPI getPorkchopAPI() {
        return porkchopAPI;
    }

    public void setPorkchopAPI(PorkchopAPI porkchopAPI) {
        this.porkchopAPI = porkchopAPI;
    }

    public TapaAPI getTapaAPI() {
        return tapaAPI;
    }

    public void setTapaAPI(TapaAPI tapaAPI) {
        this.tapaAPI = tapaAPI;
    }

    public TocinoAPI getTocinoAPI() {
        return tocinoAPI;
    }

    public void setTocinoAPI(TocinoAPI tocinoAPI) {
        this.tocinoAPI = tocinoAPI;
    }

    public FriedChickenAPI getFriedChickenAPI() {
        return friedChickenAPI;
    }

    public void setFriedChickenAPI(FriedChickenAPI friedChickenAPI) {
        this.friedChickenAPI = friedChickenAPI;
    }

    public DaingNaBangusAPI getDaingNaBangusAPI() {
        return daingNaBangusAPI;
    }

    public void setDaingNaBangusAPI(DaingNaBangusAPI daingNaBangusAPI) {
        this.daingNaBangusAPI = daingNaBangusAPI;
    }

    public PorkSisigAPI getPorkSisigAPI() {
        return porkSisigAPI;
    }

    public void setPorkSisigAPI(PorkSisigAPI porkSisigAPI) {
        this.porkSisigAPI = porkSisigAPI;
    }

    public ChickenLongganisaAPI getChickenLongganisaAPI() {
        return chickenLongganisaAPI;
    }

    public void setChickenLongganisaAPI(ChickenLongganisaAPI chickenLongganisaAPI) {
        this.chickenLongganisaAPI = chickenLongganisaAPI;
    }

    public GrilledSpareribsAPI getGrilledSpareribsAPI() {
        return grilledSpareribsAPI;
    }

    public void setGrilledSpareribsAPI(GrilledSpareribsAPI grilledSpareribsAPI) {
        this.grilledSpareribsAPI = grilledSpareribsAPI;
    }

    public GarlicLongganisaAPI getGarlicLongganisaAPI() {
        return garlicLongganisaAPI;
    }

    public void setGarlicLongganisaAPI(GarlicLongganisaAPI garlicLongganisaAPI) {
        this.garlicLongganisaAPI = garlicLongganisaAPI;
    }

    public SodaInCanAPI getSodaInCanAPI() {
        return sodaInCanAPI;
    }

    public void setSodaInCanAPI(SodaInCanAPI sodaInCanAPI) {
        this.sodaInCanAPI = sodaInCanAPI;
    }

    public BottledWaterAPI getBottledWaterAPI() {
        return bottledWaterAPI;
    }

    public void setBottledWaterAPI(BottledWaterAPI bottledWaterAPI) {
        this.bottledWaterAPI = bottledWaterAPI;
    }

    public JuiceInCanAPI getJuiceInCanAPI() {
        return juiceInCanAPI;
    }

    public void setJuiceInCanAPI(JuiceInCanAPI juiceInCanAPI) {
        this.juiceInCanAPI = juiceInCanAPI;
    }

    public EggAPI getEggAPI() {
        return eggAPI;
    }

    public void setEggAPI(EggAPI eggAPI) {
        this.eggAPI = eggAPI;
    }

    public FriedRiceAPI getFriedRiceAPI() {
        return friedRiceAPI;
    }

    public void setFriedRiceAPI(FriedRiceAPI friedRiceAPI) {
        this.friedRiceAPI = friedRiceAPI;
    }

    @Override
    public String toString() {
        return "TotalAPI{" +
                "porkchopAPI=" + porkchopAPI +
                ", tapaAPI=" + tapaAPI +
                ", tocinoAPI=" + tocinoAPI +
                ", friedChickenAPI=" + friedChickenAPI +
                ", daingNaBangusAPI=" + daingNaBangusAPI +
                ", porkSisigAPI=" + porkSisigAPI +
                ", chickenLongganisaAPI=" + chickenLongganisaAPI +
                ", grilledSpareribsAPI=" + grilledSpareribsAPI +
                ", garlicLongganisaAPI=" + garlicLongganisaAPI +
                ", sodaInCanAPI=" + sodaInCanAPI +
                ", bottledWaterAPI=" + bottledWaterAPI +
                ", juiceInCanAPI=" + juiceInCanAPI +
                ", eggAPI=" + eggAPI +
                ", friedRiceAPI=" + friedRiceAPI +
                '}';
    }

}
