package com.withings.sharing.datasharing.acceptinvitation;

import com.withings.measurement.model.Biomarker;
import com.withings.sharing.datasharing.acceptinvitation.d;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AcceptInvitationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.sharing.datasharing.acceptinvitation.AcceptInvitationViewModel$loadInvitation$1", f = "AcceptInvitationViewModel.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class f extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f44077a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AcceptInvitationViewModel f44078b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f44079c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AcceptInvitationViewModel acceptInvitationViewModel, String str, qm0.d<? super f> dVar) {
        super(2, dVar);
        this.f44078b = acceptInvitationViewModel;
        this.f44079c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new f(this.f44078b, this.f44079c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        v40.a aVar;
        Object a11;
        MutableStateFlow mutableStateFlow2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f44077a;
        AcceptInvitationViewModel acceptInvitationViewModel = this.f44078b;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
                a11 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            mutableStateFlow = acceptInvitationViewModel.f44008b;
            mutableStateFlow.setValue(d.b.f44073a);
            aVar = acceptInvitationViewModel.f44007a;
            this.f44077a = 1;
            a11 = aVar.a(this);
            if (a11 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        w40.a aVar2 = (w40.a) a11;
        mutableStateFlow2 = acceptInvitationViewModel.f44008b;
        mutableStateFlow2.setValue(new d.a(this.f44079c, false, aVar2.b(), aVar2.a(), x.W(Biomarker.f41857g, Biomarker.f41853c, Biomarker.f41854d, Biomarker.f41852b, Biomarker.f41855e, Biomarker.f41856f, Biomarker.f41858h, Biomarker.f41859i), 0, true));
        return y.f85009a;
    }
}
