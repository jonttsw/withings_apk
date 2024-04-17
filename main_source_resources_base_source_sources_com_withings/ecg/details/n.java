package com.withings.ecg.details;

import android.content.Context;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.medicalreport.ui.MedicalReportActivity;
import com.withings.user.core.models.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgDetailsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgDetailsFragment$initShareButton$1$2$1", f = "EcgDetailsFragment.kt", l = {ConstantsWs.WS_STATUS_WRONGASSOCNAME}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class n extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38267a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f38268b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g gVar, qm0.d<? super n> dVar) {
        super(2, dVar);
        this.f38268b = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new n(this.f38268b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((n) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38267a;
        g gVar = this.f38268b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            b0 b0Var = gVar.f38210p;
            if (b0Var != null) {
                SharedFlow<User> X0 = b0Var.X0();
                this.f38267a = 1;
                obj = FlowKt.first(X0, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                kotlin.jvm.internal.u.s("viewModel");
                throw null;
            }
        }
        User user = (User) obj;
        if (user != null) {
            MedicalReportActivity.a aVar = MedicalReportActivity.f42172p;
            Context requireContext = gVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            String first = user.getNames().getFirst();
            String last = user.getNames().getLast();
            aVar.getClass();
            gVar.startActivity(MedicalReportActivity.a.a(requireContext, first, last));
        }
        return nm0.y.f85009a;
    }
}
