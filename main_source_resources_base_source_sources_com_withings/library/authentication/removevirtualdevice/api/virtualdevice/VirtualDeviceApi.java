package com.withings.library.authentication.removevirtualdevice.api.virtualdevice;

import com.withings.library.authentication.login.Server;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
/* compiled from: VirtualDeviceApi.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J[\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/withings/library/authentication/removevirtualdevice/api/virtualdevice/VirtualDeviceApi;", "", "", "sessionId", "deviceUuid", "modelName", "typeName", "os", "appVersion", "appName", "osVersion", "Lcom/withings/library/authentication/login/Server;", "server", "Lnm0/y;", "deleteVirtualDevice", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface VirtualDeviceApi {
    Object deleteVirtualDevice(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Server server, d<? super y> dVar);
}
