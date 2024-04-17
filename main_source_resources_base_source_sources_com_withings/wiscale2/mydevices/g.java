package com.withings.wiscale2.mydevices;

import k1.r0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyDevicesFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.mydevices.MyDevicesFragment$MyDeviceScreen$1", f = "MyDevicesFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class g extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ vi.o f58658a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r0<fl.o> f58659b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<Boolean> f58660c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(vi.o oVar, r0<fl.o> r0Var, r0<Boolean> r0Var2, qm0.d<? super g> dVar) {
        super(2, dVar);
        this.f58658a = oVar;
        this.f58659b = r0Var;
        this.f58660c = r0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new g(this.f58658a, this.f58659b, this.f58660c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((g) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        vi.o oVar = this.f58658a;
        if (oVar != null) {
            int a11 = new mj.b(oVar).a();
            if (a11 == -1) {
                return y.f85009a;
            }
            fl.o j5 = fl.p.f67672b.a().j(a11);
            if (j5 == null) {
                return y.f85009a;
            }
            int i11 = q.f58662l;
            this.f58659b.setValue(j5);
            this.f58660c.setValue(Boolean.TRUE);
        }
        return y.f85009a;
    }
}
