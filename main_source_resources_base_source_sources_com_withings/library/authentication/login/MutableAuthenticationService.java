package com.withings.library.authentication.login;

import com.withings.library.authentication.login.state.AuthenticationState;
import kotlin.Metadata;
import qm0.d;
/* compiled from: MutableAuthenticationService.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J%\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/MutableAuthenticationService;", "", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "T", "newAuthenticationState", "pushNewState", "(Lcom/withings/library/authentication/login/state/AuthenticationState;Lqm0/d;)Ljava/lang/Object;", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface MutableAuthenticationService {
    <T extends AuthenticationState> Object pushNewState(T t11, d<? super T> dVar);
}
