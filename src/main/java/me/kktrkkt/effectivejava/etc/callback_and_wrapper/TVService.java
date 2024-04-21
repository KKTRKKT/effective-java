package me.kktrkkt.effectivejava.etc.callback_and_wrapper;
class TVService implements FunctionToCall{

    private final Service service;

    public TVService(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        System.out.println("TVService");
    }

    @Override
    public void call() {
        this.service.run(this);
    }
}
