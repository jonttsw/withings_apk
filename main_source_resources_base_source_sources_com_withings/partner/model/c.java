package com.withings.partner.model;

import android.content.Context;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import u10.a0;
/* compiled from: Partner.kt */
/* loaded from: classes4.dex */
public final class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Partner.kt */
    @e(c = "com.withings.partner.model.PartnerKt", f = "Partner.kt", l = {ConstantsWs.WS_STATUS_EXPIRED_CREATION_TOKEN}, m = CervicalMucusRecord.Appearance.CLEAR)
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Partner f43534a;

        /* renamed from: b  reason: collision with root package name */
        a0 f43535b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f43536c;

        /* renamed from: d  reason: collision with root package name */
        int f43537d;

        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43536c = obj;
            this.f43537d |= Integer.MIN_VALUE;
            return c.a(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Partner.kt */
    @e(c = "com.withings.partner.model.PartnerKt", f = "Partner.kt", l = {ConstantsWs.WS_STATUS_PAYMENT_FAILED, ConstantsWs.WS_STATUS_UNAUTHORIZED_PASSWORD, ConstantsWs.WS_STATUS_INVALID_PASSWORD_NO_DIGIT}, m = "init")
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Partner f43538a;

        /* renamed from: b  reason: collision with root package name */
        Context f43539b;

        /* renamed from: c  reason: collision with root package name */
        t10.e f43540c;

        /* renamed from: d  reason: collision with root package name */
        long f43541d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f43542e;

        /* renamed from: f  reason: collision with root package name */
        int f43543f;

        b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43542e = obj;
            this.f43543f |= Integer.MIN_VALUE;
            return c.d(null, null, 0L, false, false, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.withings.partner.model.Partner r11, android.content.Context r12, java.lang.String r13, u10.a0 r14, qm0.d<? super nm0.y> r15) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.model.c.a(com.withings.partner.model.Partner, android.content.Context, java.lang.String, u10.a0, qm0.d):java.lang.Object");
    }

    public static final DateTime b(Partner partner) {
        Long u11;
        u.j(partner, "<this>");
        Long m11 = partner.m();
        if (m11 != null) {
            u11 = Long.valueOf(m11.longValue() * 1000);
        } else {
            u11 = partner.u();
        }
        return new DateTime(u11);
    }

    public static final boolean c(Partner partner) {
        u.j(partner, "<this>");
        if (partner.l() == Partner.f43457o.l()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0139 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v9, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.withings.partner.model.Partner r12, android.content.Context r13, long r14, boolean r16, boolean r17, t10.e r18, qm0.d<? super nm0.y> r19) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.model.c.d(com.withings.partner.model.Partner, android.content.Context, long, boolean, boolean, t10.e, qm0.d):java.lang.Object");
    }
}
