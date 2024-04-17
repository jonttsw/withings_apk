package com.withings.library.authentication.login.state.factory;

import com.withings.library.authentication.login.state.LoggedOut;
import kotlin.Metadata;
/* compiled from: LoggedOutFactory.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "", "buildLoggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", "buildLoggedOutFromServerId", "serverId", "", "buildLoggedOutWithRepo", "loggedOut", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface LoggedOutFactory {
    LoggedOut buildLoggedOut();

    LoggedOut buildLoggedOutFromServerId(int i11);

    LoggedOut buildLoggedOutWithRepo(LoggedOut loggedOut);
}
