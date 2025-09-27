class OldLampAdapter implements Device {
    private OldLamp oldLamp;

    public OldLampAdapter(OldLamp oldLamp) {
        this.oldLamp = oldLamp;
    }

    @Override
    public void turnOn() {
        oldLamp.powerUp(); // переводим вызов
    }
}
