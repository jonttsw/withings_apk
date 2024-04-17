package com.withings.wiscale2.partner.ui;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.withings.partner.exchanges.google.healthconnect.HealthConnect;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: PartnerExchangesFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerExchangesFragment$HealthConnectPermissionInterfaceLauncher$1$1$2$1$1", f = "PartnerExchangesFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class i0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Object f59112a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e.n<Intent, ActivityResult> f59113b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(e.n<Intent, ActivityResult> nVar, qm0.d<? super i0> dVar) {
        super(2, dVar);
        this.f59113b = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        i0 i0Var = new i0(this.f59113b, dVar);
        i0Var.f59112a = obj;
        return i0Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((i0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        HealthConnect.f43375a.getClass();
        x70.b.l((CoroutineScope) this.f59112a, androidx.activity.a0.b("Launching intent ", HealthConnect.e()), new Object[0]);
        HealthConnect.e.f43397a.getClass();
        HealthConnect.e.g();
        this.f59113b.a(new Intent(HealthConnect.e()));
        return nm0.y.f85009a;
    }
}
