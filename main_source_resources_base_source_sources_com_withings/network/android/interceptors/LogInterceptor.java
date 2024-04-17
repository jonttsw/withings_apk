package com.withings.network.android.interceptors;

import ah.a;
import androidx.compose.material.v;
import com.withings.network.core.LogLevel;
import dp0.j;
import en0.i;
import en0.r;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.e;
import okio.g;
import org.apache.http.protocol.HTTP;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.sasl.packet.SaslStreamElements;
import org.jivesoftware.smackx.receipts.DeliveryReceiptRequest;
import org.jivesoftware.smackx.shim.packet.HeadersExtension;
import x70.b;
/* compiled from: LogInterceptor.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/withings/network/android/interceptors/LogInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Request;", DeliveryReceiptRequest.ELEMENT, "logRequest", "(Lokhttp3/Request;)Lokhttp3/Request;", "Lokhttp3/Headers;", HeadersExtension.ELEMENT, "Lokhttp3/RequestBody;", Message.BODY, "Lnm0/y;", "logRequestBody", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", "Lokhttp3/Response;", SaslStreamElements.Response.ELEMENT, "", "callLengthInMs", "logResponse", "(Lokhttp3/Response;J)V", "Lokhttp3/ResponseBody;", "logResponseBody", "(Lokhttp3/Headers;Lokhttp3/ResponseBody;)V", "", "bodyEncoded", "(Lokhttp3/Headers;)Z", "Lokio/e;", "buffer", "isPlaintext", "(Lokio/e;)Z", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lcom/withings/network/core/LogLevel;", "logLevel", "Lcom/withings/network/core/LogLevel;", "<init>", "(Lcom/withings/network/core/LogLevel;)V", "Companion", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LogInterceptor implements Interceptor {
    @Deprecated
    public static final long CODEPOINTS_LENGTH = 4;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final int LOG_CHUNK_SIZE = 4000;
    @Deprecated
    public static final int PREFIX_NB_OF_CODEPOINT_CHECKS = 16;
    private static final Charset UTF8;
    private final LogLevel logLevel;

    /* compiled from: LogInterceptor.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withings/network/android/interceptors/LogInterceptor$Companion;", "", "()V", "CODEPOINTS_LENGTH", "", "LOG_CHUNK_SIZE", "", "PREFIX_NB_OF_CODEPOINT_CHECKS", "UTF8", "Ljava/nio/charset/Charset;", "getUTF8", "()Ljava/nio/charset/Charset;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Charset getUTF8() {
            return LogInterceptor.UTF8;
        }

        private Companion() {
        }
    }

    static {
        Charset forName = Charset.forName("UTF-8");
        u.i(forName, "forName(...)");
        UTF8 = forName;
    }

    public LogInterceptor(LogLevel logLevel) {
        u.j(logLevel, "logLevel");
        this.logLevel = logLevel;
    }

    private final boolean bodyEncoded(Headers headers) {
        String str = headers.get("Content-Encoding");
        if (str != null && !j.x(HTTP.IDENTITY_CODING, str)) {
            return true;
        }
        return false;
    }

    private final boolean isPlaintext(e eVar) {
        try {
            e eVar2 = new e();
            eVar.d(0L, eVar2, r.g(eVar.E(), 64L));
            for (int i11 = 0; i11 < 16; i11++) {
                if (eVar2.t1()) {
                    break;
                }
                int z5 = eVar2.z();
                if (Character.isISOControl(z5) && !Character.isWhitespace(z5)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    private final Request logRequest(Request request) throws IOException {
        if (this.logLevel != LogLevel.f42817a) {
            String method = request.method();
            HttpUrl url = request.url();
            b.b(this, "--> " + method + " " + url, new Object[0]);
            RequestBody body = request.body();
            if (body != null) {
                logRequestBody(request.headers(), body);
            }
            b.b(this, "--> END", new Object[0]);
        }
        return request;
    }

    private final void logRequestBody(Headers headers, RequestBody requestBody) throws IOException {
        Charset charset;
        if (bodyEncoded(headers)) {
            b.b(this, a.c("    Body encoded (", requestBody.contentLength(), " bytes)"), new Object[0]);
            return;
        }
        e eVar = new e();
        requestBody.writeTo(eVar);
        MediaType contentType = requestBody.contentType();
        if (contentType == null || (charset = contentType.charset(UTF8)) == null) {
            charset = UTF8;
        }
        if (isPlaintext(eVar)) {
            String N1 = eVar.N1(charset);
            int length = N1.length();
            i u11 = r.u(r.w(0, length), LOG_CHUNK_SIZE);
            int l5 = u11.l();
            int n11 = u11.n();
            int o11 = u11.o();
            if ((o11 <= 0 || l5 > n11) && (o11 >= 0 || n11 > l5)) {
                return;
            }
            while (true) {
                int i11 = l5 + LOG_CHUNK_SIZE;
                if (length <= i11) {
                    i11 = length;
                }
                String substring = N1.substring(l5, i11);
                u.i(substring, "substring(...)");
                b.b(this, "    ".concat(substring), new Object[0]);
                if (l5 != n11) {
                    l5 += o11;
                } else {
                    return;
                }
            }
        } else {
            b.b(this, a.c("    Binary body (", requestBody.contentLength(), " bytes)"), new Object[0]);
        }
    }

    private final void logResponse(Response response, long j5) throws IOException {
        if (this.logLevel == LogLevel.f42817a) {
            return;
        }
        Request request = response.request();
        String format = String.format("(%.3f s)", Arrays.copyOf(new Object[]{Double.valueOf(j5 / 1000)}, 1));
        String method = request.method();
        HttpUrl url = request.url();
        int code = response.code();
        String message = response.message();
        StringBuilder sb2 = new StringBuilder("<-- ");
        sb2.append(method);
        sb2.append(" ");
        sb2.append(url);
        sb2.append(" ");
        v.c(sb2, code, " ", message, " ");
        sb2.append(format);
        b.b(this, sb2.toString(), new Object[0]);
        ResponseBody body = response.body();
        if (body != null) {
            logResponseBody(response.headers(), body);
        }
        b.b(this, "<-- END", new Object[0]);
    }

    private final void logResponseBody(Headers headers, ResponseBody responseBody) throws IOException {
        Charset charset;
        if (this.logLevel == LogLevel.f42817a) {
            return;
        }
        if (bodyEncoded(headers)) {
            b.b(this, a.c("    Body encoded (", responseBody.contentLength(), " bytes)"), new Object[0]);
            return;
        }
        g source = responseBody.source();
        source.D0(Long.MAX_VALUE);
        e buffer = source.getBuffer();
        try {
            MediaType contentType = responseBody.contentType();
            if (contentType == null || (charset = contentType.charset(UTF8)) == null) {
                charset = UTF8;
            }
            if (isPlaintext(buffer) && responseBody.contentLength() != 0) {
                String N1 = buffer.clone().N1(charset);
                int length = N1.length();
                i u11 = r.u(r.w(0, length), LOG_CHUNK_SIZE);
                int l5 = u11.l();
                int n11 = u11.n();
                int o11 = u11.o();
                if ((o11 <= 0 || l5 > n11) && (o11 >= 0 || n11 > l5)) {
                    return;
                }
                while (true) {
                    int i11 = l5 + LOG_CHUNK_SIZE;
                    if (length <= i11) {
                        i11 = length;
                    }
                    String substring = N1.substring(l5, i11);
                    u.i(substring, "substring(...)");
                    b.b(this, "    ".concat(substring), new Object[0]);
                    if (l5 != n11) {
                        l5 += o11;
                    } else {
                        return;
                    }
                }
            } else {
                b.b(this, a.c("    Binary body (", buffer.E(), " bytes)"), new Object[0]);
            }
        } catch (UnsupportedCharsetException unused) {
            b.b(this, "    Couldn't decode the response body; charset is likely malformed.", new Object[0]);
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        u.j(chain, "chain");
        Request logRequest = logRequest(chain.request());
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Response proceed = chain.proceed(logRequest);
            logResponse(proceed, System.currentTimeMillis() - currentTimeMillis);
            return proceed;
        } catch (Exception e11) {
            String method = logRequest.method();
            HttpUrl url = logRequest.url();
            String message = e11.getMessage();
            b.t(this, "<-- " + method + " " + url + " FAILED: " + message, new Object[0]);
            throw e11;
        }
    }
}
