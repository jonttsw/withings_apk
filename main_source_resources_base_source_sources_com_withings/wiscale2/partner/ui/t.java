package com.withings.wiscale2.partner.ui;

import com.google.android.gms.common.GooglePlayServicesUtil;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: PartnerActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerActivity$initViewModel$1$5", f = "PartnerActivity.kt", l = {218}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class t extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59209a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f59210b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ f2 f59211c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PartnerActivity f59212d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f59213a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PartnerActivity f59214b;

        a(CoroutineScope coroutineScope, PartnerActivity partnerActivity) {
            this.f59213a = coroutineScope;
            this.f59214b = partnerActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            Object a11;
            if (((Boolean) obj).booleanValue()) {
                try {
                    a11 = Boolean.valueOf(GooglePlayServicesUtil.showErrorDialogFragment(2, this.f59214b, 4098));
                } catch (Throwable th2) {
                    a11 = nm0.l.a(th2);
                }
                Throwable b10 = nm0.k.b(a11);
                if (b10 != null) {
                    x70.b.n(b10);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(f2 f2Var, PartnerActivity partnerActivity, qm0.d<? super t> dVar) {
        super(2, dVar);
        this.f59211c = f2Var;
        this.f59212d = partnerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        t tVar = new t(this.f59211c, this.f59212d, dVar);
        tVar.f59210b = obj;
        return tVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((t) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59209a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            SharedFlow<Boolean> T0 = this.f59211c.T0();
            a aVar = new a((CoroutineScope) this.f59210b, this.f59212d);
            this.f59209a = 1;
            if (T0.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}
