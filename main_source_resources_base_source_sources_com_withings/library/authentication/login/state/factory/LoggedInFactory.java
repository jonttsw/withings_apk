package com.withings.library.authentication.login.state.factory;

import com.withings.library.authentication.login.Session;
import com.withings.library.authentication.login.state.LoggedIn;
import java.util.List;
import kotlin.Metadata;
import qm0.d;
/* compiled from: LoggedInFactory.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u000b\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "", "", "Lcom/withings/library/authentication/login/Session;", "sessions", "Lcom/withings/library/authentication/login/state/LoggedIn;", "buildLoggedIn", "(Ljava/util/List;)Lcom/withings/library/authentication/login/state/LoggedIn;", "buildLoggedInWithPartnerSessionRetrieving", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "loggedIn", "buildLoggedInWithRepo", "(Lcom/withings/library/authentication/login/state/LoggedIn;)Lcom/withings/library/authentication/login/state/LoggedIn;", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface LoggedInFactory {
    LoggedIn buildLoggedIn(List<Session> list);

    Object buildLoggedInWithPartnerSessionRetrieving(List<Session> list, d<? super LoggedIn> dVar);

    LoggedIn buildLoggedInWithRepo(LoggedIn loggedIn);

    LoggedIn buildLoggedInWithRepo(List<Session> list);
}
