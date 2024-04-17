package com.withings.authentication.tryToLogin.mail;

import com.withings.account.network.ws.ExistingUser;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.authentication.login.Session;
import com.withings.library.authentication.login.state.NeedMailResult;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import nm0.l;
import nm0.y;
import th.e;
import th.m;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TryToLoginViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$confirmJtw$1", f = "TryToLoginViewModel.kt", l = {ConstantsWs.WS_STATUS_MISSING, ConstantsWs.WS_STATUS_WRONGMAINTDATA, ConstantsWs.WS_STATUS_WRONGBLINDCODE, ConstantsWs.WS_STATUS_MEASNOTSHARED}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32434a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TryToLoginViewModel f32435b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f32436c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f32437d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TryToLoginViewModel tryToLoginViewModel, String str, String str2, qm0.d<? super a> dVar) {
        super(2, dVar);
        this.f32435b = tryToLoginViewModel;
        this.f32436c = str;
        this.f32437d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new a(this.f32435b, this.f32436c, this.f32437d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f32434a;
        TryToLoginViewModel tryToLoginViewModel = this.f32435b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3 && i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.b(obj);
                return y.f85009a;
            }
            l.b(obj);
            b10 = obj;
        } else {
            l.b(obj);
            cg.i iVar = tryToLoginViewModel.f32387f;
            this.f32434a = 1;
            b10 = iVar.b(this.f32436c, this.f32437d, this);
            if (b10 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        NeedMailResult.OutputState outputState = (NeedMailResult.OutputState) b10;
        if (outputState instanceof NeedMailResult.OutputState.SuccessLoggedIn) {
            List<Session> sessions = ((NeedMailResult.OutputState.SuccessLoggedIn) outputState).getLoggedIn().getSessions();
            u.j(sessions, "<this>");
            Session c11 = kg.c.c(sessions);
            u.g(c11);
            ExistingUser existingUser = new ExistingUser(c11.getProviderToken(), c11.getSessionId(), c11.getAccountId(), c11.getProviderType().getValue(), c11.getAuthToken(), c11.isSecured(), c11.isSecured());
            MutableSharedFlow<m.a> R0 = tryToLoginViewModel.R0();
            m.a.d dVar = new m.a.d(existingUser, tryToLoginViewModel.f32382a.h());
            this.f32434a = 2;
            if (R0.emit(dVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (outputState instanceof NeedMailResult.OutputState.SuccessNeedCode2FA) {
            tryToLoginViewModel.O0().postValue(e.a.C1659e.f99828a);
        } else if (outputState instanceof NeedMailResult.OutputState.SuccessNeedPhoneNumber2FACreation) {
            tryToLoginViewModel.O0().postValue(e.a.C1659e.f99828a);
        } else if (outputState instanceof NeedMailResult.OutputState.SuccessNeedAccountCreation) {
            MutableSharedFlow<m.a> R02 = tryToLoginViewModel.R0();
            m.a.C1664a c1664a = new m.a.C1664a(null);
            this.f32434a = 3;
            if (R02.emit(c1664a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            MutableSharedFlow<m.a> R03 = tryToLoginViewModel.R0();
            m.a.b.e eVar = m.a.b.e.f99876a;
            this.f32434a = 4;
            if (R03.emit(eVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
