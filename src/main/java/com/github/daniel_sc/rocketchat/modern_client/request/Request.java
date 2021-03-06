package com.github.daniel_sc.rocketchat.modern_client.request;

import java.util.UUID;

public class Request implements IRequest {
    public final String msg;
    public final Object[] params;
    public String id;

    public Request(String msg, Object... params) {
        this.msg = msg;
        this.params = params;
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public String getId() {
        return id;
    }
}
