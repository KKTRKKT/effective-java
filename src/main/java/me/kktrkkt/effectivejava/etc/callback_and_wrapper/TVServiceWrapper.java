package me.kktrkkt.effectivejava.etc.callback_and_wrapper;

class TVServiceWrapper implements FunctionToCall{

    private final FunctionToCall functionToCall;

    public TVServiceWrapper(FunctionToCall functionToCall) {
        this.functionToCall = functionToCall;
    }

    @Override
    public void run() {
        this.functionToCall.run();
        System.out.println("lol");
    }

    @Override
    public void call() {
        this.functionToCall.call();
    }
}
