package com.withings.wiscale2.partner.ui;

import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartnerActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerViewModel$resolveSamsungHealthPermissions$1", f = "PartnerActivity.kt", l = {443, 447, 454}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class j2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    f2 f59128a;

    /* renamed from: b  reason: collision with root package name */
    int f59129b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ f2 f59130c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(f2 f2Var, qm0.d<? super j2> dVar) {
        super(2, dVar);
        this.f59130c = f2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new j2(this.f59130c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((j2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0011, B:63:0x0114, B:14:0x0023, B:40:0x0098, B:42:0x00a1, B:47:0x00ad, B:48:0x00b0, B:50:0x00bc, B:51:0x00c7, B:53:0x00cd, B:55:0x00d5, B:56:0x00d9, B:57:0x00dd, B:59:0x00e3, B:60:0x00fe, B:17:0x002a, B:24:0x0041, B:26:0x004f, B:27:0x0051, B:28:0x005c, B:30:0x0062, B:32:0x006a, B:33:0x006e, B:34:0x0077, B:36:0x007d, B:37:0x008d, B:20:0x0031), top: B:73:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0121  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.partner.ui.j2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
