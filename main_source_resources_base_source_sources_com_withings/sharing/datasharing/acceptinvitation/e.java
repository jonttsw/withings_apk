package com.withings.sharing.datasharing.acceptinvitation;

import com.withings.sharing.datasharing.acceptinvitation.b;
import com.withings.sharing.datasharing.acceptinvitation.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AcceptInvitationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.sharing.datasharing.acceptinvitation.AcceptInvitationViewModel$acceptInvitation$1", f = "AcceptInvitationViewModel.kt", l = {63, 64}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class e extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f44074a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AcceptInvitationViewModel f44075b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d.a f44076c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AcceptInvitationViewModel acceptInvitationViewModel, d.a aVar, qm0.d<? super e> dVar) {
        super(2, dVar);
        this.f44075b = acceptInvitationViewModel;
        this.f44076c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new e(this.f44075b, this.f44076c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        v40.a aVar;
        MutableSharedFlow mutableSharedFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f44074a;
        AcceptInvitationViewModel acceptInvitationViewModel = this.f44075b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    l.b(obj);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.b(obj);
        } else {
            l.b(obj);
            mutableStateFlow = acceptInvitationViewModel.f44008b;
            d.a aVar2 = this.f44076c;
            mutableStateFlow.setValue(d.a.a(aVar2));
            aVar = acceptInvitationViewModel.f44007a;
            aVar2.getClass();
            this.f44074a = 1;
            if (aVar.d(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        mutableSharedFlow = acceptInvitationViewModel.f44010d;
        b.a aVar3 = new b.a();
        this.f44074a = 2;
        if (mutableSharedFlow.emit(aVar3, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return y.f85009a;
    }
}
