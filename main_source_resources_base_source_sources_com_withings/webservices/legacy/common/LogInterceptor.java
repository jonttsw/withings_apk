package com.withings.webservices.legacy.common;

import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import okio.e;
import okio.g;
import org.apache.http.protocol.HTTP;
import x70.b;
/* loaded from: classes4.dex */
public class LogInterceptor implements Interceptor {
    private static final int LOG_CHUNK_SIZE = 4000;
    private static final Charset UTF8 = Charset.forName("UTF-8");

    private boolean bodyEncoded(Headers headers) {
        String str = headers.get("Content-Encoding");
        if (str != null && !HTTP.IDENTITY_CODING.equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    private boolean isPlaintext(e eVar) {
        long j5;
        try {
            e eVar2 = new e();
            if (eVar.E() < 64) {
                j5 = eVar.E();
            } else {
                j5 = 64;
            }
            eVar.d(0L, eVar2, j5);
            for (int i11 = 0; i11 < 16; i11++) {
                if (!eVar2.t1()) {
                    int z5 = eVar2.z();
                    if (Character.isISOControl(z5) && !Character.isWhitespace(z5)) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    private Request logRequest(Request request) throws IOException {
        b.b(this, "--> %s %s", request.method(), request.url());
        if (request.body() != null) {
            logRequestBody(request.headers(), request.body());
            b.b(this, "--> END", new Object[0]);
        }
        return request;
    }

    private void logRequestBody(Headers headers, RequestBody requestBody) throws IOException {
        String N1;
        if (bodyEncoded(headers)) {
            b.b(this, "    Body encoded (%d bytes)", Long.valueOf(requestBody.contentLength()));
            return;
        }
        e eVar = new e();
        requestBody.writeTo(eVar);
        Charset charset = UTF8;
        MediaType contentType = requestBody.contentType();
        if (contentType != null) {
            charset = contentType.charset(charset);
        }
        if (isPlaintext(eVar)) {
            int length = eVar.N1(charset).length();
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11 + 4000;
                int min = Math.min(length, i12);
                b.b(this, "    " + N1.substring(i11, min), new Object[0]);
                i11 = i12;
            }
            return;
        }
        b.b(this, "    Binary body (%d bytes)", Long.valueOf(requestBody.contentLength()));
    }

    private void logResponse(Response response, long j5) throws IOException {
        Request request = response.request();
        b.b(this, "<-- %s %s %d %s (%.3f s)", request.method(), request.url(), Integer.valueOf(response.code()), response.message(), Float.valueOf(((float) j5) / 1000.0f));
        if (response.body() != null) {
            logResponseBody(response.headers(), response.body());
        }
        b.b(this, "<-- END", new Object[0]);
    }

    private void logResponseBody(Headers headers, ResponseBody responseBody) throws IOException {
        String N1;
        if (bodyEncoded(headers)) {
            b.b(this, "    Body encoded (%d bytes)", Long.valueOf(responseBody.contentLength()));
            return;
        }
        g source = responseBody.source();
        source.D0(Long.MAX_VALUE);
        e k11 = source.k();
        Charset charset = UTF8;
        MediaType contentType = responseBody.contentType();
        if (contentType != null) {
            try {
                charset = contentType.charset(charset);
            } catch (UnsupportedCharsetException unused) {
                b.b(this, "    Couldn't decode the response body; charset is likely malformed.", new Object[0]);
                return;
            }
        }
        if (isPlaintext(k11) && responseBody.contentLength() != 0) {
            int length = k11.clone().N1(charset).length();
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11 + 4000;
                int min = Math.min(length, i12);
                b.b(this, "    " + N1.substring(i11, min), new Object[0]);
                i11 = i12;
            }
            return;
        }
        b.b(this, "    Binary body (%d bytes)", Long.valueOf(k11.E()));
    }

    @Override // com.squareup.okhttp.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request logRequest = logRequest(chain.request());
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Response proceed = chain.proceed(logRequest);
            logResponse(proceed, System.currentTimeMillis() - currentTimeMillis);
            return proceed;
        } catch (Exception e11) {
            b.t(this, "<-- %s %s FAILED: %s", logRequest.method(), logRequest.url(), e11.getMessage());
            throw e11;
        }
    }
}
