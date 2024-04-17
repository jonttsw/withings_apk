package com.withings.authentication.userCreation;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: UserCreationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.userCreation.UserCreationViewModel$updateAccountUnits$1", f = "UserCreationViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UserCreationViewModel f32501a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f32502b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f32503c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UserCreationViewModel userCreationViewModel, int i11, int i12, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f32501a = userCreationViewModel;
        this.f32502b = i11;
        this.f32503c = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new c(this.f32501a, this.f32502b, this.f32503c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        l70.u e11;
        l70.u b10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        UserCreationViewModel userCreationViewModel = this.f32501a;
        om.a value = userCreationViewModel.y0().getValue();
        int i11 = this.f32502b;
        if (value == null || (b10 = value.b()) == null || b10.j() != i11) {
            userCreationViewModel.y0().E(i11);
        }
        om.a value2 = userCreationViewModel.y0().getValue();
        int i12 = this.f32503c;
        if (value2 == null || (e11 = value2.e()) == null || e11.j() != i12) {
            userCreationViewModel.y0().G(i12);
        }
        return y.f85009a;
    }
}
