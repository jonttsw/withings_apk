package com.withings.wiscale2.partner.ui;

import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.partner.model.Partner;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: PartnerActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerActivity$initViewModel$1$1", f = "PartnerActivity.kt", l = {191}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class p extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59179a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f2 f59180b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PartnerActivity f59181c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f2 f59182a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PartnerActivity f59183b;

        a(f2 f2Var, PartnerActivity partnerActivity) {
            this.f59182a = f2Var;
            this.f59183b = partnerActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            Partner partner;
            boolean z5;
            int i11;
            if (((Boolean) obj).booleanValue()) {
                nm0.j<Partner, d2> value = this.f59182a.O0().getValue();
                if (value != null) {
                    partner = value.c();
                } else {
                    partner = null;
                }
                boolean z11 = false;
                PartnerActivity context = this.f59183b;
                if (partner != null && partner.J(context)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (partner != null) {
                    i11 = partner.d();
                } else {
                    i11 = C1987R.string.partnerPackage_googleHealthPlatform;
                }
                kotlin.jvm.internal.u.j(context, "context");
                if (u70.e.a(context, i11, null) != null) {
                    z11 = true;
                }
                ch.d dVar2 = context.f58868k;
                if (dVar2 != null) {
                    ((ah.b) dVar2.a()).getClass();
                    Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.tutorials.ui.screens.appssync.healthconnect.HealthConnectActivationActivity").putExtra("activated", z5).putExtra("installed", z11);
                    kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
                    context.startActivity(putExtra);
                    context.finish();
                } else {
                    kotlin.jvm.internal.u.s("intentBuilder");
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f2 f2Var, PartnerActivity partnerActivity, qm0.d<? super p> dVar) {
        super(2, dVar);
        this.f59180b = f2Var;
        this.f59181c = partnerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new p(this.f59180b, this.f59181c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((p) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59179a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            f2 f2Var = this.f59180b;
            Flow<Boolean> M0 = f2Var.M0();
            a aVar = new a(f2Var, this.f59181c);
            this.f59179a = 1;
            if (M0.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
