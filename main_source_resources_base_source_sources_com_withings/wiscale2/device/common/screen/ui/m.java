package com.withings.wiscale2.device.common.screen.ui;

import android.content.Context;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ScreenSelectionActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionActivity$onCreate$2$1$7", f = "ScreenSelectionActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class m extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScreenSelectionActivity f53388a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f53389b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f53390c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f53391a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<String> f53392b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, k1.r0<String> r0Var) {
            super(0);
            this.f53391a = context;
            this.f53392b = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f53392b.setValue(this.f53391a.getString(C1987R.string.scaleCustomization_lastBodyCompWarning));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ScreenSelectionActivity screenSelectionActivity, Context context, k1.r0<String> r0Var, qm0.d<? super m> dVar) {
        super(2, dVar);
        this.f53388a = screenSelectionActivity;
        this.f53389b = context;
        this.f53390c = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new m(this.f53388a, this.f53389b, this.f53390c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((m) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        ScreenSelectionActivity screenSelectionActivity = this.f53388a;
        ScreenSelectionActivity.D3(screenSelectionActivity).M0().v(screenSelectionActivity, new a(this.f53389b, this.f53390c));
        return nm0.y.f85009a;
    }
}
