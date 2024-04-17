package com.withings.wiscale2.profile;

import android.content.Context;
import com.withings.partner.ws.PartnerRemoteRepository;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.ProfileViewModel$syncPartnerAndDeviceScreens$1", f = "ProfileViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class a1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y0 f59282a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(y0 y0Var, qm0.d<? super a1> dVar) {
        super(2, dVar);
        this.f59282a = y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new a1(this.f59282a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((a1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        oi0.b bVar;
        Context context;
        t10.e eVar;
        PartnerRemoteRepository partnerRemoteRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        y0 y0Var = this.f59282a;
        bVar = y0Var.f59498e;
        context = y0Var.f59495b;
        User user = y0Var.f59494a;
        eVar = y0Var.f59496c;
        partnerRemoteRepository = y0Var.f59497d;
        bVar.j(new vh0.f(context, user, eVar, partnerRemoteRepository, false), "syncAfterPartnerChanged", null);
        y0.p0(y0Var);
        return nm0.y.f85009a;
    }
}
