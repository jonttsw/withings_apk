package com.withings.wiscale2.vascularage;

import android.widget.Toast;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: VascularAgeActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeActivity$onCreate$1$1$1$1", f = "VascularAgeActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class j extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VascularAgeActivity f62328a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeActivity$onCreate$1$1$1$1$1", f = "VascularAgeActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<c, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VascularAgeActivity f62329a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(VascularAgeActivity vascularAgeActivity, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f62329a = vascularAgeActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f62329a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(c cVar, qm0.d<? super nm0.y> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            VascularAgeActivity vascularAgeActivity = this.f62329a;
            Toast.makeText(vascularAgeActivity.getApplicationContext(), (int) C1987R.string._WTA_GENERIC_ERROR_TITLE_, 1).show();
            vascularAgeActivity.finish();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(VascularAgeActivity vascularAgeActivity, qm0.d<? super j> dVar) {
        super(2, dVar);
        this.f62328a = vascularAgeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new j(this.f62328a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((j) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        VascularAgeActivity vascularAgeActivity = this.f62328a;
        FlowKt.launchIn(FlowKt.onEach(VascularAgeActivity.B3(vascularAgeActivity).U0(), new a(vascularAgeActivity, null)), m0.t.l(vascularAgeActivity));
        return nm0.y.f85009a;
    }
}
