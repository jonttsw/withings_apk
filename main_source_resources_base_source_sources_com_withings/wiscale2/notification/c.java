package com.withings.wiscale2.notification;

import ah.o;
import ah.t;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.core.app.d0;
import androidx.core.app.h0;
import androidx.core.app.i;
import androidx.core.app.r;
import androidx.core.app.v;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.leaderboard.utils.LeaderboardMessageType;
import com.withings.user.User;
import com.withings.webservices.legacy.sync.SyncJob;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.chat.ui.ChatActivity;
import com.withings.wiscale2.spo2.m;
import dp0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: LeaderboardNotificationManager.kt */
/* loaded from: classes5.dex */
public final class c {

    /* compiled from: LeaderboardNotificationManager.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f58747a;

        static {
            int[] iArr = new int[LeaderboardMessageType.values().length];
            try {
                iArr[LeaderboardMessageType.CUSTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LeaderboardMessageType.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LeaderboardMessageType.CHEER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LeaderboardMessageType.TAUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f58747a = iArr;
        }
    }

    private static androidx.core.app.i b(Context context, th0.d dVar, LeaderboardMessageType leaderboardMessageType) {
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int[] iArr = a.f58747a;
        int i15 = iArr[leaderboardMessageType.ordinal()];
        if (i15 != 3) {
            if (i15 != 4) {
                i11 = C1987R.drawable.ic_stock_sendandroid;
            } else {
                i11 = C1987R.drawable.handdown;
            }
        } else {
            i11 = C1987R.drawable.handup;
        }
        int i16 = iArr[leaderboardMessageType.ordinal()];
        if (i16 != 2) {
            if (i16 != 3) {
                i12 = C1987R.string._LB_TAUNT_;
            } else {
                i12 = C1987R.string._LB_CHEER_;
            }
        } else {
            i12 = C1987R.string._LB_MESSAGE_;
        }
        int i17 = iArr[leaderboardMessageType.ordinal()];
        if (i17 != 2) {
            if (i17 != 3) {
                if (i17 != 4) {
                    str = null;
                } else {
                    str = "LeaderboardNotificationManager.ACTION_TAUNT";
                }
            } else {
                str = "LeaderboardNotificationManager.ACTION_CHEER";
            }
        } else {
            str = "LeaderboardNotificationManager.ACTION_MESSAGE";
        }
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        intent.putExtra("KEY_NOTIFICATION_ID", dVar.a());
        intent.putExtra("KEY_SENDER_ID", dVar.b());
        LeaderboardMessageType leaderboardMessageType2 = LeaderboardMessageType.MESSAGE;
        if (leaderboardMessageType == leaderboardMessageType2) {
            i13 = 33554432;
        } else {
            i13 = 67108864;
        }
        Long b10 = dVar.b();
        if (b10 != null) {
            i14 = (int) b10.longValue();
        } else {
            i14 = 0;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i14, intent, i13);
        u.i(broadcast, "getBroadcast(...)");
        i.a aVar = new i.a(i11, context.getString(i12), broadcast);
        if (leaderboardMessageType == leaderboardMessageType2) {
            d0.d dVar2 = new d0.d();
            dVar2.b(context.getString(C1987R.string._LB_MESSAGE_));
            aVar.a(dVar2.a());
        }
        aVar.c();
        return aVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.core.app.u, androidx.core.app.q] */
    public static Notification c(Context context, Map map, int i11, boolean z5) {
        Long l5;
        Intent intent;
        User e11 = m70.i.b().e();
        u.i(e11, "getMainUser(...)");
        Object obj = map.get(RemoteMessageConst.MessageBody.MSG);
        if (obj == null) {
            obj = "";
        }
        String O = j.O((String) obj, ": /me", "", false);
        String str = (String) map.get("sid");
        String str2 = null;
        if (str != null) {
            l5 = j.h0(str);
        } else {
            l5 = null;
        }
        th0.d dVar = new th0.d(i11, l5, e11, O);
        r c11 = i.c(context, "leaderboard_channel");
        ?? uVar = new androidx.core.app.u();
        uVar.f(O);
        c11.D(uVar);
        c11.m(context.getString(C1987R.string._APP_NAME_));
        c11.l(O);
        c11.e(true);
        Bundle bundle = new Bundle();
        bundle.putAll(dr.b.a(map));
        bundle.putBoolean("leaderboard", true);
        bundle.putInt("id", Integer.parseInt(j.L("888", String.valueOf(i11))));
        c11.b(bundle);
        if (z5) {
            str2 = "leaderboard";
        }
        c11.q(str2);
        h0 m11 = h0.m(context);
        if (str != null) {
            int i12 = ChatActivity.f50318q;
            intent = new Intent(context, ChatActivity.class).putExtra("key_friend_id", Long.valueOf(Long.parseLong(str)));
            u.i(intent, "putExtra(...)");
        } else {
            intent = new Intent(context, MainActivity.class);
        }
        m11.g(intent.putExtra("fromNotification", true));
        c11.k(m11.p(1010101, 201326592));
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent("LeaderboardNotificationManager.ACTION_DELETE").setPackage(context.getPackageName()), 67108864);
        u.i(broadcast, "getBroadcast(...)");
        c11.o(broadcast);
        if (dVar.b() != null) {
            v vVar = new v();
            Iterator it = x.G(x.W(b(context, dVar, LeaderboardMessageType.CHEER), b(context, dVar, LeaderboardMessageType.TAUNT), b(context, dVar, LeaderboardMessageType.MESSAGE))).iterator();
            while (it.hasNext()) {
                androidx.core.app.i iVar = (androidx.core.app.i) it.next();
                if (iVar != null) {
                    c11.f12282b.add(iVar);
                }
                vVar.a(iVar);
            }
            vVar.b(c11);
        }
        Notification c12 = c11.c();
        u.i(c12, "build(...)");
        return c12;
    }

    public static final void d(Map map, Context context) {
        LeaderboardMessageType leaderboardMessageType;
        int i11;
        boolean z5;
        u.j(context, "context");
        User f11 = m70.i.b().f();
        if (f11 == null) {
            return;
        }
        Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
        u.h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        boolean c11 = t.c(notificationManager);
        StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
        u.i(activeNotifications, "getActiveNotifications(...)");
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            if (statusBarNotification.getNotification().extras.containsKey("leaderboard")) {
                arrayList.add(statusBarNotification);
            }
        }
        ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((StatusBarNotification) it.next()).getNotification().extras.getInt("id")));
        }
        int i12 = 0;
        while (arrayList2.contains(Integer.valueOf(i12))) {
            i12++;
        }
        int parseInt = Integer.parseInt("888" + i12);
        final d dVar = new d(notificationManager, parseInt, c(context, map, parseInt, c11), c11, context);
        oi0.b.h().p(((th0.f) o.c(context, th0.f.class)).h().a(f11.q(), false), "leaderboard_notification", new SyncJob.Listener() { // from class: th0.e
            @Override // com.withings.webservices.legacy.sync.SyncJob.Listener
            public final void onSyncJobDone(SyncJob syncJob, int i13) {
                ym0.a whenDone = ym0.a.this;
                u.j(whenDone, "$whenDone");
                whenDone.invoke();
            }
        });
        User e11 = m70.i.b().e();
        u.i(e11, "getMainUser(...)");
        String str = (String) map.get(RemoteMessageConst.MessageBody.MSG);
        Object obj = map.get("sid");
        if (obj == null) {
            obj = String.valueOf(m70.i.b().e().q());
        }
        long parseLong = Long.parseLong((String) obj);
        String str2 = (String) map.get("type");
        if (str2 != null) {
            leaderboardMessageType = LeaderboardMessageType.Companion.fromString(str2);
        } else {
            leaderboardMessageType = null;
        }
        if (leaderboardMessageType != null && str != null) {
            int i13 = a.f58747a[leaderboardMessageType.ordinal()];
            if (i13 == 1 || i13 == 2) {
                String[] strArr = (String[]) new dp0.h(":").e(2, str).toArray(new String[0]);
                if (strArr.length > 1) {
                    str = strArr[1];
                }
            }
            int length = str.length() - 1;
            int i14 = 0;
            boolean z11 = false;
            while (i14 <= length) {
                if (!z11) {
                    i11 = i14;
                } else {
                    i11 = length;
                }
                if (u.l(str.charAt(i11), 32) <= 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z11) {
                    if (!z5) {
                        z11 = true;
                    } else {
                        i14++;
                    }
                } else if (!z5) {
                    break;
                } else {
                    length--;
                }
            }
            String obj2 = str.subSequence(i14, length + 1).toString();
            ob0.b bVar = new ob0.b(DateTime.now().getMillis(), parseLong, e11.q(), new ob0.c(obj2, obj2, 4, leaderboardMessageType));
            new m();
            ob0.a.c(bVar);
        }
    }
}
