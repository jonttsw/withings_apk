package com.withings.wiscale2.partner.ui;

import android.content.Context;
import android.widget.Toast;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.user.User;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import t10.e;
/* compiled from: PartnerIntroFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerIntroFragment$unregisterPartner$1", f = "PartnerIntroFragment.kt", l = {ConstantsWs.WS_STATUS_WRONGDEVTYPE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class a2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f58901a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1 f58902b;

    /* compiled from: PartnerIntroFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1 f58903a;

        /* compiled from: PartnerIntroFragment.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerIntroFragment$unregisterPartner$1$1$onFailedToUnregisteredPartner$1", f = "PartnerIntroFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.withings.wiscale2.partner.ui.a2$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0764a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k1 f58904a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Throwable f58905b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0764a(k1 k1Var, Throwable th2, qm0.d<? super C0764a> dVar) {
                super(2, dVar);
                this.f58904a = k1Var;
                this.f58905b = th2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new C0764a(this.f58904a, this.f58905b, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                return ((C0764a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                Toast.makeText(this.f58904a.requireContext(), (int) C1987R.string._ERROR_CONNECTION_TIMEOUT_, 0).show();
                String message = this.f58905b.getMessage();
                if (message == null) {
                    message = "";
                }
                Fail.j(message);
                return nm0.y.f85009a;
            }
        }

        /* compiled from: PartnerIntroFragment.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerIntroFragment$unregisterPartner$1$1$onUnregisteredPartner$1", f = "PartnerIntroFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k1 f58906a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(k1 k1Var, qm0.d<? super b> dVar) {
                super(2, dVar);
                this.f58906a = k1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new b(this.f58906a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                k1 k1Var = this.f58906a;
                Toast.makeText(k1Var.requireContext(), (int) C1987R.string._MODIF_OK_TEXT_, 0).show();
                k1Var.requireActivity().onBackPressed();
                return nm0.y.f85009a;
            }
        }

        a(k1 k1Var) {
            this.f58903a = k1Var;
        }

        @Override // t10.e.b
        public final void a(Partner partner) {
            k1 k1Var = this.f58903a;
            BuildersKt__Builders_commonKt.launch$default(m0.t.l(k1Var), Dispatchers.getMain(), null, new b(k1Var, null), 2, null);
        }

        @Override // t10.e.b
        public final void b(Throwable th2) {
            k1 k1Var = this.f58903a;
            BuildersKt__Builders_commonKt.launch$default(m0.t.l(k1Var), Dispatchers.getMain(), null, new C0764a(k1Var, th2, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(k1 k1Var, qm0.d<? super a2> dVar) {
        super(2, dVar);
        this.f58902b = k1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new a2(this.f58902b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((a2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f58901a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            k1 k1Var = this.f58902b;
            t10.e eVar = k1Var.f59140l;
            if (eVar != null) {
                Context requireContext = k1Var.requireContext();
                kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
                User A1 = k1.A1(k1Var);
                Partner B1 = k1Var.B1();
                a aVar = new a(k1Var);
                this.f58901a = 1;
                if (eVar.p(requireContext, A1, B1, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                kotlin.jvm.internal.u.s("partnerManager");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
