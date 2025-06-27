package org.example;

public class MyService {
    ExternalApi api;

    MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}
