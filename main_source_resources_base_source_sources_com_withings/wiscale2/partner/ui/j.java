package com.withings.wiscale2.partner.ui;

import android.content.Context;
import com.withings.partner.model.Partner;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GoogleFitSignUpFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.GoogleFitSignUpFragment$showPartnerActions$2$1$1$1", f = "GoogleFitSignUpFragment.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class j extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59120a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i f59121b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, qm0.d<? super j> dVar) {
        super(2, dVar);
        this.f59121b = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new j(this.f59121b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((j) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59120a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            i iVar = this.f59121b;
            t10.e v12 = i.v1(iVar);
            Context requireContext = iVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            long q11 = i.w1(iVar).q();
            Partner u12 = i.u1(iVar);
            this.f59120a = 1;
            if (v12.j(q11, requireContext, u12, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
