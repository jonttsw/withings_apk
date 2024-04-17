package com.withings.library.authentication.login.state.factory;

import com.withings.library.authentication.login.Environment;
import com.withings.library.authentication.login.state.LoggedOut;
import com.withings.library.authentication.login.state.impl.LoggedOutImpl;
import com.withings.library.authentication.login.state.impl.LoggedOutWithRepo;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import ym0.a;
/* compiled from: LoggedOutFactoryImpl.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/withings/library/authentication/login/state/factory/LoggedOutFactoryImpl;", "Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "Lcom/withings/library/authentication/login/state/LoggedOut;", "buildLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "", "serverId", "buildLoggedOutFromServerId", "(I)Lcom/withings/library/authentication/login/state/LoggedOut;", "loggedOut", "buildLoggedOutWithRepo", "(Lcom/withings/library/authentication/login/state/LoggedOut;)Lcom/withings/library/authentication/login/state/LoggedOut;", "Lkotlin/Function0;", "Lcom/withings/library/authentication/login/Environment;", "environment", "Lym0/a;", "<init>", "(Lym0/a;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LoggedOutFactoryImpl implements LoggedOutFactory {
    private final a<Environment> environment;

    /* JADX WARN: Multi-variable type inference failed */
    public LoggedOutFactoryImpl(a<? extends Environment> environment) {
        u.j(environment, "environment");
        this.environment = environment;
    }

    @Override // com.withings.library.authentication.login.state.factory.LoggedOutFactory
    public LoggedOut buildLoggedOut() {
        return new LoggedOutImpl(new LoggedOutFactoryImpl$buildLoggedOut$1(this));
    }

    @Override // com.withings.library.authentication.login.state.factory.LoggedOutFactory
    public LoggedOut buildLoggedOutFromServerId(int i11) {
        return new LoggedOutImpl(new LoggedOutFactoryImpl$buildLoggedOutFromServerId$1(this, i11));
    }

    @Override // com.withings.library.authentication.login.state.factory.LoggedOutFactory
    public LoggedOut buildLoggedOutWithRepo(LoggedOut loggedOut) {
        u.j(loggedOut, "loggedOut");
        return new LoggedOutWithRepo(loggedOut);
    }
}
