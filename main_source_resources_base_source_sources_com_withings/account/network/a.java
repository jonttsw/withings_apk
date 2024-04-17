package com.withings.account.network;

import com.withings.account.network.GenerateAccountSession;
import com.withings.account.network.ws.SessionRemoteRepository;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import com.withings.webservices.legacy.withings.model.session.AccountSession;
import kg.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import sf.c;
import ym0.p;
/* compiled from: GenerateAccountSession.kt */
@e(c = "com.withings.account.network.GenerateAccountSession$login$2", f = "GenerateAccountSession.kt", l = {37, 38}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class a extends i implements p<CoroutineScope, d<? super AccountSession>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30994a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f30995b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SessionRemoteRepository f30996c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f30997d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ GenerateAccountSession f30998e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, SessionRemoteRepository sessionRemoteRepository, String str, GenerateAccountSession generateAccountSession, d<? super a> dVar) {
        super(2, dVar);
        this.f30995b = cVar;
        this.f30996c = sessionRemoteRepository;
        this.f30997d = str;
        this.f30998e = generateAccountSession;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new a(this.f30995b, this.f30996c, this.f30997d, this.f30998e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super AccountSession> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GenerateAccountSession.AccountAuthenticationException.AuthFailed authFailed;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f30994a;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        l.b(obj);
                        return (AccountSession) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.b(obj);
                return (AccountSession) obj;
            }
            l.b(obj);
            c cVar = this.f30995b;
            boolean z5 = cVar instanceof c.C1619c;
            String str = this.f30997d;
            SessionRemoteRepository sessionRemoteRepository = this.f30996c;
            if (z5) {
                this.f30994a = 1;
                obj = b.b(sessionRemoteRepository, str, (c.C1619c) cVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return (AccountSession) obj;
            } else if (cVar instanceof c.b) {
                this.f30994a = 2;
                obj = b.a(sessionRemoteRepository, str, (c.b) cVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return (AccountSession) obj;
            } else if (cVar instanceof c.a) {
                throw new IllegalStateException("Account is missing data to generate session");
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e11) {
            boolean z11 = e11 instanceof WsAuthFailedException;
            GenerateAccountSession generateAccountSession = this.f30998e;
            if (!z11) {
                if (e11 instanceof WsAuthFailedException.Runtime) {
                    int status = ((WsAuthFailedException.Runtime) e11).getStatus();
                    generateAccountSession.getClass();
                    if (status != 103) {
                        if (status != 238) {
                            authFailed = new GenerateAccountSession.AccountAuthenticationException.AuthFailed(e11);
                        } else {
                            throw GenerateAccountSession.AccountAuthenticationException.Deactivated.f30985a;
                        }
                    } else {
                        throw GenerateAccountSession.AccountAuthenticationException.PasswordExpired.f30986a;
                    }
                } else {
                    throw e11;
                }
            } else {
                int status2 = ((WsAuthFailedException) e11).getStatus();
                generateAccountSession.getClass();
                if (status2 != 103) {
                    if (status2 != 238) {
                        authFailed = new GenerateAccountSession.AccountAuthenticationException.AuthFailed(e11);
                    } else {
                        throw GenerateAccountSession.AccountAuthenticationException.Deactivated.f30985a;
                    }
                } else {
                    throw GenerateAccountSession.AccountAuthenticationException.PasswordExpired.f30986a;
                }
            }
            throw authFailed;
        }
    }
}
