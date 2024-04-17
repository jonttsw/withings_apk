package com.withings.library.authentication.login.state.factory;

import com.withings.library.authentication.login.ProviderType;
import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.login.state.NeedAccountCreation;
import kotlin.Metadata;
/* compiled from: NeedAccountCreationFactory.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J(\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lcom/withings/library/authentication/login/state/factory/NeedAccountCreationFactory;", "", "buildNeedAccountCreation", "Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "email", "", "accountCreationToken", "providerType", "Lcom/withings/library/authentication/login/ProviderType;", "server", "Lcom/withings/library/authentication/login/Server;", "buildNeedAccountCreationMulti", "buildNeedAccountCreationWithRepo", "needAccountCreation", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface NeedAccountCreationFactory {
    NeedAccountCreation buildNeedAccountCreation(String str, String str2, ProviderType providerType, Server server);

    NeedAccountCreation buildNeedAccountCreationMulti(String str, String str2, ProviderType providerType, Server server);

    NeedAccountCreation buildNeedAccountCreationWithRepo(NeedAccountCreation needAccountCreation);
}
