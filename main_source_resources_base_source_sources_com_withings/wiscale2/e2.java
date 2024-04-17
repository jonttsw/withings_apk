package com.withings.wiscale2;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: MainActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.MainActivity$requestNewPassword$1$1", f = "MainActivity.kt", l = {468}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class e2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f56024a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainActivity f56025b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(MainActivity mainActivity, qm0.d<? super e2> dVar) {
        super(2, dVar);
        this.f56025b = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new e2(this.f56025b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((e2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ch0.d R3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f56024a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            R3 = this.f56025b.R3();
            this.f56024a = 1;
            if (R3.G0(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
