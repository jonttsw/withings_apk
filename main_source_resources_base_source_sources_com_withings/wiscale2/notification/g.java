package com.withings.wiscale2.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.core.app.r;
import androidx.core.app.t;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.authentication.n;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.chat.ui.ChatActivity;
import dp0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import ym0.p;
/* compiled from: NotificationAggregator.kt */
/* loaded from: classes5.dex */
public final class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationAggregator.kt */
    /* loaded from: classes5.dex */
    public static final class a extends w implements p<Integer, Notification, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f58758a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(2);
            this.f58758a = context;
        }

        @Override // ym0.p
        public final y invoke(Integer num, Notification notification) {
            int intValue = num.intValue();
            Notification notification2 = notification;
            u.j(notification2, "notification");
            androidx.core.app.y.c(this.f58758a).e(null, intValue, notification2);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationAggregator.kt */
    /* loaded from: classes5.dex */
    public static final class b extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p<Integer, Notification, y> f58759a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f58760b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f58761c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super Integer, ? super Notification, y> pVar, int i11, r rVar) {
            super(0);
            this.f58759a = pVar;
            this.f58760b = i11;
            this.f58761c = rVar;
        }

        @Override // ym0.a
        public final y invoke() {
            Integer valueOf = Integer.valueOf(this.f58760b);
            Notification c11 = this.f58761c.c();
            u.i(c11, "build(...)");
            this.f58759a.invoke(valueOf, c11);
            return y.f85009a;
        }
    }

    public static void a(Context context, StatusBarNotification statusBarNotification, boolean z5) {
        u.j(context, "context");
        u.j(statusBarNotification, "statusBarNotification");
        Bundle extras = statusBarNotification.getNotification().extras;
        u.i(extras, "extras");
        b(context, bj0.d.q(extras), z5, new a(context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.core.app.u, androidx.core.app.q] */
    private static void b(Context context, Map map, boolean z5, p pVar) {
        int i11;
        Long h02;
        String str = (String) map.get("channel");
        if (str == null) {
            str = "";
        }
        String d11 = d(str);
        Object obj = map.get("title");
        if (obj == null) {
            obj = context.getString(C1987R.string._APP_NAME_);
            u.i(obj, "getString(...)");
        }
        String str2 = (String) obj;
        Object obj2 = map.get(Message.BODY);
        if (obj2 == null) {
            obj2 = (String) map.get(RemoteMessageConst.MessageBody.MSG);
        }
        String str3 = (String) obj2;
        String str4 = (String) map.get(ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
        if (str4 != null) {
            i11 = Integer.parseInt(str4);
        } else {
            i11 = -888888;
        }
        String str5 = (String) map.get(XHTMLText.IMG);
        r c11 = i.c(context, d(str));
        ?? uVar = new androidx.core.app.u();
        uVar.g(str2);
        uVar.h(str2);
        uVar.f(str3);
        c11.D(uVar);
        Object obj3 = map.get("title");
        if (obj3 == null) {
            obj3 = (String) map.get(RemoteMessageConst.MessageBody.MSG);
        }
        c11.E((CharSequence) obj3);
        c11.m(str2);
        c11.l(str3);
        c11.e(true);
        Bundle bundle = new Bundle();
        bundle.putAll(dr.b.a(map));
        c11.b(bundle);
        Intent intent = null;
        if (!z5) {
            d11 = null;
        }
        c11.q(d11);
        Intent intent2 = new Intent(context, MainActivity.class);
        intent2.putExtra("fromNotification", true);
        for (String str6 : map.keySet()) {
            intent2.putExtra(str6, (String) map.get(str6));
        }
        if (map.containsKey("sid")) {
            String str7 = (String) map.get("sid");
            if (str7 != null && (h02 = j.h0(str7)) != null) {
                long longValue = h02.longValue();
                int i12 = ChatActivity.f50318q;
                intent = n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, ChatActivity.class).putExtra("key_friend_id", Long.valueOf(longValue));
                u.i(intent, "putExtra(...)");
            }
        } else {
            if (map.containsKey("url")) {
                intent2.setData(Uri.parse((String) map.get("url")));
            }
            intent = intent2;
        }
        c11.k(PendingIntent.getActivity(context, 0, intent, 201326592));
        Intent putExtra = new Intent("DeletePlatformNotificationReceiver.ACTION_DELETE").setPackage(context.getPackageName()).putExtra("channel", str).putExtra(ConstantsWs.JSON_ACCOUNT_KEY_CREATED, i11);
        u.i(putExtra, "putExtra(...)");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, putExtra, 201326592);
        u.i(broadcast, "getBroadcast(...)");
        c11.o(broadcast);
        if (str5 != null) {
            new th0.j(c11).b(context, str5, new b(pVar, i11, c11));
            return;
        }
        Integer valueOf = Integer.valueOf(i11);
        Notification c12 = c11.c();
        u.i(c12, "build(...)");
        pVar.invoke(valueOf, c12);
    }

    public static void c(Context context, String str) {
        u.j(context, "context");
        Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
        u.h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        ArrayList e11 = e(notificationManager, str);
        t tVar = new t();
        tVar.g(context.getString(C1987R.string._APP_NAME_));
        Iterator it = e11.iterator();
        while (it.hasNext()) {
            StatusBarNotification statusBarNotification = (StatusBarNotification) it.next();
            tVar.f(statusBarNotification.getNotification().extras.getString(Message.BODY, statusBarNotification.getNotification().extras.getString(RemoteMessageConst.MessageBody.MSG)));
        }
        r c11 = i.c(context, str);
        c11.D(tVar);
        c11.r();
        c11.q(str);
        notificationManager.notify(4325, c11.c());
    }

    private static String d(String str) {
        switch (str.hashCode()) {
            case -1854767153:
                if (str.equals(ConstantsWs.CHANNEL_PUSH_SUPPORT)) {
                    return "other_channel_support";
                }
                break;
            case -1706072195:
                if (str.equals("leaderboard")) {
                    return "leaderboard_channel";
                }
                break;
            case -1636062903:
                if (str.equals(ConstantsWs.CHANNEL_PUSH_WELLNESS_PROGRAMS)) {
                    return "programs_channel_wellness";
                }
                break;
            case -585817260:
                if (str.equals(ConstantsWs.CHANNEL_PUSH_DEVICE_SETUP)) {
                    return "devices_channel_setup";
                }
                break;
            case 3377875:
                if (str.equals(ConstantsWs.CHANNEL_PUSH_NEWS)) {
                    return "products_channel_news";
                }
                break;
            case 16924753:
                if (str.equals(ConstantsWs.CHANNEL_PUSH_RESEARCH_HUB)) {
                    return "research_channel";
                }
                break;
            case 448241545:
                if (str.equals(ConstantsWs.CHANNEL_PUSH_TRANSACTIONAL)) {
                    return "other_channel_transactional";
                }
                break;
            case 545142747:
                if (str.equals(ConstantsWs.CHANNEL_PUSH_INSIGHTS)) {
                    return "motivational_channel_insights";
                }
                break;
            case 756050958:
                if (str.equals(ConstantsWs.CHANNEL_PUSH_PROMOTIONAL)) {
                    return "products_channel_promo";
                }
                break;
        }
        return "other_channel_other";
    }

    public static ArrayList e(NotificationManager notificationManager, String channelId) {
        u.j(channelId, "channelId");
        StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
        u.i(activeNotifications, "getActiveNotifications(...)");
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            if (u.e(statusBarNotification.getNotification().getChannelId(), channelId)) {
                arrayList.add(statusBarNotification);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((StatusBarNotification) next).getId() != 4325) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static final void f(Map map, Context context) {
        u.j(context, "context");
        Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
        u.h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        String str = (String) map.get("channel");
        if (str == null) {
            str = "";
        }
        String d11 = d(str);
        boolean z5 = false;
        if (d11.length() != 0) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            u.i(activeNotifications, "getActiveNotifications(...)");
            int length = activeNotifications.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (u.e(activeNotifications[i11].getNotification().getChannelId(), d11)) {
                    z5 = true;
                    break;
                } else {
                    i11++;
                }
            }
        }
        b(context, map, z5, new h(notificationManager));
        if (z5) {
            Iterator it = e(notificationManager, d11).iterator();
            while (it.hasNext()) {
                a(context, (StatusBarNotification) it.next(), true);
            }
            c(context, d11);
            return;
        }
        notificationManager.cancel(4325);
    }
}
