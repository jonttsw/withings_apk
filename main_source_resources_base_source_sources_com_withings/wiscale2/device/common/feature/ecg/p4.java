package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeature;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$activateEcgFeature$1$1", f = "EcgActivationViewModel.kt", l = {679}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class p4 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f51628a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o4 f51629b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<PlatformFeature> f51630c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(o4 o4Var, List<PlatformFeature> list, qm0.d<? super p4> dVar) {
        super(2, dVar);
        this.f51629b = o4Var;
        this.f51630c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new p4(this.f51629b, this.f51630c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((p4) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        com.withings.wiscale2.device.common.feature.u uVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f51628a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            o4 o4Var = this.f51629b;
            uVar = o4Var.f51559f;
            Device device = o4Var.f51554a;
            List<PlatformFeature> features = this.f51630c;
            kotlin.jvm.internal.u.i(features, "$features");
            com.withings.wiscale2.device.common.feature.t a11 = uVar.a(device, features, null);
            this.f51628a = 1;
            if (a11.e(4, true, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
