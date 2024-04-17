package com.withings.wiscale2.deeplink.main;

import android.content.Context;
import android.content.Intent;
import ch.d;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import dp0.j;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import m70.i;
import n20.f;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
/* compiled from: MeasuresDeepLinkHandler.kt */
/* loaded from: classes4.dex */
public final class b implements hm.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f50687a;

    /* renamed from: b  reason: collision with root package name */
    private final i f50688b;

    /* renamed from: c  reason: collision with root package name */
    private final f f50689c;

    /* renamed from: d  reason: collision with root package name */
    private final d f50690d;

    public b(Context context, i userManager, f pwvPlanUseCase, d intentBuilder) {
        u.j(context, "context");
        u.j(userManager, "userManager");
        u.j(pwvPlanUseCase, "pwvPlanUseCase");
        u.j(intentBuilder, "intentBuilder");
        this.f50687a = context;
        this.f50688b = userManager;
        this.f50689c = pwvPlanUseCase;
        this.f50690d = intentBuilder;
    }

    @Override // hm.a
    public final List<String> getCommands() {
        return x.W("timeline/measure", "timeline/measures");
    }

    @Override // hm.a
    public final Intent getIntent(hm.d deeplink) {
        Period period;
        DateTime dateTime;
        DateTime dateTime2;
        String str;
        Integer g02;
        Object obj;
        DateTime dateTime3;
        String str2;
        String str3;
        Long h02;
        String str4;
        u.j(deeplink, "deeplink");
        Map<String, String> d11 = deeplink.d();
        if (d11 != null && (str4 = d11.get(ValidateElement.RangeValidateElement.METHOD)) != null) {
            Period.f43718c.getClass();
            period = Period.a.a(str4);
        } else {
            period = null;
        }
        Map<String, String> d12 = deeplink.d();
        if (d12 != null && (str3 = d12.get("date")) != null && (h02 = j.h0(str3)) != null) {
            dateTime = new DateTime(h02.longValue());
        } else {
            dateTime = null;
        }
        Map<String, String> d13 = deeplink.d();
        if (d13 != null && (str2 = d13.get("dayDate")) != null) {
            dateTime2 = DateTimeFormat.forPattern("yyyy-MM-dd").parseDateTime(str2);
        } else {
            dateTime2 = null;
        }
        Map<String, String> d14 = deeplink.d();
        if (d14 == null || (str = d14.get("type")) == null || (g02 = j.g0(str)) == null) {
            return null;
        }
        int intValue = g02.intValue();
        User f11 = this.f50688b.f();
        if (f11 == null) {
            return null;
        }
        MeasureDeepLinkHandler.f50676b.getClass();
        Iterator it = ((kotlin.collections.c) MeasureDeepLinkHandler.a()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((MeasureDeepLinkHandler) obj).e() == intValue) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        MeasureDeepLinkHandler measureDeepLinkHandler = (MeasureDeepLinkHandler) obj;
        if (measureDeepLinkHandler == null) {
            return null;
        }
        if (dateTime == null) {
            dateTime3 = dateTime2;
        } else {
            dateTime3 = dateTime;
        }
        return measureDeepLinkHandler.b(this.f50687a, f11, dateTime3, period, this.f50689c, this.f50690d);
    }
}
