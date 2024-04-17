package com.withings.screen.repository.ws;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: SynchronizeDeviceScreens.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0086B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/withings/screen/repository/ws/SynchronizeDeviceScreens;", "", "", "deviceId", "Lorg/joda/time/DateTime;", "screensLastUpdate", "contentsLastUpdate", "", "syncContext", "Lnm0/y;", "invoke", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/screen/repository/ws/GetDeviceScreens;", "getDeviceScreens", "Lcom/withings/screen/repository/ws/GetDeviceScreens;", "Lcom/withings/screen/repository/ws/GetDeviceScreensContents;", "getDeviceScreensContents", "Lcom/withings/screen/repository/ws/GetDeviceScreensContents;", "Lcom/withings/screen/repository/ws/SendDeviceScreens;", "sendDeviceScreens", "Lcom/withings/screen/repository/ws/SendDeviceScreens;", "<init>", "(Lcom/withings/screen/repository/ws/GetDeviceScreens;Lcom/withings/screen/repository/ws/GetDeviceScreensContents;Lcom/withings/screen/repository/ws/SendDeviceScreens;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SynchronizeDeviceScreens {
    private final GetDeviceScreens getDeviceScreens;
    private final GetDeviceScreensContents getDeviceScreensContents;
    private final SendDeviceScreens sendDeviceScreens;

    @Inject
    public SynchronizeDeviceScreens(GetDeviceScreens getDeviceScreens, GetDeviceScreensContents getDeviceScreensContents, SendDeviceScreens sendDeviceScreens) {
        u.j(getDeviceScreens, "getDeviceScreens");
        u.j(getDeviceScreensContents, "getDeviceScreensContents");
        u.j(sendDeviceScreens, "sendDeviceScreens");
        this.getDeviceScreens = getDeviceScreens;
        this.getDeviceScreensContents = getDeviceScreensContents;
        this.sendDeviceScreens = sendDeviceScreens;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(long r14, org.joda.time.DateTime r16, org.joda.time.DateTime r17, java.lang.String r18, qm0.d<? super nm0.y> r19) {
        /*
            Method dump skipped, instructions count: 192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.ws.SynchronizeDeviceScreens.invoke(long, org.joda.time.DateTime, org.joda.time.DateTime, java.lang.String, qm0.d):java.lang.Object");
    }
}
