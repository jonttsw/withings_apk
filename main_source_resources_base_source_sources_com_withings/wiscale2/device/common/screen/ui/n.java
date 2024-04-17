package com.withings.wiscale2.device.common.screen.ui;

import android.content.Context;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ScreenSelectionActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionActivity$onCreate$2$1$8", f = "ScreenSelectionActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class n extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScreenSelectionActivity f53395a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f53396b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f53397c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f53398a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScreenSelectionActivity f53399b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<String> f53400c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, ScreenSelectionActivity screenSelectionActivity, k1.r0<String> r0Var) {
            super(0);
            this.f53398a = context;
            this.f53399b = screenSelectionActivity;
            this.f53400c = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f53400c.setValue(this.f53398a.getString(C1987R.string.dialogMaxScreenCount_content, Integer.valueOf(ScreenSelectionActivity.D3(this.f53399b).R0())));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ScreenSelectionActivity screenSelectionActivity, Context context, k1.r0<String> r0Var, qm0.d<? super n> dVar) {
        super(2, dVar);
        this.f53395a = screenSelectionActivity;
        this.f53396b = context;
        this.f53397c = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new n(this.f53395a, this.f53396b, this.f53397c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((n) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        ScreenSelectionActivity screenSelectionActivity = this.f53395a;
        ScreenSelectionActivity.D3(screenSelectionActivity).T0().v(screenSelectionActivity, new a(this.f53396b, screenSelectionActivity, this.f53397c));
        return nm0.y.f85009a;
    }
}
