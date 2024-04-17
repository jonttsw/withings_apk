package com.withings.wiscale2.device.common.screen.ui;

import com.withings.devicescreens.model.CustomScreenMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: ScreenSelectionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$changeMode$1", f = "ScreenSelectionViewModel.kt", l = {217}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class z1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f53507a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ScreenSelectionViewModel f53508b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CustomScreenMode f53509c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(ScreenSelectionViewModel screenSelectionViewModel, CustomScreenMode customScreenMode, qm0.d<? super z1> dVar) {
        super(2, dVar);
        this.f53508b = screenSelectionViewModel;
        this.f53509c = customScreenMode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new z1(this.f53508b, this.f53509c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((z1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f53507a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            MutableSharedFlow mutableSharedFlow = this.f53508b.f53181v;
            this.f53507a = 1;
            if (mutableSharedFlow.emit(this.f53509c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
