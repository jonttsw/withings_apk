package com.withings.authentication.tryToLogin.google;

import androidx.lifecycle.k0;
import com.withings.account.models.AccountPrefEntity;
import com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.common.exception.AccountDoesntExistException;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.k;
import nm0.l;
import nm0.y;
import qm0.d;
import rh.j;
import rh.k;
import rh.m;
import vf.f;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GoogleAuthProviderViewModel.kt */
@e(c = "com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel$login$1", f = "GoogleAuthProviderViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends i implements p<CoroutineScope, d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32379a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GoogleAuthProviderViewModel f32380b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GoogleAuthProviderViewModel googleAuthProviderViewModel, d<? super b> dVar) {
        super(2, dVar);
        this.f32380b = googleAuthProviderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new b(this.f32380b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        rh.i iVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f32379a;
        GoogleAuthProviderViewModel googleAuthProviderViewModel = this.f32380b;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                googleAuthProviderViewModel.M0().postValue(k.f95043a);
                f fVar = googleAuthProviderViewModel.f32350e;
                String id2 = googleAuthProviderViewModel.f32354i.getId();
                GoogleAuthProviderViewModel.a aVar = googleAuthProviderViewModel.f32360o;
                if (aVar != null) {
                    String a12 = aVar.a();
                    GoogleAuthProviderViewModel.a aVar2 = googleAuthProviderViewModel.f32360o;
                    if (aVar2 != null) {
                        String b10 = aVar2.b();
                        String z02 = GoogleAuthProviderViewModel.z0(googleAuthProviderViewModel);
                        u.i(z02, "access$getUniqueId(...)");
                        this.f32379a = 1;
                        if (fVar.a(id2, a12, true, b10, AccountPrefEntity.PROVIDER_GOOGLE, z02, this) == coroutineSingletons) {
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
            a11 = y.f85009a;
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        if (!(a11 instanceof k.a)) {
            y yVar = (y) a11;
            googleAuthProviderViewModel.M0().postValue(new m(googleAuthProviderViewModel.f32347b.h()));
        }
        Throwable b11 = nm0.k.b(a11);
        if (b11 != null) {
            if (b11 instanceof AccountDoesntExistException) {
                k0<rh.l> M0 = googleAuthProviderViewModel.M0();
                GoogleAuthProviderViewModel.a aVar3 = googleAuthProviderViewModel.f32360o;
                if (aVar3 != null) {
                    M0.postValue(new rh.d(aVar3.a(), ((AccountDoesntExistException) b11).getResponse().getAccountCreationToken()));
                } else {
                    u.s("googleAccount");
                    throw null;
                }
            } else if ((b11 instanceof WsAuthFailedException) && ((WsAuthFailedException) b11).getStatus() == 100) {
                googleAuthProviderViewModel.M0().postValue(j.f95042a);
                iVar = googleAuthProviderViewModel.f32359n;
                if (iVar != null) {
                    iVar.e();
                }
                GoogleAuthProviderViewModel.A0(googleAuthProviderViewModel);
            } else {
                GoogleAuthProviderViewModel.A0(googleAuthProviderViewModel);
            }
        }
        return y.f85009a;
    }
}
