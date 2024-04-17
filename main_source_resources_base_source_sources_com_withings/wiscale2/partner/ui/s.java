package com.withings.wiscale2.partner.ui;

import android.app.Dialog;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: PartnerActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerActivity$initViewModel$1$4", f = "PartnerActivity.kt", l = {208}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class s extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59198a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f2 f59199b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PartnerActivity f59200c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PartnerActivity f59201a;

        a(PartnerActivity partnerActivity) {
            this.f59201a = partnerActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            if (((Boolean) obj).booleanValue()) {
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                kotlin.jvm.internal.u.i(googleApiAvailability, "getInstance(...)");
                PartnerActivity partnerActivity = this.f59201a;
                Dialog errorDialog = googleApiAvailability.getErrorDialog(partnerActivity, googleApiAvailability.isGooglePlayServicesAvailable(partnerActivity), 4099);
                if (errorDialog != null) {
                    errorDialog.show();
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(f2 f2Var, PartnerActivity partnerActivity, qm0.d<? super s> dVar) {
        super(2, dVar);
        this.f59199b = f2Var;
        this.f59200c = partnerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new s(this.f59199b, this.f59200c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((s) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59198a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            SharedFlow<Boolean> U0 = this.f59199b.U0();
            a aVar = new a(this.f59200c);
            this.f59198a = 1;
            if (U0.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}
