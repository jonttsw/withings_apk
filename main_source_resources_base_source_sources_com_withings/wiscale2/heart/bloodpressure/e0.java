package com.withings.wiscale2.heart.bloodpressure;

import android.view.View;
import com.withings.device.Device;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: BloodPressureOptionSheetFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.bloodpressure.BloodPressureOptionSheetFragment$loadDeviceModelAndInitCellViews$1", f = "BloodPressureOptionSheetFragment.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class e0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57361a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d0 f57362b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ View f57363c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BloodPressureOptionSheetFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.bloodpressure.BloodPressureOptionSheetFragment$loadDeviceModelAndInitCellViews$1$devices$1", f = "BloodPressureOptionSheetFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super List<Device>>, Object> {
        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new kotlin.coroutines.jvm.internal.i(2, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<Device>> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            return kn.e.c().h(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(View view, d0 d0Var, qm0.d dVar) {
        super(2, dVar);
        this.f57362b = d0Var;
        this.f57363c = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new e0(this.f57363c, this.f57362b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((e0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f57361a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ?? iVar = new kotlin.coroutines.jvm.internal.i(2, null);
            this.f57361a = 1;
            obj = BuildersKt.withContext(io2, iVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        List list = (List) obj;
        kotlin.jvm.internal.u.g(list);
        boolean z5 = !list.isEmpty();
        d0 d0Var = this.f57362b;
        if (z5) {
            d0Var.f57357e = ((Device) list.get(0)).getModelId();
        }
        d0.w1(d0Var, this.f57363c);
        return nm0.y.f85009a;
    }
}
