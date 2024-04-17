package com.withings.webservices.legacy.common.exception;

import com.google.gson.GsonBuilder;
import com.withings.webservices.legacy.common.exception.WrongStatusException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.k;
import nm0.l;
import org.jivesoftware.smack.sasl.packet.SaslStreamElements;
/* compiled from: AlreadyExistsException.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/withings/webservices/legacy/common/exception/AlreadyExistsException;", "Lcom/withings/webservices/legacy/common/exception/WrongStatusException$Checked;", "url", "", "conversion", "Lcom/withings/webservices/legacy/common/exception/WrongStatusException$Conversion;", SaslStreamElements.Response.ELEMENT, "Lcom/withings/webservices/legacy/common/exception/Response;", "(Ljava/lang/String;Lcom/withings/webservices/legacy/common/exception/WrongStatusException$Conversion;Lcom/withings/webservices/legacy/common/exception/Response;)V", "getResponse", "()Lcom/withings/webservices/legacy/common/exception/Response;", "Companion", "webservices-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AlreadyExistsException extends WrongStatusException.Checked {
    public static final Companion Companion = new Companion(null);
    private final Response response;

    /* compiled from: AlreadyExistsException.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/withings/webservices/legacy/common/exception/AlreadyExistsException$Companion;", "", "()V", "fromWrongStatusException", "Lcom/withings/webservices/legacy/common/exception/WrongStatusException$Checked;", "url", "", "conversionException", "Lcom/withings/webservices/legacy/common/exception/WrongStatusException$Conversion;", "webservices-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final WrongStatusException.Checked fromWrongStatusException(String url, WrongStatusException.Conversion conversionException) {
            Object a11;
            u.j(url, "url");
            u.j(conversionException, "conversionException");
            try {
                Object fromJson = new GsonBuilder().create().fromJson(conversionException.getBody(), (Class<Object>) Response.class);
                u.i(fromJson, "fromJson(...)");
                a11 = new AlreadyExistsException(url, conversionException, (Response) fromJson);
            } catch (Throwable th2) {
                a11 = l.a(th2);
            }
            if (a11 instanceof k.a) {
                a11 = null;
            }
            AlreadyExistsException alreadyExistsException = (AlreadyExistsException) a11;
            if (alreadyExistsException == null) {
                return new WrongStatusException.Checked(url, conversionException);
            }
            return alreadyExistsException;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AlreadyExistsException(String str, WrongStatusException.Conversion conversion, Response response, int i11, m mVar) {
        this(str, conversion, (i11 & 4) != 0 ? null : response);
    }

    public static final WrongStatusException.Checked fromWrongStatusException(String str, WrongStatusException.Conversion conversion) {
        return Companion.fromWrongStatusException(str, conversion);
    }

    public final Response getResponse() {
        return this.response;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlreadyExistsException(String url, WrongStatusException.Conversion conversion, Response response) {
        super(url, conversion);
        u.j(url, "url");
        u.j(conversion, "conversion");
        this.response = response;
    }
}
