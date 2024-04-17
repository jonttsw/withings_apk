package com.withings.library.authentication.login.state.factory;

import com.withings.library.authentication.login.state.NeedMailResult;
import com.withings.library.authentication.login.state.impl.NeedMailResultWithRepo;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: NeedMailResultFactoryImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/login/state/factory/NeedMailResultFactoryImpl;", "Lcom/withings/library/authentication/login/state/factory/NeedMailResultFactory;", "()V", "buildNeedMailResultFactoryWithRepo", "Lcom/withings/library/authentication/login/state/NeedMailResult;", "needMailResult", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NeedMailResultFactoryImpl implements NeedMailResultFactory {
    @Override // com.withings.library.authentication.login.state.factory.NeedMailResultFactory
    public NeedMailResult buildNeedMailResultFactoryWithRepo(NeedMailResult needMailResult) {
        u.j(needMailResult, "needMailResult");
        return new NeedMailResultWithRepo(needMailResult);
    }
}
