package com.withings.webservices.legacy.common;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.internal.http.HttpMethod;
import java.io.IOException;
import java.io.OutputStream;
import retrofit.client.OkClient;
import retrofit.client.Request;
import retrofit.client.Response;
import retrofit.mime.TypedOutput;
import zendesk.core.Constants;
/* loaded from: classes4.dex */
public class NoBodyOkClient extends OkClient {
    public NoBodyOkClient() {
    }

    @Override // retrofit.client.OkClient, retrofit.client.Client
    public Response execute(Request request) throws IOException {
        if (HttpMethod.requiresRequestBody(request.getMethod()) && request.getBody() == null) {
            return super.execute(new Request(request.getMethod(), request.getUrl(), request.getHeaders(), EmptyOutput.INSTANCE));
        }
        return super.execute(request);
    }

    public NoBodyOkClient(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }

    /* loaded from: classes4.dex */
    private static class EmptyOutput implements TypedOutput {
        static final TypedOutput INSTANCE = new EmptyOutput();

        private EmptyOutput() {
        }

        @Override // retrofit.mime.TypedOutput
        public String fileName() {
            return null;
        }

        @Override // retrofit.mime.TypedOutput
        public long length() {
            return 0L;
        }

        @Override // retrofit.mime.TypedOutput
        public String mimeType() {
            return Constants.APPLICATION_JSON;
        }

        @Override // retrofit.mime.TypedOutput
        public void writeTo(OutputStream outputStream) {
        }
    }
}
