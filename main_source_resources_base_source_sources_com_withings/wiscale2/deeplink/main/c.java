package com.withings.wiscale2.deeplink.main;

import android.content.Context;
import android.content.Intent;
import ch.d;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import m70.i;
import n20.f;
import nm0.j;
import org.apache.http.message.TokenParser;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import ub0.a1;
import ub0.g;
import ub0.z;
/* compiled from: WeeklyReportDeepLinkHandler.kt */
/* loaded from: classes4.dex */
public final class c implements hm.a {

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, Integer> f50691e = s0.j(new j("weight/graph", 1), new j("sleep", 44), new j("sleep/day", 44), new j("sleep/week", 6), new j("sleep/month", 7), new j("activity", 36), new j("activity/day", 36), new j("activity/week", 4), new j("activity/month", 5), new j("heart/heart_rate", 11), new j("heart/heart_rate/day", 82), new j("heart/blood_pressure/graph", 9), new j("heart/pwv/graph", 91), new j("heart/spo2/graph", 54), new j("activity/leaderboard", 2), new j("activity/badges", 3));

    /* renamed from: a  reason: collision with root package name */
    private final Context f50692a;

    /* renamed from: b  reason: collision with root package name */
    private final i f50693b;

    /* renamed from: c  reason: collision with root package name */
    private final f f50694c;

    /* renamed from: d  reason: collision with root package name */
    private final d f50695d;

    public c(Context context, i userManager, f pwvPlanUseCase, d intentBuilder) {
        u.j(context, "context");
        u.j(userManager, "userManager");
        u.j(pwvPlanUseCase, "pwvPlanUseCase");
        u.j(intentBuilder, "intentBuilder");
        this.f50692a = context;
        this.f50693b = userManager;
        this.f50694c = pwvPlanUseCase;
        this.f50695d = intentBuilder;
    }

    @Override // hm.a
    public final List<String> getCommands() {
        return x.W("activity", "activity/day", "activity/week", "activity/month", "activity/leaderboard", "activity/badges", "sleep", "sleep/day", "sleep/week", "sleep/month", "weight/graph", "heart/heart_rate", "heart/heart_rate/day", "heart/blood_pressure/graph", "heart/pwv/graph", "heart/spo2/graph", "weight");
    }

    @Override // hm.a
    public final Intent getIntent(hm.d deeplink) {
        Long l5;
        Object obj;
        Period period;
        String c11;
        DateTime dateTime;
        String str;
        Object obj2;
        Object obj3;
        String str2;
        String str3;
        String str4;
        u.j(deeplink, "deeplink");
        Map<String, String> d11 = deeplink.d();
        if (d11 != null && (str4 = d11.get(HealthUserProfile.USER_PROFILE_KEY_USER_ID)) != null) {
            l5 = dp0.j.h0(str4);
        } else {
            l5 = null;
        }
        i iVar = this.f50693b;
        User f11 = iVar.f();
        if (f11 == null) {
            return null;
        }
        long q11 = f11.q();
        if (l5 == null || l5.longValue() != q11) {
            return null;
        }
        Map<String, String> d12 = deeplink.d();
        if (d12 != null && (str3 = d12.get(ValidateElement.RangeValidateElement.METHOD)) != null) {
            Period.f43718c.getClass();
            period = Period.a.a(str3);
        } else {
            Iterator it = ((kotlin.collections.c) a1.f101826a).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    String b10 = ((Period) obj).b();
                    if (b10 != null && (c11 = deeplink.c()) != null && dp0.j.r(c11, b10, false)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            period = (Period) obj;
        }
        Map<String, String> d13 = deeplink.d();
        if (d13 != null && (str2 = d13.get("date")) != null) {
            dateTime = DateTimeFormat.forPattern("yyyy-MM-dd").parseDateTime(str2);
        } else {
            dateTime = null;
        }
        String c12 = deeplink.c();
        if (c12 != null) {
            String L = dp0.j.L("/", c12);
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < L.length(); i11++) {
                char charAt = L.charAt(i11);
                if (!x.W('{', '}', Character.valueOf(TokenParser.DQUOTE)).contains(Character.valueOf(charAt))) {
                    sb2.append(charAt);
                }
            }
            str = sb2.toString();
            u.i(str, "toString(...)");
        } else {
            str = null;
        }
        Iterator<T> it2 = f50691e.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (u.e(str, (String) ((Map.Entry) obj2).getKey())) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return null;
        }
        int intValue = ((Number) entry.getValue()).intValue();
        Context context = this.f50692a;
        if (intValue != 2) {
            if (intValue != 3) {
                MeasureDeepLinkHandler.f50676b.getClass();
                Iterator it3 = ((kotlin.collections.c) MeasureDeepLinkHandler.a()).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj3 = it3.next();
                        if (((MeasureDeepLinkHandler) obj3).e() == intValue) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                MeasureDeepLinkHandler measureDeepLinkHandler = (MeasureDeepLinkHandler) obj3;
                if (measureDeepLinkHandler == null) {
                    return null;
                }
                return measureDeepLinkHandler.b(this.f50692a, f11, dateTime, period, this.f50694c, this.f50695d);
            }
            return new g(context, iVar).getIntent(deeplink);
        }
        return new z(context, iVar).getIntent(deeplink);
    }
}
