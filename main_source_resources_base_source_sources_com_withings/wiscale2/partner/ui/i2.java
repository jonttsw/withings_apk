package com.withings.wiscale2.partner.ui;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: PartnerActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerViewModel$partnerStateLiveData$1$1", f = "PartnerActivity.kt", l = {ConstantsWs.WS_STATUS_WRONG_SHARINGISDOCTOR, ConstantsWs.WS_STATUS_WRONG_GEOIPFORCE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class i2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59117a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Partner f59118b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ f2 f59119c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(Partner partner, f2 f2Var, qm0.d<? super i2> dVar) {
        super(2, dVar);
        this.f59118b = partner;
        this.f59119c = f2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new i2(this.f59118b, this.f59119c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((i2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59117a;
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            Partner partner = this.f59118b;
            if (partner.l() == Partner.f43456n.l()) {
                int ordinal = partner.e().ordinal();
                f2 f2Var = this.f59119c;
                if (ordinal == 8) {
                    mutableStateFlow = f2Var.f59010f;
                    Boolean bool = Boolean.TRUE;
                    this.f59117a = 1;
                    if (mutableStateFlow.emit(bool, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (ordinal == 9) {
                    mutableStateFlow2 = f2Var.f59012h;
                    Boolean bool2 = Boolean.TRUE;
                    this.f59117a = 2;
                    if (mutableStateFlow2.emit(bool2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
        }
        return nm0.y.f85009a;
    }
}
