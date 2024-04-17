package com.withings.wiscale2.device.common.feature.ecg;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: WBS08EcgActivationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationActivity$showSupportScreen$1", f = "WBS08EcgActivationActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class ra extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f51704a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f51705b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f51706c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f51707d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WBS08EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<androidx.navigation.b0, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f51708a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final nm0.y invoke(androidx.navigation.b0 b0Var) {
            androidx.navigation.b0 navigate = b0Var;
            kotlin.jvm.internal.u.j(navigate, "$this$navigate");
            navigate.d("Loading", qa.f51676a);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(r8.n nVar, int i11, int i12, String str, qm0.d<? super ra> dVar) {
        super(2, dVar);
        this.f51704a = nVar;
        this.f51705b = i11;
        this.f51706c = i12;
        this.f51707d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new ra(this.f51704a, this.f51705b, this.f51706c, this.f51707d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((ra) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        String screenLog = this.f51707d;
        kotlin.jvm.internal.u.j(screenLog, "screenLog");
        this.f51704a.J("Support/" + this.f51705b + "/" + this.f51706c + "/" + screenLog, a.f51708a);
        return nm0.y.f85009a;
    }
}
