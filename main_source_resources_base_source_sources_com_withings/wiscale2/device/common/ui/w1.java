package com.withings.wiscale2.device.common.ui;

import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeature;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: MedicalFeatureListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.MedicalFeatureListViewModel$togglePlatformFeature$1", f = "MedicalFeatureListActivity.kt", l = {117, 118}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class w1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f54114a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ x1 f54115b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f54116c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f54117d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(x1 x1Var, int i11, boolean z5, qm0.d<? super w1> dVar) {
        super(2, dVar);
        this.f54115b = x1Var;
        this.f54116c = i11;
        this.f54117d = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new w1(this.f54115b, this.f54116c, this.f54117d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((w1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        com.withings.wiscale2.device.common.feature.u uVar;
        Device device;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f54114a;
        x1 x1Var = this.f54115b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            SharedFlow<List<PlatformFeature>> i02 = x1Var.i0();
            this.f54114a = 1;
            obj = FlowKt.firstOrNull(i02, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        List<PlatformFeature> list = (List) obj;
        if (list == null) {
            list = kotlin.collections.i0.f76187a;
        }
        uVar = x1Var.f54121b;
        device = x1Var.f54120a;
        com.withings.wiscale2.device.common.feature.t a11 = uVar.a(device, list, null);
        this.f54114a = 2;
        if (a11.e(this.f54116c, this.f54117d, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
