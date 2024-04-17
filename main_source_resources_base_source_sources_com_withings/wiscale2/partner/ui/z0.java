package com.withings.wiscale2.partner.ui;

import android.content.Context;
import com.samsung.android.sdk.healthdata.HealthDataStore;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: PartnerExchangesFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerExchangesFragmentKt$hasSamsungPermission$2", f = "PartnerExchangesFragment.kt", l = {ConstantsWs.WS_STATUS_WRONG_FILENAME}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class z0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    y10.a f59255a;

    /* renamed from: b  reason: collision with root package name */
    int f59256b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ y10.a f59257c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f59258d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, y10.a aVar, qm0.d dVar) {
        super(2, dVar);
        this.f59257c = aVar;
        this.f59258d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new z0(this.f59258d, this.f59257c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Boolean> dVar) {
        return ((z0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        boolean z5;
        y10.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59256b;
        try {
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (i11 != 0) {
            if (i11 == 1) {
                aVar = this.f59255a;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            y10.a aVar2 = this.f59257c;
            aVar2.getClass();
            Context context = this.f59258d;
            kotlin.jvm.internal.u.j(context, "context");
            if (u70.e.a(context, Partner.f43461s.d(), null) != null) {
                this.f59255a = aVar2;
                this.f59256b = 1;
                Object e11 = y10.d.e(context, this);
                if (e11 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar = aVar2;
                obj = e11;
            } else {
                z5 = false;
                return Boolean.valueOf(z5);
            }
        }
        a11 = Boolean.valueOf(y10.d.d((HealthDataStore) obj, aVar.q()));
        if (nm0.k.b(a11) != null) {
            a11 = Boolean.FALSE;
        }
        z5 = ((Boolean) a11).booleanValue();
        return Boolean.valueOf(z5);
    }
}
