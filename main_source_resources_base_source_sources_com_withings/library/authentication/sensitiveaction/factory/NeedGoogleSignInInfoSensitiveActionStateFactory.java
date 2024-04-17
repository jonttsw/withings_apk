package com.withings.library.authentication.sensitiveaction.factory;

import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState;
import kotlin.Metadata;
import ym0.a;
/* compiled from: NeedGoogleSignInInfoSensitiveActionStateFactory.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\f\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/factory/NeedGoogleSignInInfoSensitiveActionStateFactory;", "", "Lkotlin/Function0;", "Lcom/withings/library/authentication/login/Server;", "server", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "build", "(Lym0/a;)Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "", "serverId", "buildFromServerId", "(I)Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "buildWithRepo", "needGoogleSignInInfoSensitiveActionState", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;)Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface NeedGoogleSignInInfoSensitiveActionStateFactory {
    NeedGoogleSignInInfoSensitiveActionState build(a<? extends Server> aVar);

    NeedGoogleSignInInfoSensitiveActionState buildFromServerId(int i11);

    NeedGoogleSignInInfoSensitiveActionState buildWithRepo(NeedGoogleSignInInfoSensitiveActionState needGoogleSignInInfoSensitiveActionState);

    NeedGoogleSignInInfoSensitiveActionState buildWithRepo(a<? extends Server> aVar);
}
