package com.withings.authentication.mfa;

import com.withings.account.models.TwoFactorAuthentication;
import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.authentication.mfa.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.s0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsMfaViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.SettingsMfaViewModel$fetchAuthentications$1", f = "SettingsMfaViewModel.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class i0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    HashMap f31631a;

    /* renamed from: b  reason: collision with root package name */
    SettingsMfaViewModel f31632b;

    /* renamed from: c  reason: collision with root package name */
    int f31633c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SettingsMfaViewModel f31634d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(SettingsMfaViewModel settingsMfaViewModel, qm0.d<? super i0> dVar) {
        super(2, dVar);
        this.f31634d = settingsMfaViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new i0(this.f31634d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((i0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        MutableStateFlow mutableStateFlow;
        HashMap f11;
        SettingsMfaViewModel settingsMfaViewModel;
        String str;
        String str2;
        MutableStateFlow mutableStateFlow2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f31633c;
        SettingsMfaViewModel settingsMfaViewModel2 = this.f31634d;
        String str3 = null;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    settingsMfaViewModel = this.f31632b;
                    f11 = this.f31631a;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                f11 = s0.f(new nm0.j(PhoneFactor.f31561a, null), new nm0.j(PhoneFactor.f31562b, null), new nm0.j(PhoneFactor.f31563c, null));
                AccountRemoteRepository accountRemoteRepository = settingsMfaViewModel2.f31591a;
                this.f31631a = f11;
                this.f31632b = settingsMfaViewModel2;
                this.f31633c = 1;
                obj = accountRemoteRepository.getAuthentication(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                settingsMfaViewModel = settingsMfaViewModel2;
            }
            List<TwoFactorAuthentication> authentications = ((TwoFactorAuthentication.Response) obj).getAuthentications();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : authentications) {
                if (obj2 instanceof TwoFactorAuthentication.Totp) {
                    arrayList.add(obj2);
                }
            }
            TwoFactorAuthentication.Totp totp = (TwoFactorAuthentication.Totp) kotlin.collections.x.K(arrayList);
            PhoneFactor phoneFactor = PhoneFactor.f31561a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : authentications) {
                if (obj3 instanceof TwoFactorAuthentication.Whatsapp) {
                    arrayList2.add(obj3);
                }
            }
            TwoFactorAuthentication.Whatsapp whatsapp = (TwoFactorAuthentication.Whatsapp) kotlin.collections.x.K(arrayList2);
            if (whatsapp != null) {
                str = whatsapp.getPhoneNumber();
            } else {
                str = null;
            }
            f11.put(phoneFactor, str);
            PhoneFactor phoneFactor2 = PhoneFactor.f31562b;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : authentications) {
                if (obj4 instanceof TwoFactorAuthentication.Phone) {
                    arrayList3.add(obj4);
                }
            }
            TwoFactorAuthentication.Phone phone = (TwoFactorAuthentication.Phone) kotlin.collections.x.K(arrayList3);
            if (phone != null) {
                str2 = phone.getPhoneNumber();
            } else {
                str2 = null;
            }
            f11.put(phoneFactor2, str2);
            PhoneFactor phoneFactor3 = PhoneFactor.f31563c;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj5 : authentications) {
                if (obj5 instanceof TwoFactorAuthentication.Call) {
                    arrayList4.add(obj5);
                }
            }
            TwoFactorAuthentication.Call call = (TwoFactorAuthentication.Call) kotlin.collections.x.K(arrayList4);
            if (call != null) {
                str3 = call.getPhoneNumber();
            }
            f11.put(phoneFactor3, str3);
            mutableStateFlow2 = settingsMfaViewModel.f31592b;
            mutableStateFlow2.setValue(new a.c(totp, f11));
            a11 = nm0.y.f85009a;
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        Throwable b10 = nm0.k.b(a11);
        if (b10 != null) {
            x70.b.n(b10);
            mutableStateFlow = settingsMfaViewModel2.f31592b;
            mutableStateFlow.setValue(a.C0410a.f31607a);
        }
        return nm0.y.f85009a;
    }
}
