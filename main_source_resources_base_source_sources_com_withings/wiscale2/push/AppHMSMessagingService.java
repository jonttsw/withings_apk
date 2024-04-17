package com.withings.wiscale2.push;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.r;
import androidx.core.app.y;
import androidx.work.ExistingWorkPolicy;
import androidx.work.e;
import androidx.work.f;
import androidx.work.impl.n0;
import androidx.work.r;
import androidx.work.w;
import com.huawei.hms.push.RemoteMessage;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import dp0.j;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import th0.k;
/* compiled from: AppHMSMessagingService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/push/AppHMSMessagingService;", "Lcom/huawei/hms/push/HmsMessageService;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AppHMSMessagingService extends Hilt_AppHMSMessagingService {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public k f59547e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.core.app.u, androidx.core.app.q] */
    @Override // com.huawei.hms.push.HmsMessageService
    @SuppressLint({"MissingPermission"})
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        Intent intent;
        u.j(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        String data = remoteMessage.getData();
        u.i(data, "getData(...)");
        if (data.length() > 0) {
            k kVar = this.f59547e;
            if (kVar != null) {
                Map<String, String> dataOfMap = remoteMessage.getDataOfMap();
                u.i(dataOfMap, "getDataOfMap(...)");
                kVar.a(dataOfMap, this);
                return;
            }
            u.s("pushNotificationManager");
            throw null;
        }
        RemoteMessage.Notification notification = remoteMessage.getNotification();
        if (notification != null) {
            String clickAction = notification.getClickAction();
            if (clickAction != null) {
                intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(clickAction));
            } else {
                intent = new Intent(this, MainActivity.class);
            }
            intent.addFlags(67108864);
            intent.addFlags(ConstantsWs.DEBUG_BITMASK_EXTENDED_HWA10_RAWDATA_CBTA);
            r rVar = new r(this, "other_channel_other");
            rVar.m(notification.getTitle());
            rVar.l(notification.getBody());
            rVar.B(2131231550);
            rVar.h(androidx.core.content.a.getColor(this, C1987R.color.statusInfo));
            rVar.e(true);
            ?? uVar = new androidx.core.app.u();
            uVar.f(notification.getBody());
            uVar.g(notification.getTitle());
            uVar.h(notification.getBody());
            rVar.D(uVar);
            rVar.k(PendingIntent.getActivity(this, 0, intent, 67108864));
            Notification c11 = rVar.c();
            u.i(c11, "build(...)");
            y.c(this).e(null, 0, c11);
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public final void onNewToken(String token) {
        String str;
        u.j(token, "token");
        super.onNewToken(token);
        nm0.y yVar = null;
        if (!j.D(token)) {
            str = token;
        } else {
            str = null;
        }
        if (str != null) {
            x70.b.t(this, "onNewToken: ".concat(token), new Object[0]);
            w.a aVar = new w.a(RegisterHMSPushToken.class);
            f.a aVar2 = new f.a();
            nm0.j jVar = new nm0.j[]{new nm0.j("token", token)}[0];
            aVar2.b(jVar.d(), (String) jVar.c());
            e.a aVar3 = new e.a();
            aVar3.b();
            n0.n(this).e("HMSPushRegister", ExistingWorkPolicy.f19030a, ((r.a) aVar.j(aVar2.a())).h(aVar3.a()).b());
            yVar = nm0.y.f85009a;
        }
        if (yVar == null) {
            x70.b.p(new IllegalStateException("token should not be returned blank from onNewToken method. Should contact Huawei team for this"));
        }
    }
}
