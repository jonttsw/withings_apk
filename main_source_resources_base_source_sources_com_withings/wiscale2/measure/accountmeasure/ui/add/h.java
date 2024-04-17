package com.withings.wiscale2.measure.accountmeasure.ui.add;

import com.withings.library.measure.Measure;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AddBodyTemperatureFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddBodyTemperatureFragment$getMostRecentMeasure$2", f = "AddBodyTemperatureFragment.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class h extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Measure>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f58174a;

    /* renamed from: b  reason: collision with root package name */
    int f58175b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k f58176c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, qm0.d<? super h> dVar) {
        super(2, dVar);
        this.f58176c = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new h(this.f58176c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Measure> dVar) {
        return ((h) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        ky.a d11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i12 = this.f58175b;
        if (i12 != 0) {
            if (i12 == 1) {
                i11 = this.f58174a;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            k kVar = this.f58176c;
            fy.p pVar = kVar.G;
            if (pVar != null) {
                this.f58174a = 71;
                this.f58175b = 1;
                Object a11 = fy.p.a(pVar, kVar.getUser().q(), null, new int[]{71}, this, 54);
                if (a11 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i11 = 71;
                obj = a11;
            } else {
                kotlin.jvm.internal.u.s("getMostRecentMeasuresGroup");
                throw null;
            }
        }
        ky.d dVar = (ky.d) obj;
        if (dVar == null || (d11 = ly.a.d(i11, dVar)) == null) {
            return null;
        }
        return hy.g.d(d11, null);
    }
}
