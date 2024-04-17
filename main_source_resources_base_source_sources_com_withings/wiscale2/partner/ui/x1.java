package com.withings.wiscale2.partner.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.k;
/* compiled from: PartnerIntroFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerIntroFragment$requestAssociatePartner$1", f = "PartnerIntroFragment.kt", l = {ConstantsWs.WS_STATUS_WRONGDEVICETYPE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class x1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59239a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f59240b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1 f59241c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerIntroFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerIntroFragment$requestAssociatePartner$1$1$1", f = "PartnerIntroFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super String>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1 f59242a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k1 k1Var, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f59242a = k1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f59242a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super String> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            k1 k1Var = this.f59242a;
            Context requireContext = k1Var.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            Partner B1 = k1Var.B1();
            vf.c cVar = k1Var.f59139k;
            if (cVar != null) {
                m70.i iVar = k1Var.f59141m;
                if (iVar != null) {
                    AccountSessionRepository accountSessionRepository = k1Var.f59138j;
                    if (accountSessionRepository != null) {
                        return new vh0.b(requireContext, B1, cVar, iVar, accountSessionRepository).call();
                    }
                    kotlin.jvm.internal.u.s("accountSessionRepository");
                    throw null;
                }
                kotlin.jvm.internal.u.s("userManager");
                throw null;
            }
            kotlin.jvm.internal.u.s("accountManager");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(k1 k1Var, qm0.d<? super x1> dVar) {
        super(2, dVar);
        this.f59241c = k1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        x1 x1Var = new x1(this.f59241c, dVar);
        x1Var.f59240b = obj;
        return x1Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((x1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59239a;
        k1 k1Var = this.f59241c;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f59240b;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(k1Var, null);
                this.f59239a = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            a11 = (String) obj;
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (!(a11 instanceof k.a)) {
            k1Var.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse((String) a11)));
            k1Var.requireActivity().finish();
        }
        if (nm0.k.b(a11) != null) {
            Toast.makeText(k1Var.requireContext(), (int) C1987R.string._ERROR_CONNECTION_TIMEOUT_, 0).show();
        }
        return nm0.y.f85009a;
    }
}
