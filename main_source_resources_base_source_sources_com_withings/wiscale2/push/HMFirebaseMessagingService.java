package com.withings.wiscale2.push;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.r;
import com.google.firebase.messaging.RemoteMessage;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import m70.i;
import nm0.y;
import th0.j;
import th0.k;
/* compiled from: HMFirebaseMessagingService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/push/HMFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HMFirebaseMessagingService extends Hilt_HMFirebaseMessagingService {
    @Inject

    /* renamed from: d  reason: collision with root package name */
    public k f59548d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.core.app.u, androidx.core.app.q] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        Map<String, String> data;
        Intent intent;
        y yVar;
        u.j(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        u.i(remoteMessage.getData(), "getData(...)");
        if (!data.isEmpty()) {
            k kVar = this.f59548d;
            if (kVar != null) {
                Map<String, String> data2 = remoteMessage.getData();
                u.i(data2, "getData(...)");
                kVar.a(data2, this);
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
            Uri imageUrl = notification.getImageUrl();
            if (imageUrl != null) {
                j jVar = new j(rVar);
                String uri = imageUrl.toString();
                u.i(uri, "toString(...)");
                jVar.b(this, uri, new b(this, rVar));
                yVar = y.f85009a;
            } else {
                yVar = null;
            }
            if (yVar == null) {
                androidx.core.app.y.c(this).e(null, 0, rVar.c());
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String token) {
        u.j(token, "token");
        super.onNewToken(token);
        try {
            User f11 = i.b().f();
            if (f11 != null) {
                com.withings.wiscale2.utils.fcmlegacy.a c11 = com.withings.wiscale2.utils.fcmlegacy.a.c();
                if (c11 != null) {
                    c11.f(f11.q());
                    com.withings.wiscale2.utils.fcmlegacy.a c12 = com.withings.wiscale2.utils.fcmlegacy.a.c();
                    if (c12 != null) {
                        c12.e(this, null);
                        return;
                    } else {
                        u.s("instance");
                        throw null;
                    }
                }
                u.s("instance");
                throw null;
            }
        } catch (Exception e11) {
            x70.b.e(this, e11);
        }
    }
}
