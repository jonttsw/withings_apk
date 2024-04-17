package com.withings.wiscale2.user.ui;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditUserMeasureActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.EditUserMeasureViewModel$createUser$1", f = "EditUserMeasureActivity.kt", l = {ConstantsWs.WS_STATUS_WRONGSESSIONDURATION, ConstantsWs.WS_STATUS_WRONGVERSION}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class v extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    User f62133a;

    /* renamed from: b  reason: collision with root package name */
    int f62134b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f62135c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ w f62136d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f62137e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ double f62138f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, int i11, double d11, qm0.d<? super v> dVar) {
        super(2, dVar);
        this.f62136d = wVar;
        this.f62137e = i11;
        this.f62138f = d11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        v vVar = new v(this.f62136d, this.f62137e, this.f62138f, dVar);
        vVar.f62135c = obj;
        return vVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((v) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.user.ui.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
