package com.withings.authentication.mfa.resolve;

import com.withings.account.models.TwoFactorAuthentication;
import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.authentication.mfa.resolve.a;
import com.withings.authentication.mfa.resolve.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MfaResolutionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.resolve.MfaResolutionViewModel$1", f = "MfaResolutionViewModel.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    MfaResolutionViewModel f32050a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList f32051b;

    /* renamed from: c  reason: collision with root package name */
    int f32052c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ MfaResolutionViewModel f32053d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MfaResolutionViewModel mfaResolutionViewModel, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f32053d = mfaResolutionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f32053d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        MutableStateFlow mutableStateFlow;
        ArrayList arrayList;
        MfaResolutionViewModel mfaResolutionViewModel;
        MutableStateFlow mutableStateFlow2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f32052c;
        MfaResolutionViewModel mfaResolutionViewModel2 = this.f32053d;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    arrayList = this.f32051b;
                    mfaResolutionViewModel = this.f32050a;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                ArrayList arrayList2 = new ArrayList();
                AccountRemoteRepository accountRemoteRepository = mfaResolutionViewModel2.f31933b;
                this.f32050a = mfaResolutionViewModel2;
                this.f32051b = arrayList2;
                this.f32052c = 1;
                Object authentication = accountRemoteRepository.getAuthentication(this);
                if (authentication == coroutineSingletons) {
                    return coroutineSingletons;
                }
                arrayList = arrayList2;
                obj = authentication;
                mfaResolutionViewModel = mfaResolutionViewModel2;
            }
            List<TwoFactorAuthentication> authentications = ((TwoFactorAuthentication.Response) obj).getAuthentications();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : authentications) {
                if (obj2 instanceof TwoFactorAuthentication.Totp) {
                    arrayList3.add(obj2);
                }
            }
            if (((TwoFactorAuthentication.Totp) kotlin.collections.x.K(arrayList3)) != null) {
                arrayList.add(c.C0424c.f31965a);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : authentications) {
                if (obj3 instanceof TwoFactorAuthentication.Whatsapp) {
                    arrayList4.add(obj3);
                }
            }
            TwoFactorAuthentication.Whatsapp whatsapp = (TwoFactorAuthentication.Whatsapp) kotlin.collections.x.K(arrayList4);
            if (whatsapp != null) {
                arrayList.add(new c.d(whatsapp.getPhoneNumber()));
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : authentications) {
                if (obj4 instanceof TwoFactorAuthentication.Phone) {
                    arrayList5.add(obj4);
                }
            }
            TwoFactorAuthentication.Phone phone = (TwoFactorAuthentication.Phone) kotlin.collections.x.K(arrayList5);
            if (phone != null) {
                arrayList.add(new c.b(phone.getPhoneNumber()));
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj5 : authentications) {
                if (obj5 instanceof TwoFactorAuthentication.Call) {
                    arrayList6.add(obj5);
                }
            }
            TwoFactorAuthentication.Call call = (TwoFactorAuthentication.Call) kotlin.collections.x.K(arrayList6);
            if (call != null) {
                arrayList.add(new c.a(call.getPhoneNumber()));
            }
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (!arrayList.isEmpty()) {
            c cVar = (c) kotlin.collections.x.I(arrayList);
            if (!kotlin.jvm.internal.u.e(cVar, c.C0424c.f31965a)) {
                mfaResolutionViewModel.T0(cVar);
            }
            mutableStateFlow2 = mfaResolutionViewModel.f31939h;
            mutableStateFlow2.setValue(new a.c(arrayList, (c) kotlin.collections.x.I(arrayList)));
            a11 = nm0.y.f85009a;
            Throwable b10 = nm0.k.b(a11);
            if (b10 != null) {
                x70.b.n(b10);
                mutableStateFlow = mfaResolutionViewModel2.f31939h;
                mutableStateFlow.setValue(a.C0422a.f31953a);
            }
            return nm0.y.f85009a;
        }
        throw new Exception("No auth factors found");
    }
}
