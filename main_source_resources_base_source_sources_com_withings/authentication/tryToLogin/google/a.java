package com.withings.authentication.tryToLogin.google;

import androidx.lifecycle.k0;
import cg.g;
import com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel;
import com.withings.library.authentication.login.state.LoggedOut;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import rh.j;
import th.e;
import xw.n;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GoogleAuthProviderViewModel.kt */
@e(c = "com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel$handleSignInResult$1$1", f = "GoogleAuthProviderViewModel.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32377a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GoogleAuthProviderViewModel f32378b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GoogleAuthProviderViewModel googleAuthProviderViewModel, d<? super a> dVar) {
        super(2, dVar);
        this.f32378b = googleAuthProviderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new a(this.f32378b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        g gVar;
        rh.i iVar;
        vf.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f32377a;
        GoogleAuthProviderViewModel googleAuthProviderViewModel = this.f32378b;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            googleAuthProviderViewModel.K0().postValue(e.a.f.f99829a);
            gVar = googleAuthProviderViewModel.f32353h;
            GoogleAuthProviderViewModel.a aVar = googleAuthProviderViewModel.f32360o;
            if (aVar != null) {
                String b10 = aVar.b();
                String id2 = googleAuthProviderViewModel.f32354i.getId();
                GoogleAuthProviderViewModel.a aVar2 = googleAuthProviderViewModel.f32360o;
                if (aVar2 != null) {
                    String a11 = aVar2.a();
                    this.f32377a = 1;
                    obj = gVar.a(b10, id2, a11, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    u.s("googleAccount");
                    throw null;
                }
            } else {
                u.s("googleAccount");
                throw null;
            }
        }
        LoggedOut.OutputState outputState = (LoggedOut.OutputState) obj;
        if (outputState instanceof LoggedOut.OutputState.SuccessLoggedIn) {
            if (((LoggedOut.OutputState.SuccessLoggedIn) outputState).getLoggedIn().getSessions().size() > 1) {
                googleAuthProviderViewModel.K0().postValue(e.a.d.f99827a);
            } else {
                n<e.a> K0 = googleAuthProviderViewModel.K0();
                cVar = vf.c.f103617d;
                if (cVar != null) {
                    K0.postValue(new e.a.c(cVar.h()));
                } else {
                    throw new IllegalArgumentException("You must call init before".toString());
                }
            }
        } else if (outputState instanceof LoggedOut.OutputState.SuccessNeed2FACode) {
            googleAuthProviderViewModel.K0().postValue(e.a.C1659e.f99828a);
        } else if (outputState instanceof LoggedOut.OutputState.SuccessNeedAccountCreation) {
            k0<rh.l> M0 = googleAuthProviderViewModel.M0();
            GoogleAuthProviderViewModel.a aVar3 = googleAuthProviderViewModel.f32360o;
            if (aVar3 != null) {
                M0.postValue(new rh.d(aVar3.a(), null));
            } else {
                u.s("googleAccount");
                throw null;
            }
        } else if (!(outputState instanceof LoggedOut.OutputState.SuccessNeedPhoneNumber2FACreation)) {
            iVar = googleAuthProviderViewModel.f32359n;
            if (iVar != null) {
                iVar.e();
            }
            googleAuthProviderViewModel.M0().postValue(j.f95042a);
        } else {
            googleAuthProviderViewModel.K0().postValue(e.a.C1659e.f99828a);
        }
        return y.f85009a;
    }
}
