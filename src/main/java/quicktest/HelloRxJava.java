package quicktest;

import io.reactivex.Observable;

public class HelloRxJava {

    public static void main(String[] args) {
        Observable<String> source = Observable.create(
            e -> {
                e.onNext("Hello");
                e.onNext("to RxJava");
            }
        );

        source.subscribe(e -> System.out.println("Observer 1: " + e));
        source.subscribe(e -> System.out.println("Observer 2: " + e));
    }
}
