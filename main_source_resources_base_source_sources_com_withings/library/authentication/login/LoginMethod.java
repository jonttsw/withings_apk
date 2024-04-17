package com.withings.library.authentication.login;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: LoginMethod.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/withings/library/authentication/login/LoginMethod;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", "SHORTCODE", "UNKNOWN", "Lcom/withings/library/authentication/login/LoginMethod$SHORTCODE;", "Lcom/withings/library/authentication/login/LoginMethod$UNKNOWN;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class LoginMethod {
    public static final Companion Companion = new Companion(null);
    private final String value;

    /* compiled from: LoginMethod.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/LoginMethod$Companion;", "", "()V", "fromValue", "Lcom/withings/library/authentication/login/LoginMethod;", "value", "", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final LoginMethod fromValue(String value) {
            u.j(value, "value");
            SHORTCODE shortcode = SHORTCODE.INSTANCE;
            if (!u.e(value, shortcode.getValue())) {
                return UNKNOWN.INSTANCE;
            }
            return shortcode;
        }

        private Companion() {
        }
    }

    /* compiled from: LoginMethod.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/login/LoginMethod$SHORTCODE;", "Lcom/withings/library/authentication/login/LoginMethod;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SHORTCODE extends LoginMethod {
        public static final SHORTCODE INSTANCE = new SHORTCODE();

        private SHORTCODE() {
            super("shortcode", null);
        }
    }

    /* compiled from: LoginMethod.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/login/LoginMethod$UNKNOWN;", "Lcom/withings/library/authentication/login/LoginMethod;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UNKNOWN extends LoginMethod {
        public static final UNKNOWN INSTANCE = new UNKNOWN();

        private UNKNOWN() {
            super("unknown", null);
        }
    }

    public /* synthetic */ LoginMethod(String str, m mVar) {
        this(str);
    }

    public final String getValue() {
        return this.value;
    }

    private LoginMethod(String str) {
        this.value = str;
    }
}
