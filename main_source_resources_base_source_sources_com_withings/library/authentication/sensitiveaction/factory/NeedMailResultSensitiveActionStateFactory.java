package com.withings.library.authentication.sensitiveaction.factory;

import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState;
import kotlin.Metadata;
/* compiled from: NeedMailResultSensitiveActionStateFactory.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailResultSensitiveActionStateFactory;", "", "build", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "email", "", "server", "Lcom/withings/library/authentication/login/Server;", "buildWithRepo", "needMailResultSensitiveActionState", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface NeedMailResultSensitiveActionStateFactory {
    NeedMailResultSensitiveActionState build(String str, Server server);

    NeedMailResultSensitiveActionState buildWithRepo(NeedMailResultSensitiveActionState needMailResultSensitiveActionState);

    NeedMailResultSensitiveActionState buildWithRepo(String str, Server server);
}
