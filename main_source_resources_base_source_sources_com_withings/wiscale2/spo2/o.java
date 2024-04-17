package com.withings.wiscale2.spo2;

import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import java.util.ArrayList;
import org.joda.time.DateTime;
/* compiled from: SpO2Selector.kt */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final lj0.r f61685a;

    /* renamed from: b  reason: collision with root package name */
    private static final ei0.q f61686b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f61687c = 0;

    static {
        ActivityAggregateManager.Companion.get();
        sw.a.z();
        lj0.r rVar = lj0.r.f79913c;
        if (rVar != null) {
            f61685a = rVar;
            ei0.q qVar = ei0.q.f65441d;
            if (qVar != null) {
                if (qVar != null) {
                    f61686b = qVar;
                    return;
                } else {
                    kotlin.jvm.internal.u.s("instance");
                    throw null;
                }
            }
            kotlin.jvm.internal.u.s("instance");
            throw null;
        }
        kotlin.jvm.internal.u.s("instance");
        throw null;
    }

    public static ArrayList a(long j5, DateTime dateTime) {
        DateTime dateTime2;
        DateTime dateTime3;
        DateTime effectiveStartDate;
        DateTime effectiveStartDate2;
        DateTime withTimeAtStartOfDay = dateTime.withTimeAtStartOfDay();
        DateTime minus = withTimeAtStartOfDay.plusDays(1).minus(1L);
        ei0.q qVar = f61686b;
        qVar.getClass();
        Track C = qVar.C(j5, withTimeAtStartOfDay, null);
        DateTime plusDays = withTimeAtStartOfDay.plusDays(1);
        kotlin.jvm.internal.u.i(plusDays, "plusDays(...)");
        Track C2 = qVar.C(j5, plusDays, null);
        if (C != null && (effectiveStartDate2 = TrackKt.getEffectiveStartDate(C)) != null) {
            dateTime2 = effectiveStartDate2;
        } else {
            dateTime2 = withTimeAtStartOfDay;
        }
        if (C2 != null && (effectiveStartDate = TrackKt.getEffectiveStartDate(C2)) != null) {
            dateTime3 = effectiveStartDate;
        } else {
            dateTime3 = minus;
        }
        kotlin.jvm.internal.u.g(dateTime3);
        return f61685a.a(j5, dateTime2, dateTime3, true);
    }
}
