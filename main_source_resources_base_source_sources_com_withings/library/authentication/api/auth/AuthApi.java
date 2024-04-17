package com.withings.library.authentication.api.auth;

import com.withings.library.authentication.api.VirtualDeviceInformation;
import com.withings.library.authentication.api.auth.accountsession.AccountSession;
import com.withings.library.authentication.login.ProviderType;
import com.withings.library.authentication.login.Server;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
/* compiled from: AuthApi.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fJC\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/withings/library/authentication/api/auth/AuthApi;", "", "", "email", "password", "token", "Lcom/withings/library/authentication/api/VirtualDeviceInformation;", "virtualDeviceInformation", "Lcom/withings/library/authentication/login/Server;", "server", "Lcom/withings/library/authentication/api/auth/accountsession/AccountSession;", "loginWithClearPassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/api/VirtualDeviceInformation;Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "hash", "loginWithHashedPassword", "authToken", "providerToken", "deviceUuid", "Lcom/withings/library/authentication/login/ProviderType;", "providerType", "loginFromAuthProvider", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/api/VirtualDeviceInformation;Lcom/withings/library/authentication/login/ProviderType;Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "sessionId", "Lnm0/y;", "logout", "(Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/login/ProviderType;Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface AuthApi {
    Object loginFromAuthProvider(String str, String str2, String str3, VirtualDeviceInformation virtualDeviceInformation, ProviderType providerType, Server server, d<? super AccountSession> dVar);

    Object loginWithClearPassword(String str, String str2, String str3, VirtualDeviceInformation virtualDeviceInformation, Server server, d<? super AccountSession> dVar);

    Object loginWithHashedPassword(String str, String str2, String str3, VirtualDeviceInformation virtualDeviceInformation, Server server, d<? super AccountSession> dVar);

    Object logout(String str, String str2, ProviderType providerType, Server server, d<? super y> dVar);
}
