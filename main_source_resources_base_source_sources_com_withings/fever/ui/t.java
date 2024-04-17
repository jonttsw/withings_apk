package com.withings.fever.ui;

import java.util.List;
/* compiled from: BodyTemperatureScreen.kt */
/* loaded from: classes3.dex */
final class t extends kotlin.jvm.internal.w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.p0<k1.r0<Boolean>> f39410a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<List<as.h>> f39411b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ at.a f39412c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(k1.r0 r0Var, at.a aVar, kotlin.jvm.internal.p0 p0Var) {
        super(0);
        this.f39410a = p0Var;
        this.f39411b = r0Var;
        this.f39412c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (r1 < 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
        if (r1 < 0) goto L13;
     */
    @Override // ym0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer invoke() {
        /*
            r8 = this;
            kotlin.jvm.internal.p0<k1.r0<java.lang.Boolean>> r0 = r8.f39410a
            T r0 = r0.f76257a
            k1.r0 r0 = (k1.r0) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = -1
            at.a r2 = r8.f39412c
            k1.r0<java.util.List<as.h>> r3 = r8.f39411b
            r4 = 0
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r3.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
            r5 = r4
        L23:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L48
            java.lang.Object r6 = r0.next()
            as.h r6 = (as.h) r6
            org.joda.time.DateTime r6 = r6.a()
            java.lang.Object r7 = r3.getValue()
            java.util.List r7 = (java.util.List) r7
            org.joda.time.DateTime r7 = as.k.a(r7, r2)
            boolean r6 = hn.a.e(r6, r7)
            if (r6 == 0) goto L45
            r1 = r5
            goto L48
        L45:
            int r5 = r5 + 1
            goto L23
        L48:
            if (r1 >= 0) goto L4b
            goto L79
        L4b:
            r4 = r1
            goto L79
        L4d:
            java.lang.Object r0 = r3.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
            r3 = r4
        L58:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L77
            java.lang.Object r5 = r0.next()
            as.h r5 = (as.h) r5
            org.joda.time.DateTime r5 = r5.a()
            org.joda.time.DateTime r6 = r2.c()
            boolean r5 = hn.a.e(r5, r6)
            if (r5 == 0) goto L74
            r1 = r3
            goto L77
        L74:
            int r3 = r3 + 1
            goto L58
        L77:
            if (r1 >= 0) goto L4b
        L79:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.fever.ui.t.invoke():java.lang.Object");
    }
}
