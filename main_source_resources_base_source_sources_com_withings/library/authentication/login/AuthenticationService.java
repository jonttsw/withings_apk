package com.withings.library.authentication.login;

import com.withings.library.authentication.login.state.AuthenticationState;
import com.withings.library.authentication.login.state.LoggedOut;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import nm0.g;
import nm0.h;
import pq0.a;
import qm0.d;
/* compiled from: AuthenticationService.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/withings/library/authentication/login/AuthenticationService;", "", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "getState", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/state/LoggedOut;", "initiateLoginSequence", "initiateLoginSequenceWithAutomatedTransition", "Lkotlinx/coroutines/flow/Flow;", "getCurrentState", "()Lkotlinx/coroutines/flow/Flow;", "currentState", "Companion", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface AuthenticationService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: AuthenticationService.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/library/authentication/login/AuthenticationService$Companion;", "Lpq0/a;", "Lcom/withings/library/authentication/login/AuthenticationService;", "getAuthenticationService", "()Lcom/withings/library/authentication/login/AuthenticationService;", "<init>", "()V", "authenticationService", "Authentication_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class Companion implements a {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        private static final AuthenticationService getAuthenticationService$lambda$0(g<? extends AuthenticationService> gVar) {
            return gVar.getValue();
        }

        public final AuthenticationService getAuthenticationService() {
            return getAuthenticationService$lambda$0(h.a(LazyThreadSafetyMode.f76136a, new AuthenticationService$Companion$getAuthenticationService$$inlined$inject$default$1(this, null, null)));
        }

        @Override // pq0.a
        public oq0.a getKoin() {
            return qq0.a.f93676a.a();
        }
    }

    Flow<AuthenticationState> getCurrentState();

    Object getState(d<? super AuthenticationState> dVar);

    Object initiateLoginSequence(d<? super LoggedOut> dVar);

    Object initiateLoginSequenceWithAutomatedTransition(d<? super AuthenticationState> dVar);
}
