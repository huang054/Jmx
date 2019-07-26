package com.jmx.callable;

public class MyCallable{



    private interface  Callable{
        public void onSuccessed(Object success);

        public void onFailed(Object fail);
    }

    public static <T> void callableDo(Callable callable,T object){
        try{
            System.out.println("do something");
            int i=1/0;
            callable.onSuccessed(object);
        }catch(Exception e){
            callable.onFailed(object);
        }

    }

    public static void main(String[] args) {
        MyCallable myCallable=new MyCallable();
       callableDo(new Callable() {
            @Override
            public void onSuccessed(Object success) {
               System.out.println("success");
            }

            @Override
            public void onFailed(Object fail) {
                System.out.println("fail");
            }
        },new Object());
    }
}
