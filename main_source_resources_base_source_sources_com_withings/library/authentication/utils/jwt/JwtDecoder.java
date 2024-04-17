package com.withings.library.authentication.utils.jwt;

import dp0.j;
import gl0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: JwtDecoder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/utils/jwt/JwtDecoder;", "", "()V", "Companion", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class JwtDecoder {
    public static final Companion Companion = new Companion(null);

    /* compiled from: JwtDecoder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/utils/jwt/JwtDecoder$Companion;", "", "()V", "getPayload", "", "jwtToken", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final String getPayload(String jwtToken) {
            u.j(jwtToken, "jwtToken");
            return e.a((String) j.o(jwtToken, new String[]{"."}).get(1));
        }

        private Companion() {
        }
    }
}
