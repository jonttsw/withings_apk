package com.withings.wiscale2.partner.ui;

import androidx.compose.material.c5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: PartnerIntroFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerIntroFragment$BottomSheetContent$1$2$1", f = "PartnerIntroFragment.kt", l = {130}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class m1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59161a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f59162b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(c5 c5Var, qm0.d<? super m1> dVar) {
        super(2, dVar);
        this.f59162b = c5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new m1(this.f59162b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((m1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59161a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f59161a = 1;
            if (this.f59162b.h(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
