package com.withings.webservices.legacy.common;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.nio.ByteBuffer;
import okio.e;
import okio.g;
import okio.k0;
import okio.o;
import okio.x;
/* loaded from: classes4.dex */
public class ProgressDownload {
    private final OkHttpClient client;
    private final Listener listener;
    private final Request request;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class Interceptor implements com.squareup.okhttp.Interceptor {
        /* synthetic */ Interceptor(ProgressDownload progressDownload, int i11) {
            this();
        }

        @Override // com.squareup.okhttp.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Response proceed = chain.proceed(chain.request());
            return proceed.newBuilder().body(new ProgressResponseBody(proceed.body())).build();
        }

        private Interceptor() {
        }
    }

    /* loaded from: classes4.dex */
    public interface Listener {
        void onDownloadProgress(long j5, long j11, boolean z5);
    }

    public ProgressDownload(OkHttpClient okHttpClient, Request request, Listener listener) {
        this.client = okHttpClient;
        this.request = request;
        this.listener = listener;
    }

    public ByteBuffer download() throws IOException {
        this.client.networkInterceptors().add(new Interceptor(this, 0));
        Response execute = this.client.newCall(this.request).execute();
        if (execute.isSuccessful()) {
            return ByteBuffer.wrap(execute.body().bytes());
        }
        throw new IOException(String.format("Unable to download content of url : %s (%d : %s)", this.request.urlString(), Integer.valueOf(execute.code()), execute.message()));
    }

    /* loaded from: classes4.dex */
    private class ProgressResponseBody extends ResponseBody {
        private g bufferedSource;
        private final ResponseBody responseBody;

        public ProgressResponseBody(ResponseBody responseBody) {
            this.responseBody = responseBody;
        }

        @Override // com.squareup.okhttp.ResponseBody
        public long contentLength() throws IOException {
            return this.responseBody.contentLength();
        }

        @Override // com.squareup.okhttp.ResponseBody
        public MediaType contentType() {
            return this.responseBody.contentType();
        }

        @Override // com.squareup.okhttp.ResponseBody
        public g source() throws IOException {
            if (this.bufferedSource == null) {
                this.bufferedSource = x.d(source(this.responseBody.source()));
            }
            return this.bufferedSource;
        }

        private k0 source(k0 k0Var) {
            return new o(k0Var) { // from class: com.withings.webservices.legacy.common.ProgressDownload.ProgressResponseBody.1
                long totalBytesRead = 0;

                @Override // okio.o, okio.k0
                public long read(e eVar, long j5) throws IOException {
                    long j11;
                    boolean z5;
                    long read = super.read(eVar, j5);
                    long j12 = this.totalBytesRead;
                    int i11 = (read > (-1L) ? 1 : (read == (-1L) ? 0 : -1));
                    if (i11 != 0) {
                        j11 = read;
                    } else {
                        j11 = 0;
                    }
                    this.totalBytesRead = j12 + j11;
                    Listener listener = ProgressDownload.this.listener;
                    long j13 = this.totalBytesRead;
                    long contentLength = ProgressResponseBody.this.responseBody.contentLength();
                    if (i11 == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    listener.onDownloadProgress(j13, contentLength, z5);
                    return read;
                }
            };
        }
    }
}
