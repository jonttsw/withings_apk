package com.withings.library.authentication.api.session;

import com.withings.library.authentication.api.VirtualDeviceInformation;
import com.withings.library.authentication.api.session.once.Once;
import com.withings.library.authentication.login.Server;
import kotlin.Metadata;
import nm0.y;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import qm0.d;
/* compiled from: SessionApi.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006JC\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u0015\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/withings/library/authentication/api/session/SessionApi;", "", "Lcom/withings/library/authentication/login/Server;", "server", "Lcom/withings/library/authentication/api/session/once/Once;", "getOnce", "(Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "Lnm0/y;", "deleteSession", "", "sessionId", XHTMLText.CODE, "deviceUuid", "Lcom/withings/library/authentication/api/VirtualDeviceInformation;", "virtualDeviceInformation", "", "rememberDevice", "Lcom/withings/library/authentication/api/session/RenewResponse;", "renew", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/api/VirtualDeviceInformation;ZLcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "recoveryCode", "renewWithRecoveryCode", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface SessionApi {
    Object deleteSession(Server server, d<? super y> dVar);

    Object getOnce(Server server, d<? super Once> dVar);

    Object renew(String str, String str2, String str3, VirtualDeviceInformation virtualDeviceInformation, boolean z5, Server server, d<? super RenewResponse> dVar);

    Object renewWithRecoveryCode(String str, String str2, String str3, VirtualDeviceInformation virtualDeviceInformation, boolean z5, Server server, d<? super RenewResponse> dVar);
}
